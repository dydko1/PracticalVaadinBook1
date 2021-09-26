package com.dydko.ch02;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("greeting1")
public class GreetingView1 extends VerticalLayout {
    public GreetingView1() {
        Button button = new Button("Cześć");
        button.addClickListener(e -> Notification.show("Doberek"));
        add(button);
    }
}
