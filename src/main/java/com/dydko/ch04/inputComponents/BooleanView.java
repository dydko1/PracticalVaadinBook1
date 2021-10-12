package com.dydko.ch04.inputComponents;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;

@Route("ch04/boolean")
public class BooleanView extends Composite<Component> {
    @Override
    public Component initContent() {
        Checkbox checkbox = new Checkbox();
        checkbox.setLabelAsHtml("I'm <b>learning HTML</b> Vaadin! ");
        checkbox.addValueChangeListener(e -> {
            Boolean value = e.getValue();
            Notification.show("Value: " + value);
        });
        return new HorizontalLayout(checkbox);
    }
}
