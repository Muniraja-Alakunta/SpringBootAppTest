package in.muniraja.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyAppRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Welcome to Spring Boot!");
	}

}
