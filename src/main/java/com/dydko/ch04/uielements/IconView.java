package com.dydko.ch04.uielements;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("ch04/icon")
public class IconView extends Composite<Component> {
    @Override
    protected Component initContent(){
        Icon icon = VaadinIcon.YOUTUBE.create();
        icon.setSize("4em");
        Button button =new Button("Edit", VaadinIcon.EDIT.create());
        return new VerticalLayout(icon,button);
    }
}
