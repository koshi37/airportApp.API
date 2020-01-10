package airportApp.API.springAirportApp.API.manager;

import airportApp.API.springAirportApp.API.dao.SeatRepo;
import airportApp.API.springAirportApp.API.dao.entity.Seat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SeatManager {
    private SeatRepo seatRepo;

    @Autowired
    public SeatManager(SeatRepo seatRepo)
    {
        this.seatRepo = seatRepo;
    }

    public Optional<Seat> findById(Integer id)
    {
        return seatRepo.findById(id);
    }

    public Iterable<Seat> findAll()
    {
        return seatRepo.findAll();
    }

    public Seat save(Seat connection)
    {
        return seatRepo.save(connection);
    }

    public void deleteById(Integer id)
    {
        seatRepo.deleteById(id);
    }
}
