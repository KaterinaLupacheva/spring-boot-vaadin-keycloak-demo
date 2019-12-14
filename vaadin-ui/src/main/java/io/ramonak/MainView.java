package io.ramonak;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

@Route
@PWA(name = "Demo Spring Boot - Vaadin - Keycloak", shortName = "Demo project")
public class MainView extends VerticalLayout {

    public MainView() {
    }

}
