package com.dydko.ch04.inputComponents;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import com.vaadin.flow.router.Route;

import java.io.InputStream;
import java.util.Scanner;

@Route("ch04/upload")
public class FileUploadView extends Composite<Component> {
    @Override
    protected Component initContent() {
        MemoryBuffer receiver = new MemoryBuffer();
        Upload upload = new Upload(receiver);
        upload.setAcceptedFileTypes(("text/plain"));
        upload.addSucceededListener(e -> {
            InputStream in = receiver.getInputStream();
            long count = new Scanner(in).findAll("[Aa]").count();
            Notification.show("A x " + count + " times");
        });

        return new VerticalLayout(new Text("Upload a text file: "),
                upload);
    }
}
