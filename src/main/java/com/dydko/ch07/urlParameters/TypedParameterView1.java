package com.dydko.ch07.urlParameters;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.OptionalParameter;
import com.vaadin.flow.router.Route;

@Route("071/typed-parameter")
public class TypedParameterView1 extends Composite<Component>
        implements HasUrlParameter<Integer> {

    private H1 text = new H1();

    @Override
    protected Component initContent() {
        return new VerticalLayout(text);
    }

    @Override
    public void setParameter(BeforeEvent beforeEvent, @OptionalParameter Integer number) {
        text.setText("" + number);
    }

}