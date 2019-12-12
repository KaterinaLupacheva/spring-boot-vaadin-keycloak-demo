package io.ramonak;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.notification.Notification;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

import java.util.List;
import java.util.stream.Collectors;

@Route
@PWA(name = "Demo Spring Boot - Vaadin - Keycloak", shortName = "Demo project")
public class MainView extends VerticalLayout {

    public MainView() {
    }

}
