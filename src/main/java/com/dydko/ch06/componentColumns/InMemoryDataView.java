package com.dydko.ch06.componentColumns;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import java.util.List;

@Route("ch06/inMemoryData")
public class InMemoryDataView extends Composite<Component> {
    @Override
    protected Component initContent() {
        Grid<Book> grid = new Grid<>();
        grid.addColumn(Book::getTitle).setHeader("Book1").setAutoWidth(true).setSortable(true);
        grid.addColumn(book -> book.getPublisher().getName()).setHeader("Publisher1");
        grid.addColumn(Book::getAuthor).setHeader("Author");
        grid.addColumn(Book::getQuantity).setHeader("Quantity");

        List<Book> books = BookService.findAll();
        grid.setItems(books);

        return new VerticalLayout(grid);
    }
}
