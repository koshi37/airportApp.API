package airportApp.API.springAirportApp.API.dao;

import airportApp.API.springAirportApp.API.dao.entity.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepo extends CrudRepository<City, Integer> {
}
