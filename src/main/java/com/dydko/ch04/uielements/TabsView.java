package com.dydko.ch04.uielements;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.Route;

@Route("ch04/tabs")
public class TabsView extends Composite<Component> {
    @Override
    protected Component initContent() {
        VerticalLayout tabContainer = new VerticalLayout();

        Tab order = new Tab("Order");
        Tab delivery = new Tab("Delivery");
        Tabs tabs = new Tabs(order, delivery);

        tabs.addSelectedChangeListener(e -> {
            Tab selected = e.getSelectedTab();
            tabContainer.removeAll();

            if (order.equals(selected)) {
                tabContainer.add(buildOrderTab());
            } else {
                tabContainer.add(buildDeliveryTab());
            }
        });
        return new VerticalLayout(tabs, tabContainer);
    }

    private Component buildOrderTab() {
        return new Text("Order info");
    }

    private Component buildDeliveryTab() {
        return new Text("Delivery tab");
    }
}
