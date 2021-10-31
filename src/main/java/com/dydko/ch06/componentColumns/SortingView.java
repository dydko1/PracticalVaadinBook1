package com.dydko.ch06.componentColumns;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import java.util.List;

@Route("ch06/sorting")
public class SortingView extends Composite<Component> {
    @Override
    protected Component initContent(){
        Grid<Book> grid =new Grid<>();
        grid.addColumn(Book::getTitle)
                .setHeader("Book")
                .setAutoWidth(true)
                .setComparator((book1, book2)->book1.getTitle().compareToIgnoreCase(book2.getTitle()));
        grid.addColumn(book -> book.getPublisher().getName()).setHeader("Publisher");
        grid.addColumn(Book::getAuthor).setHeader("Author").setSortable(true);
        grid.addColumn(Book::getQuantity).setHeader("Quantity");

        List<Book> books = BookService.findAll();
        grid.setItems(books);
        return new VerticalLayout(grid);
    }

}
