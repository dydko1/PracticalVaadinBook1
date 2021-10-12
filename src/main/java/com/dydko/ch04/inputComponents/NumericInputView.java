package com.dydko.ch04.inputComponents;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.router.Route;

@Route("ch04/numericInput")
public class NumericInputView extends Composite<Component> {
    @Override
    protected Component initContent() {

        NumberField numberField = new NumberField("Rating");
        numberField.setHasControls(true);
        numberField.setMin(0.0);
        numberField.setMax(5.0);
        numberField.setStep(0.1);
        numberField.setClearButtonVisible(true);
        numberField.setHelperText("From 0 to 0.5");

        numberField.addValueChangeListener(e -> {
            Double value = e.getValue();
            Notification.show("Your value is: " + value);
        });

        return new VerticalLayout(numberField);
    }


}
