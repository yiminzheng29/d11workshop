package sg.edu.nus.iss.d11workshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Collections;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;

@SpringBootApplication
public class D11workshopApplication {

	public static void main(String[] args) {
		// SpringApplication.run(D11workshopApplication.class, args);

		SpringApplication app = new SpringApplication(D11workshopApplication.class);



		String port = "8080";
		ApplicationArguments cliOpts = new DefaultApplicationArguments(args);
		if (cliOpts.containsOption("port")) {
			port = cliOpts.getOptionValues("port").get(0); // get the first value
		}

		app.setDefaultProperties(Collections.singletonMap("server.port", port));

		System.out.printf("Application started on port %s n", port);
		app.run(args);
	}

}
