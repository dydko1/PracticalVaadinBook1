package com.dydko.ch03;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("ch03/scroller")
public class ScrollerView extends Composite<Component> {
    @Override
    protected Component initContent() {
        VerticalLayout layout = new VerticalLayout();
        for (int i = 0; i < 100; i++) {
            layout.add(new Button("Button " + i));
        }
        Scroller scroller = new Scroller(layout);
        scroller.setHeight("400px");
        scroller.getStyle().set("border", "1px solid");
        return scroller;
    }
}
