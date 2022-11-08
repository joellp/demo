package com.example;

import io.micronaut.core.annotation.Introspected;

import javax.validation.constraints.NotNull;

@Introspected
public class Greeting {

    @NotNull
    private final String name;

    public Greeting(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
