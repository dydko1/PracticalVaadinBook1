package com.dydko.ch03;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("composition2")
public class CompositionView2 extends Composite<VerticalLayout> {
    public CompositionView2() {
        HorizontalLayout toolbar = new HorizontalLayout(
                new Button("Button 1"),
                new Button("Button 2"),
                new Button("Button 3")
        );

        VerticalLayout mainLayout2 = getContent();
        mainLayout2.add(toolbar,
                new Paragraph("Paragraph 1"),
                new Paragraph("Paragraph 2"),
                new Paragraph("Paragraph 3")
        );
    }
}
