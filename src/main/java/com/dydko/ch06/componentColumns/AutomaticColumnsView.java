package com.dydko.ch06.componentColumns;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("ch06/automatic-columns")
public class AutomaticColumnsView extends Composite<Component> {
    @Override
    protected Component initContent() {
        Grid<Book> grid = new Grid<>(Book.class);
        grid.setColumns("title", "publisher.name", "author", "quantity");
        grid.getColumnByKey("title")
                .setHeader("Book")
                .setFooter("text here")
                .setAutoWidth(true);

        grid.getColumnByKey("publisher.name")
                .setHeader("Publisher");

        return new VerticalLayout(grid);
    }
}
