package airportApp.API.springAirportApp.API.manager;

import airportApp.API.springAirportApp.API.dao.ReservationRepo;
import airportApp.API.springAirportApp.API.dao.entity.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReservationManager {
    private ReservationRepo reservationRepo;

    @Autowired
    public ReservationManager(ReservationRepo airportRepo)
    {
        this.reservationRepo = airportRepo;
    }

    public Optional<Reservation> findById(Integer id)
    {
        return reservationRepo.findById(id);
    }

    public Iterable<Reservation> findAll()
    {
        return reservationRepo.findAll();
    }

    public Reservation save(Reservation reservation)
    {
        return reservationRepo.save(reservation);
    }
}
