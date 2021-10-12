package com.dydko.ch03;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.Unit;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;

@Route("ch03/padding-margin-spacing")
public class PaddingMarginSpacingView extends Composite<Component> {
    @Override
    protected Component initContent() {
        HorizontalLayout layout = new HorizontalLayout();
        Button button1 = new Button("I'm 100%");
        Button button2 = new Button("I'm 2in%");
        button1.setWidth("50%");
        button2.setWidth("2in");
        layout.getStyle().set("border", "1px solid");
        layout.setPadding(false);
        layout.setMargin(false);
        layout.setMargin(false);
        layout.setSpacing(false);
        layout.add(
                new Paragraph("Toggle:"),
                new Button("Padding", e -> layout.setPadding(!layout.isPadding())),
                new Button("Margin", e -> layout.setMargin(!layout.isMargin())),
                new Button("Spacing", e -> layout.setSpacing(!layout.isSpacing())),
                button1,
                button2,
                new Button("I'm 5 in%", e -> layout.setWidth("5px")),
                new Button("I'm 50 in%", e -> layout.setWidth("50px"))

        );
        layout.setWidthFull();
        return layout;
    }
}
