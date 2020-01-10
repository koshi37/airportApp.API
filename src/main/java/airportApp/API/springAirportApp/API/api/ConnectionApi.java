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
    @RequestMapping("/{id}")
    public Optional<Connection> getById(@PathVariable int id)
    {
        return connectionManager.findById(id);
    }

    @GetMapping
    @RequestMapping("/search")
    public List<Connection> searchByStartDest(@RequestParam String starting, @RequestParam String destination)
    {
        List<Connection> result = new ArrayList<>();
        for(Connection c: connectionManager.findAll())
        {
            if(c.getStarting_airport().getCity().getName().equals(starting) && c.getDestination_airport().getCity().getName().equals(destination))
            {
                result.add(c);
                System.out.println(c.getStarting_airport().getCity().getName() + " -> "+c.getDestination_airport().getCity().getName());
            }
        }
        return  result;
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
