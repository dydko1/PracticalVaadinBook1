package com.dydko.ch07.urlParameters;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.Location;
import com.vaadin.flow.router.Route;

import java.util.List;
import java.util.Map;

@Route("ch071/queryParameter")
public class QueryParameterView extends Composite<Component> implements BeforeEnterObserver {

    private H1 text =new H1("(No user ID)");

    @Override
    protected Component initContent() {
        return new HorizontalLayout(text);
    }

    @Override
    public void beforeEnter(BeforeEnterEvent event) {
        Location location =event.getLocation();
        Map<String, List<String>> list = location.getQueryParameters().getParameters();
        List<String> userIds=list.get("userId");
        if(!list.isEmpty())
            text.setText(userIds.get(0));

    }
}
