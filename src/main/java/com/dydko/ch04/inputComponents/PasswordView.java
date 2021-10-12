package com.dydko.ch04.inputComponents;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.router.Route;

@Route("ch04/password-field")
public class PasswordView extends Composite<Component> {
    @Override
    public Component getContent() {
        PasswordField passwordField = new PasswordField();
        passwordField.setLabel("Password");
        passwordField.setRevealButtonVisible(true);

        passwordField.addValueChangeListener(e -> {
            String password = e.getValue();
            System.out.println("Password: " +password);
        });

        return new VerticalLayout(passwordField);
    }
}
