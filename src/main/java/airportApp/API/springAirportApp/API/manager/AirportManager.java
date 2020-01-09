package airportApp.API.springAirportApp.API.manager;

import airportApp.API.springAirportApp.API.dao.AirportRepo;
import airportApp.API.springAirportApp.API.dao.entity.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AirportManager {
    private AirportRepo airportRepo;

    @Autowired
    public AirportManager(AirportRepo airportRepo)
    {
        this.airportRepo = airportRepo;
    }

    public Optional<Airport> findById(Integer id)
    {
        return airportRepo.findById(id);
    }

    public Iterable<Airport> findAll()
    {
        return airportRepo.findAll();
    }
}
