package airportApp.API.springAirportApp.API.manager;

import airportApp.API.springAirportApp.API.dao.ClientRepo;
import airportApp.API.springAirportApp.API.dao.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientManager {
    private ClientRepo clientRepo;

    @Autowired
    public ClientManager(ClientRepo clientRepo)
    {
        this.clientRepo = clientRepo;
    }

    public Optional<Client> findById(Integer id)
    {
        return clientRepo.findById(id);
    }

    public Iterable<Client> findAll()
    {
        return clientRepo.findAll();
    }

    public Client save(Client connection)
    {
        return clientRepo.save(connection);
    }

    public void deleteById(Integer id)
    {
        clientRepo.deleteById(id);
    }
}
