package com.demo.lab05;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.name.Named;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	@Inject
	@Named("CoolGreeter")
	private Greeter coolGreeter;
	@Inject
	@Named("WarmGreeter")
	private Greeter warmGreeter;


	public static void main(String[] args) {
		Application app = new Application();
		Module module = new GreeterModule();
		Injector injector = Guice.createInjector(module);
		injector.injectMembers(app);

		app.coolGreeter.greet();
		app.warmGreeter.greet();
	}
}
