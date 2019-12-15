package io.ramonak;

import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.server.PWA;
import org.keycloak.KeycloakPrincipal;
import org.keycloak.KeycloakSecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

@Route
@PWA(name = "Demo Spring Boot - Vaadin - Keycloak", shortName = "Demo project")
public class MainView extends VerticalLayout implements RouterLayout{

    public MainView() {
        if (!SecurityContextHolder.getContext().getAuthentication().getPrincipal().equals("anonymousUser")) {
            KeycloakPrincipal<KeycloakSecurityContext> principal = (KeycloakPrincipal<KeycloakSecurityContext>) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            KeycloakSecurityContext keycloakSecurityContext = principal.getKeycloakSecurityContext();
            String preferredUsername = keycloakSecurityContext.getIdToken().getPreferredUsername();
            Anchor logout = new Anchor(
                    "http://localhost:9991/auth/realms/Demo/protocol/openid-connect/logout?redirect_uri=" +
                            "http://localhost:9998/",
                    "Logout");
            add(new HorizontalLayout(new Span(preferredUsername), logout));
        } else {
            add(new Span("No Logged in User"));
        }
    }
}
