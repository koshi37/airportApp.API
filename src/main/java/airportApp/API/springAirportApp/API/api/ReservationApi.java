package airportApp.API.springAirportApp.API.api;

import airportApp.API.springAirportApp.API.dao.entity.Reservation;
import airportApp.API.springAirportApp.API.manager.ReservationManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
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

    @GetMapping
    @RequestMapping("/getReservationsForUser/{id}")
    public Iterable<Reservation> getReservationsForUser(@PathVariable int id)
    {
        List<Reservation> reservations = new ArrayList<>();
        for(Reservation r: reservationManager.findAll())
        {
            if(r.getClient_id() == id)
                reservations.add(r);
        }
        return reservations;
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
