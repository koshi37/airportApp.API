package airportApp.API.springAirportApp.API.api;

import airportApp.API.springAirportApp.API.dao.entity.Seat;
import airportApp.API.springAirportApp.API.manager.SeatManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/seat")
public class SeatApi {

    /*
    @RequestMapping("/users")
    public String getUsers() {
        GetFromContextMock getFromContextMock = new GetFromContextMock(); //dependency inj!!!
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        getFromContextMock.getConnections();
        String jsonToReturn;

        try {
            jsonToReturn = objectMapper.writeValueAsString(getFromContextMock.getConnections());
        } catch (Exception ex) {
            jsonToReturn = "Something went wrong with parsing object to json";
        }

        return jsonToReturn;
    }
     */

    private SeatManager seatManager;

    @Autowired
    public SeatApi(SeatManager seatManager) {
        this.seatManager = seatManager;
    }

    @GetMapping
    @RequestMapping("/all")
    public Iterable<Seat> findAll()
    {
        return seatManager.findAll();
    }

    @GetMapping
    @RequestMapping("/{id}")
    public Optional<Seat> getById(@PathVariable int id)
    {
        return seatManager.findById(id);
    }

    @GetMapping
    @RequestMapping("/notReserved/{id}")
    public Iterable<Seat> getNotReservedSeats(@PathVariable int id)
    {
        List<Seat> seats = new ArrayList<>();
        for(Seat s: seatManager.findAll())
        {
            if(!s.isReserved() && s.getConnection_id() == id)
                seats.add(s);
        }
        return seats;
    }

    @GetMapping
    @RequestMapping("/freeSeatsAmount/{id}")
    public int freeSeatsAmount(@PathVariable int id)
    {
        List<Seat> seats = new ArrayList<>();
        for(Seat s: seatManager.findAll())
        {
            if(!s.isReserved() && s.getConnection_id() == id)
                seats.add(s);
        }
        return seats.size();
    }

    @GetMapping
    @RequestMapping("/reserve/{id}")
    public <Optional>Seat reserveSeat(@PathVariable int id)
    {
        Seat seat = seatManager.findById(id).get();
        seat.setReserved(true);
        seatManager.save(seat);
        return seat;
    }
    
    @RequestMapping("/add")
    @PostMapping
    public Seat addSeat(@RequestBody Seat seat)
    {
        return seatManager.save(seat);
    }

    @PutMapping
    @RequestMapping("/changeState")
    public Seat updateSeat(@RequestBody Seat seat)
    {
        return seatManager.save(seat);
    }

    @DeleteMapping
    @RequestMapping("/del")
    public void deleteUser(@RequestParam int index)
    {
        seatManager.deleteById(index);
    }

}
