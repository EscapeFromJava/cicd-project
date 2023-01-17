package com.example.gateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BackendAdapter {

    private final String REQUEST_ENDPOINT = "/date";
    private final RestTemplate restTemplate;
    @Value("${backend.url}")
    private String backendUrl;

    public BackendAdapter(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    public String getRequest() {
        ResponseEntity<String> response = restTemplate.getForEntity(backendUrl + REQUEST_ENDPOINT, String.class);
        return response.getBody();
    }
}
