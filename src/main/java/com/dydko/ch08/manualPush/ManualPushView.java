package com.dydko.ch08.manualPush;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.progressbar.ProgressBar;
import com.vaadin.flow.router.Route;

@Route("080/manual-push")
public class ManualPushView extends Composite<Component> {

    private VerticalLayout layout;
    private ProgressBar progressBar = new ProgressBar(0, 100);
    private Button button;

    @Override
    protected Component initContent() {
        button = new Button("Run long task", event -> runLongTasks());
        button.setDisableOnClick(true);
        layout = new VerticalLayout(button, new Button("Does this work?",
                e -> addText()), progressBar);
        return layout;
    }

    private void runLongTasks() {
        Notification.show("Running the task...");
        progressBar.setValue(0);
        UI ui = UI.getCurrent();
        new Thread(() -> {
            try {
                for (int i = 0; i <= 100; i++) {
                    Thread.sleep(100);
                    double progress = i;
                    ui.access(() -> {
                        progressBar.setValue(progress);
                        ui.push();
                    });
                }
                ui.access(() -> {
                    Notification.show("Task completed.");
                    button.setEnabled(true);
                    ui.push();
                });

            } catch (InterruptedException e) {
            }
            ;
        }).start();
    }

    private void addText() {
        layout.add(new Paragraph("It works!"));
    }
}
