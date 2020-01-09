package airportApp.API.springAirportApp.API.manager;

import airportApp.API.springAirportApp.API.dao.CityRepo;
import airportApp.API.springAirportApp.API.dao.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CityManager {
    private CityRepo cityRepo;

    @Autowired
    public CityManager(CityRepo cityRepo)
    {
        this.cityRepo = cityRepo;
    }

    public Optional<City> findById(Integer id)
    {
        return cityRepo.findById(id);
    }

    public Iterable<City> findAll()
    {
        return cityRepo.findAll();
    }
}
