package io.ramonak;

import org.keycloak.adapters.springsecurity.client.KeycloakRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private final KeycloakRestTemplate keycloakRestTemplate;

    public ClientService(KeycloakRestTemplate keycloakRestTemplate) {
        this.keycloakRestTemplate = keycloakRestTemplate;
    }

    public List<String> getMonths() {
        return keycloakRestTemplate.exchange("http://localhost:9999/months",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<String>>() {})
                .getBody();
    }

    public String getAdminPage() {
        return keycloakRestTemplate.exchange("http://localhost:9999/admin",
                HttpMethod.GET,
                null,
                String.class)
                .getBody();
    }
}
