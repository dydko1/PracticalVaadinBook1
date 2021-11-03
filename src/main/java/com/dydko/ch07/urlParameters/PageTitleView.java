package com.dydko.ch07.urlParameters;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("This is the title, Miro")
@Route("ch071/pageTitle")
public class PageTitleView extends Composite<Component> {
    @Override
    protected Component initContent() {
        return new H1("Doberek Miro");
    }
}
