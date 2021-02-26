package com.claytonpereira.junitProject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JunitProjectApplicationTests {
	
	@Test
	void contextLoads() {
		JunitProjectApplication junitProjectApplication = new JunitProjectApplication(); 
	}
}
