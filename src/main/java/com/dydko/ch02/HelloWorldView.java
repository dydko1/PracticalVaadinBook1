package com.dydko.ch02;

import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("hello-world1")
public class HelloWorldView extends VerticalLayout {
    public HelloWorldView() {
        add(new Paragraph("Witaj Mirosław!!!"));
    }
}
