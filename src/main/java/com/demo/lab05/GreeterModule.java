package com.demo.lab05;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class GreeterModule extends AbstractModule{
    protected void configure(){
        bind(Greeter.class).annotatedWith(Names.named("CoolGreeter")).toInstance(new CoolGreeter("Cool Greeter"));
        bind(Greeter.class).annotatedWith(Names.named("WarmGreeter")).toInstance(new WarmGreeter("Warm Greeter"));
    }
}
