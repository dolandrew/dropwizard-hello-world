package com.example.helloworld;

import io.dropwizard.core.Application;
import io.dropwizard.core.Configuration;
import com.example.helloworld.resources.HelloWorldResource;
import io.dropwizard.core.setup.Environment;

public class HelloWorldApplication extends Application<Configuration>{
    public static void main(String[] args) throws Exception {
//        System.out.println("Hello world!");
        new HelloWorldApplication().run(args);
    }

    @Override
    public void run(Configuration configuration, Environment environment) {
        environment.jersey().register(new HelloWorldResource());
    }
}