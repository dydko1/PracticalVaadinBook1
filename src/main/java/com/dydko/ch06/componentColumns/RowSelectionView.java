package com.dydko.ch06.automaticColumns;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.atmosphere.interceptor.AtmosphereResourceStateRecovery;

import java.util.List;

@Route("ch06/rowSelection")
public class RowSelectionView extends Composite<Component> {
    @Override

    protected Component initContent() {
        Button increaseQuantity = new Button("Increase quantity");

        increaseQuantity.setEnabled(false);

        Grid<Book> grid = new Grid<>();
        grid.addColumn(Book::getTitle)
                .setHeader("Book")
                .setAutoWidth(true)
                .setComparator((book1, book2) -> book1.getTitle().compareToIgnoreCase(book2.getTitle()));
        grid.addColumn(book -> book.getPublisher().getName()).setHeader("Publisher");
        grid.addColumn(Book::getAuthor).setHeader("Author").setSortable(true);
        grid.addColumn(Book::getQuantity).setHeader("Quantity");
        //grid.setSelectionMode(Grid.SelectionMode.MULTI);
        updateGrid(grid);

        grid.addSelectionListener((e -> {
            boolean enable = e.getFirstSelectedItem().isPresent();
            increaseQuantity.setEnabled(enable);
        }));

        increaseQuantity.addClickListener(e ->
                grid.asSingleSelect().getOptionalValue().ifPresent(
                        book -> {
                            BookService.increaseQuantity(book);
                            updateGrid(grid);
                        }
                ));

        return new VerticalLayout(increaseQuantity, grid);
    }

    private void updateGrid(Grid<Book> grid) {
        List<Book> books =BookService.findAll();
        grid.setItems(books);
    }

}
