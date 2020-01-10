package airportApp.API.springAirportApp.API.api;

import airportApp.API.springAirportApp.API.dao.entity.Reservation;
import airportApp.API.springAirportApp.API.manager.ReservationManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/reservation")
public class ReservationApi {

    private ReservationManager reservationManager;

    @Autowired
    public ReservationApi(ReservationManager reservationManager) {
        this.reservationManager = reservationManager;
    }

    @GetMapping
    @RequestMapping("/all")
    public Iterable<Reservation> findAll()
    {
        return reservationManager.findAll();
    }

    @GetMapping
    @RequestMapping("/{id}")
    public Optional<Reservation> getById(@PathVariable int id)
    {
        return reservationManager.findById(id);
    }

    @PostMapping
    public Reservation addConnection(@RequestBody Reservation reservation)
    {
        return reservationManager.save(reservation);
    }

    @PutMapping
    public Reservation updateConnection(@RequestBody Reservation reservation)
    {
        return reservationManager.save(reservation);
    }

}
