package com.dydko.ch02;

import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("ch02/hello-world1")
public class HelloWorldView1 extends VerticalLayout {
    public HelloWorldView1() {
        add(new Paragraph("Witaj Mirosław!!!"));
    }
}
