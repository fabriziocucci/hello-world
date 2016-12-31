package com.github.fabriziocucci.microservice.helloworld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class HelloWorldApplication extends ResourceConfig {

	public HelloWorldApplication() {
		register(HelloWorldResource.class);
	}
	
	@Path("/hello-world")
	public static class HelloWorldResource {
		
		@GET
		public String sayHelloWorld() {
			return "Hello World!";
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		GrizzlyHttpServerFactory.createHttpServer(UriBuilder.fromPath("http://0.0.0.0:8181").build(), new HelloWorldApplication()).start();
	}
	
}
