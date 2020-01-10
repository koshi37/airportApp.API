package airportApp.API.springAirportApp.API.api;

import airportApp.API.springAirportApp.API.dao.entity.Airport;
import airportApp.API.springAirportApp.API.manager.AirportManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/airport")
public class AirportApi {

    private AirportManager airportManager;

    @Autowired
    public AirportApi(AirportManager airportManager) {
        this.airportManager = airportManager;
    }

    @GetMapping
    @RequestMapping("/all")
    public Iterable<Airport> findAll()
    {
        return airportManager.findAll();
    }

    @GetMapping
    @RequestMapping("/{id}")
    public Optional<Airport> getById(@PathVariable int id)
    {
        return airportManager.findById(id);
    }

}