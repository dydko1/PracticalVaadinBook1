package com.dydko.ch07.navigationLiveCycle;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.VaadinSession;

@Route ("ch07/dataNoDataReroute")
public class NoDataView extends Composite<Component> {

    @Override
    protected Component initContent() {
        return new VerticalLayout(
                new H1("Oops! There's no data \uD83D\uDE31"),
                new Button("Create data \uD83E\uDDEF", event -> {
                    VaadinSession.getCurrent().setAttribute("data", "This is the default data");
                    UI.getCurrent().navigate(DataView.class);
                    Notification.show("Default data created");
                })
        );
    }
}
