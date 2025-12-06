package in.muniraja.runner;

import in.muniraja.SpringBootAppTestApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyAppRunner implements CommandLineRunner {

    private final SpringBootAppTestApplication springBootAppTestApplication;

	private static Logger log = LoggerFactory.getLogger(MyAppRunner.class);

    MyAppRunner(SpringBootAppTestApplication springBootAppTestApplication) {
        this.springBootAppTestApplication = springBootAppTestApplication;
    }
	@Override
	public void run(String... args) throws Exception {
		int a = 10;
		System.out.println("Spring Boot!");
		try {
			log.info("started");
		}
		catch(Exception ex ) {
			ex.printStackTrace();
		}
		log.info("end");
	}

}
