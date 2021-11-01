package com.dydko.ch07.login;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.RouterLayout;

public class MainLayout extends Composite<Component> implements RouterLayout {

    private VerticalLayout container = new VerticalLayout();

    @Override
    protected Component initContent() {
        Div header = new Div(new Text("Chapter 77"));
        header.setWidthFull();
        header.getStyle().set("font-size", "2em");
        header.getStyle().set("font-weight", "bold");
        header.getStyle().set("color", "white");
        header.getStyle().set("background-color", "#002211");

        Div footer = new Div(new Text("Building UIs in Java is awesome, Miro"));
        footer.setWidthFull();
        footer.getStyle().set("color", "white");
        footer.getStyle().set("background-color", "#001133");

        return new VerticalLayout(header, container, footer);
    }

    @Override
    public void showRouterLayoutContent(HasElement content) {
        container.removeAll();
        System.out.println("Container removed");
        container.getElement().appendChild(content.getElement());
    }
}
