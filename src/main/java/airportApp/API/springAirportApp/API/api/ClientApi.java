package airportApp.API.springAirportApp.API.api;

import airportApp.API.springAirportApp.API.dao.entity.Client;
import airportApp.API.springAirportApp.API.dao.entity.Connection;
import airportApp.API.springAirportApp.API.manager.ClientManager;
import airportApp.API.springAirportApp.API.manager.ConnectionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/client")
public class ClientApi {

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

    private ClientManager clientManager;

    @Autowired
    public ClientApi(ClientManager clientManager) {
        this.clientManager = clientManager;
    }

    @GetMapping
    @RequestMapping("/all")
    public Iterable<Client> findAll()
    {
        return clientManager.findAll();
    }

    @GetMapping
    public Optional<Client> getById(@RequestParam int index)
    {
        return clientManager.findById(index);
    }

    @GetMapping
    @RequestMapping("/{login}+{password}")
    public Client getUserByLogin(@PathVariable String login, @PathVariable String password)
    {
        for(Client c: clientManager.findAll())
        {
            if(c.getLogin().equals(login) && c.getPassword().equals(password))
                return c;
        }
        return null;
    }

    @GetMapping
    @RequestMapping("/getPermissions/{id}")
    public boolean getPermissions(@PathVariable int id)
    {
        return clientManager.findById(id).get().isAdmin_permission();
    }

    @GetMapping
    @RequestMapping("/search")
    public List<Client> searchByStartDest(@RequestParam String starting, @RequestParam String destination)
    {
        List<Client> result = new ArrayList<>();

        return  result;
    }
    @PostMapping
    public Client addUser(@RequestBody Client client)
    {
        return clientManager.save(client);
    }

    @PutMapping
    public Client updateUser(@RequestBody Client client)
    {
        return clientManager.save(client);
    }

    @DeleteMapping
    @RequestMapping("/del")
    public void deleteUser(@RequestParam int index)
    {
        clientManager.deleteById(index);
    }

}
