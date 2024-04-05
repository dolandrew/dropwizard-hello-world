package com.example.helloworld.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/")
public class HelloWorldResource {
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldResource.class);

    @GET
    public String helloWorld() {
        LOGGER.info("Received HTTP request");

        return "Hello world!";
    }
}