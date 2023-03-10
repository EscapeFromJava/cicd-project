package com.example.backend;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.time.LocalDate;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(BackendController.class)
class BackendApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void dateTest() throws Exception {
        mockMvc.perform(get("/date"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(LocalDate.now().toString()))
                .andDo(print());
    }

}
