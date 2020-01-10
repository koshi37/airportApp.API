package airportApp.API.springAirportApp.API.api;

import airportApp.API.springAirportApp.API.dao.entity.City;
import airportApp.API.springAirportApp.API.manager.CityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/city")
public class CityApi {

    private CityManager cityManager;

    @Autowired
    public CityApi(CityManager cityManager) {
        this.cityManager = cityManager;
    }

    @GetMapping
    @RequestMapping("/all")
    public Iterable<City> findAll()
    {
        return cityManager.findAll();
    }

    @GetMapping
    @RequestMapping("/{id}")
    public Optional<City> getById(@PathVariable int id)
    {
        return cityManager.findById(id);
    }

}
