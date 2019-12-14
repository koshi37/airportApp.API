package airportApp.API.springAirportApp.API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ConnectionsHandler handler = new ConnectionsHandler();
		SpringApplication.run(Application.class, args);
	}

}
