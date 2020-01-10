package airportApp.API.springAirportApp.API.dao;

import airportApp.API.springAirportApp.API.dao.entity.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepo extends CrudRepository<Reservation, Integer> {
}
