package com.claytonpereira.junitProject.controller;

public class HelloController {
	
  public String hello(String name) {
	return String.format("Hello %S", name);
  }

}
