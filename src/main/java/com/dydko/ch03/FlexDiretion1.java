package com.dydko.ch03;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.router.Route;

@Route("ch03/flex-wrap")
public class FlexDiretion1 extends Composite<Component> {
    protected Component initContent() {
        FlexLayout layout = new FlexLayout();
        for (int i = 0; i < 100; i++) {
            layout.add(new Button("Button " + i));
        }
        layout.setFlexDirection(FlexLayout.FlexDirection.ROW);
        layout.setFlexWrap(FlexLayout.FlexWrap.WRAP);
        layout.setAlignContent(FlexLayout.ContentAlignment.SPACE_BETWEEN);

        layout.setSizeFull();
        return layout;
    }

}
