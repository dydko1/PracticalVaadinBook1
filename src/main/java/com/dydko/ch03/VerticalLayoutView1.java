package com.dydko.ch03;

import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("ch03/vertical-layout1")
public class VerticalLayoutView1 extends VerticalLayout {
    public VerticalLayoutView1() {
        add(
                new Paragraph("Paragraph1")
        );
    }
}
