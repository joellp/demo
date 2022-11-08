package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.validation.Valid;


@Controller
@Valid
public class HelloController {

    @Get
    public Greeting getGreeting() {
        return new Greeting("Joell");
    }

    @Get("/error")
    public Greeting getErrorGreeting() {
        return new Greeting(null);
    }

    // This does not compile
    private Greeting generateGreeting(String name) {
        return new Greeting(name);
    }

}
