package airportApp.API.springAirportApp.API.dao;

import airportApp.API.springAirportApp.API.dao.entity.Airport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepo extends CrudRepository<Airport, Integer> {
}
