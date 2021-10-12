package com.dydko.ch03;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;

@Route("ch03/horizontal-layout1")
public class HorizontalLayoutView1 extends HorizontalLayout {
    public HorizontalLayoutView1(){
        add(new Paragraph("Paragraph 1"),
                new H1("Horizontal layout"),
                new Paragraph("Paragraph 1"),
                new Paragraph("Paragraph 2"),
                new Button("Button"));
    }
}
