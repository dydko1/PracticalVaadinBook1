package com.dydko.ch04.interactionComponents;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import java.time.LocalTime;

@Route("ch04/button")
public class ButtonView extends Composite<Component> {
    @Override
    protected Component initContent(){
        Button button=new Button("Time in the server", e->{
            Notification.show("Sure: " + LocalTime.now());
            e.getSource().setVisible(true);
        });
        return new VerticalLayout(button);
    }
}
