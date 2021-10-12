package com.dydko.ch04.inputComponents;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.listbox.ListBox;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.router.Route;

import java.util.ArrayList;
import java.util.List;

@Route("ch04/select")
public class SingleSelectionView extends Composite<Component> {
    private Service service = new Service();

    @Override
    protected Component initContent() {
        List<Department> list = service.getDepartment();
        ComboBox<Department> comboBox =new ComboBox<>("Departamencik");
        comboBox.setItems(list);
        comboBox.setItemLabelGenerator(dep->{
            String text= dep.getName() + " dep1";
            return text;
        });

        RadioButtonGroup<Department> radio =new RadioButtonGroup<>();
        radio.setItems(list);

        ListBox<Department> listBox =new ListBox<>();
        listBox.setItems(list);

        return new VerticalLayout(comboBox, radio, listBox);
    }
}
