package com.claytonpereira.junitProject.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloControllerTest {

	@Test
	void testHello() {
		HelloController controller = new HelloController();
		String response = controller.hello("World");
		assertEquals("Hello WORLD", response);
	}

}
