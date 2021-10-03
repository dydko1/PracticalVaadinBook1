package com.dydko.ch03;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("composition3")
public class CompositionView3 extends Composite<Component> {
    // The Toolbar class could be moved outside the CompositionView class
    @Override
    protected Component initContent() {
        return new VerticalLayout(
                new Toolbar1(),
                new Paragraph("Paragraph 1"),
                new Paragraph("Paragraph 2"),
                new Paragraph("Paragraph 3")
        );
    }
}