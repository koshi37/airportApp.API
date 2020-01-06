package airportApp.API.springAirportApp.API.api;

import airportApp.API.springAirportApp.API.dao.entity.Connection;
import airportApp.API.springAirportApp.API.manager.ConnectionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.*;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/connections")
public class ConnectionApi {

    /*
    @RequestMapping("/users")
    public String getUsers() {
        GetFromContextMock getFromContextMock = new GetFromContextMock(); //dependency inj!!!
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        getFromContextMock.getConnections();
        String jsonToReturn;

        try {
            jsonToReturn = objectMapper.writeValueAsString(getFromContextMock.getConnections());
        } catch (Exception ex) {
            jsonToReturn = "Something went wrong with parsing object to json";
        }

        return jsonToReturn;
    }
     */

    private ConnectionManager connectionManager;

    @Autowired
    public ConnectionApi(ConnectionManager connectionManager) {
        this.connectionManager = connectionManager;
    }

    @GetMapping
    @RequestMapping("/all")
    public Iterable<Connection> findAll()
    {
        return connectionManager.findAll();
    }

    @GetMapping
    public Optional<Connection> getById(@RequestParam int index)
    {
        return connectionManager.findById(index);
    }

    @PostMapping
    public Connection addConnection(@RequestBody Connection connection)
    {
        return connectionManager.save(connection);
    }

    @PutMapping
    public Connection updateConnection(@RequestBody Connection connection)
    {
        return connectionManager.save(connection);
    }

    @DeleteMapping
    @RequestMapping("/del")
    public void deleteConnection(@RequestParam int index)
    {
        connectionManager.deleteById(index);
    }

}
