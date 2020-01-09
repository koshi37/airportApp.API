package airportApp.API.springAirportApp.API.manager;

import airportApp.API.springAirportApp.API.dao.ConnectionRepo;
import airportApp.API.springAirportApp.API.dao.entity.Connection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class ConnectionManager {
    private ConnectionRepo connectionRepo;

    @Autowired
    public ConnectionManager(ConnectionRepo connectionRepo)
    {
        this.connectionRepo = connectionRepo;
    }

    public Optional<Connection> findById(Integer id)
    {
        return connectionRepo.findById(id);
    }

    public Iterable<Connection> findAll()
    {
        return connectionRepo.findAll();
    }

    public Connection save(Connection connection)
    {
        return connectionRepo.save(connection);
    }

    public void deleteById(Integer id)
    {
        connectionRepo.deleteById(id);
    }

    /*
    //wywołane przy starcie apki
    @EventListener(ApplicationReadyEvent.class)
    public void fillDB()
    {
        save(new Connection(1, 1500.0, 1, 2, LocalDate.of(2019, 10, 19)));
        save(new Connection(2, 2500.0, 3, 2, LocalDate.of(2019, 10, 1)));
        save(new Connection(3, 1100.0, 1, 3, LocalDate.of(2019, 12, 15)));
    }
     */
}
