package com.dydko.ch08.withPush;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("080/with-push")
public class withPushView extends Composite<Component> {
    private VerticalLayout layout;

    @Override
    protected Component initContent() {
        layout = new VerticalLayout(
                new Button("Run long task", e -> runLongTasks()),
                new Button("Does this work?", e -> addText()));
        return layout;
    }

    private void runLongTasks() {
        Notification.show("Running the task...");
        UI ui = UI.getCurrent();
        new Thread(() -> {
            try {
                Thread.sleep(1000);
                ui.access(() -> {
                    Notification.show("Task completed.");
                });
            } catch (InterruptedException ignored) {
            }
        }).start();
    }

    private void addText() {
        layout.add(new Paragraph("It works!!"));
    }
}
