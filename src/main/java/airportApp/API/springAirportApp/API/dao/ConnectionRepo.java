package airportApp.API.springAirportApp.API.dao;

import airportApp.API.springAirportApp.API.dao.entity.Connection;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConnectionRepo extends CrudRepository<Connection, Integer> {
}
