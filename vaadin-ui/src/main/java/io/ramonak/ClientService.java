package io.ramonak;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ClientService {

    private RestTemplate restTemplate = new RestTemplate();

    public List<String> getMonths() {
        return restTemplate.exchange("http://localhost:9999/months",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<String>>() {})
                .getBody();
    }

    public String getAdminPage() {
        return restTemplate.exchange("http://localhost:9999/admin",
                HttpMethod.GET,
                null,
                String.class)
                .getBody();
    }
}
