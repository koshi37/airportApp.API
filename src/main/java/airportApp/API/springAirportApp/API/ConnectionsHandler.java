package airportApp.API.springAirportApp.API;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ConnectionsHandler {

    @GetMapping("/users")
    public List<Connection> getUsers() {
        GetFromContextMock getFromContextMock = new GetFromContextMock(); //dependency inj!!!
        return (List<Connection>) getFromContextMock.getConnections();
    }

}
