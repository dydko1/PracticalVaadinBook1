package com.dydko.ch06.componentColumn;

import com.dydko.ch06.componentColumns.Book;
import com.dydko.ch06.componentColumns.BookService;
import com.dydko.ch06.componentColumns.Publisher;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.progressbar.ProgressBar;
import com.vaadin.flow.router.Route;

import java.util.List;

@Route("ch06/component-column1")
public class ColumnComponentView1 extends Composite<Component> {
    @Override
    protected Component initContent() {
        Grid<Book> grid = new Grid<>();
        grid.addColumn(Book::getTitle).setHeader("Book").setAutoWidth(true).setSortable(true);
        grid.addColumn(book -> book.getPublisher().getName()).setHeader("Publisher").setSortable(true);
        grid.addColumn(Book::getAuthor).setHeader("Author").setSortable(true);
        grid.addComponentColumn(
                book -> new ProgressBar(0, 50, book.getQuantity()));
        grid.addComponentColumn(book -> new Button(VaadinIcon.PLUS.create(), event -> {
            BookService.increaseQuantity(book);
        }));

        updateGrid(grid);
        return new VerticalLayout(grid);
    }

    private void updateGrid(Grid<Book> grid) {
        List<Book> books = BookService.findAll();

        grid.setItems(books);
    }
}
