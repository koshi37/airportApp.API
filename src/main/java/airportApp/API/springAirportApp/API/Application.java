package airportApp.API.springAirportApp.API;

import airportApp.API.springAirportApp.API.api.ConnectionApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		//ConnectionApi handler = new ConnectionApi();
		SpringApplication.run(Application.class, args);
	}

}
