package com.dydko.ch03;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class Toolbar1 extends Composite<Component> {
    @Override
    protected Component initContent() {
        return new HorizontalLayout(
                new Button("Button 111"),
                new Button("Button 222"),
                new Button("Button 333")
        );

    }
}
