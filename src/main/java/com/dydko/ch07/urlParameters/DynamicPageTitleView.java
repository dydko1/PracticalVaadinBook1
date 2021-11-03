package com.dydko.ch07.urlParameters;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.router.HasDynamicTitle;
import com.vaadin.flow.router.Route;

import java.time.LocalTime;

@Route("ch071/dynamicPageTitle")
public class DynamicPageTitleView extends Composite<Component> implements HasDynamicTitle {

    @Override
    protected Component initContent() {
        return new H1("Hello again, Miro!!!");
    }

    @Override
    public String getPageTitle() {
        return "Title at " + LocalTime.now()+" Miroo!";
    }
}
