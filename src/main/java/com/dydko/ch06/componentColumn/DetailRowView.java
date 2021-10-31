package com.dydko.ch06.componentColumn;

import com.dydko.ch06.componentColumns.Book;
import com.dydko.ch06.componentColumns.BookService;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.ColumnPathRenderer;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.progressbar.ProgressBar;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.router.Route;

import java.util.List;

@Route("ch06/details-row")
public class DetailRowView extends Composite<Component> {
    @Override
    protected Component initContent() {
        Grid<Book> grid = new Grid<>();

        grid.addColumn(Book::getTitle).setHeader("Book").setAutoWidth(true).setSortable(true);
        grid.addColumn(book -> book.getPublisher().getName()).setHeader("Publisher").setSortable(true);
        grid.addColumn(Book::getAuthor).setHeader("Author").setSortable(true);
        grid.addComponentColumn(book -> new ProgressBar(0,50,book.getQuantity())).setHeader("Quantity")
                .setSortable(true)
                .setComparator((b1,b2)->Integer.compare(b1.getQuantity(), b2.getQuantity()));

        grid.setItemDetailsRenderer(
                new ComponentRenderer<>(book->new VerticalLayout(
                        new Text(book.getAuthor()),
                        new Button("Quantity", VaadinIcon.ARROW_UP.create(), e->{
                            BookService.increaseQuantity(book);
                            updateGrid(grid);
                            grid.select(book);
                        })
                ))
        );

        updateGrid(grid);
        return new VerticalLayout(grid);
    }

    private void updateGrid(Grid<Book> grid1) {
        List<Book> books = BookService.findAll();
        grid1.setItems(books);
    }
}
