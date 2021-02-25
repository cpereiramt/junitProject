package com.claytonpereira.junitProject.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


@ExtendWith(SpringExtension.class)
@WebMvcTest(HelloController.class)
class HelloControllerWebTest {
   
	
	@Autowired
	private MockMvc mvc;
	@Test
	void testHello() {
		RequestBuilder request = MockMvcRequestBuilders.get("/hello");
		try {
			MvcResult result = mvc.perform(request).andReturn();
			assertEquals("Hello World", result.getResponse().getContentAsString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testHelloWithName() throws Exception {
		mvc.perform(get("/hello?name=clayton"))
		.andExpect(content().string("Hello clayton"));
	}

}
