package com.example.codurance.Marvel.Controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
public class HeroControllerShould {

    @Autowired
    MockMvc mockMvc;

    @Test
    void
    get_heroes() throws Exception {
        mockMvc.perform(get("/heroes"))
                .andExpect(status().isOk());
    }

    @Test
    void
    failing_test() {
        fail();
    }
}
