package com.claytonpereira.junitProject.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HelloControllerTest {

	@Test
	@DisplayName("testing if the result is equal default")
	void testHello() {
		HelloController controller = new HelloController();
		String response = controller.hello("World");
		// creating group of assertions 
		Assertions.assertAll(() -> assertEquals("Hello World", response));
	}

}
