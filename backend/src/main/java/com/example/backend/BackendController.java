package com.example.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class BackendController {

    @GetMapping("/date")
    public String getDate() {
        return LocalDate.now().toString();
    }

}
