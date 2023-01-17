package com.example.gateway;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GatewayController {

    private final BackendAdapter adapter;
    @Value("${instance.id}")
    private int instanceId;
    @Value("${secret}")
    private String secret;

    @GetMapping("/")
    public String getRequest() {
        return String.format("Current date %s (gateway %d, secret %s)", adapter.getRequest(), instanceId, secret);
    }

}
