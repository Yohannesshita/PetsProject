package com.example.gtommee.rest_tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
@WebMvcTest
@SpringBootTest
class RestTutorialApplicationTests {
    @Autowired
    MockMvc mockMvc;
	@Test
	void contextLoads() {
	}

}
