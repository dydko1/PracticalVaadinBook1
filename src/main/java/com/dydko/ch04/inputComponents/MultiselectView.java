package com.dydko.ch04.inputComponents;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.checkbox.CheckboxGroup;
import com.vaadin.flow.component.listbox.MultiSelectListBox;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import java.util.Set;

@Route("ch04/multiview")
public class MultiselectView extends Composite<Component> {
    Service service = new Service();

    @Override
    protected Component initContent() {
        CheckboxGroup<Department> checkbox = new CheckboxGroup<>();
        checkbox.setItems(service.getDepartment());

        MultiSelectListBox listBox = new MultiSelectListBox();
        listBox.setItems(service.getDepartment());

        return new VerticalLayout(checkbox, listBox);
    }

}
