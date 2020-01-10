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
    public Optional<Seat> getById(@RequestParam int index)
    {
        return seatManager.findById(index);
    }

    @GetMapping
    @RequestMapping("/notReserved")
    public Iterable<Seat> getNotReservedSeats()
    {
        List<Seat> seats = new ArrayList<>();
        for(Seat s: seatManager.findAll())
        {
            if(!s.isReserved())
                seats.add(s);
        }
        return seats;
    }

    @PostMapping
    public Seat addUser(@RequestBody Seat seat)
    {
        return seatManager.save(seat);
    }

    @PutMapping
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
