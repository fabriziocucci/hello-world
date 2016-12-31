package com.github.fabriziocucci.microservice.helloworld;

import static org.junit.Assert.*;

import javax.ws.rs.core.Application;

import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

public class HelloWorldResourceTest extends JerseyTest {

	@Override
	protected Application configure() {
		return new HelloWorldApplication();
	}
	
	@Test
	public void test() {
		String response = target("/hello-world").request().get(String.class);
		assertEquals("Hello World!", response);
	}

}
