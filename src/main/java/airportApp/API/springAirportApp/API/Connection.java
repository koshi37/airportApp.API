package airportApp.API.springAirportApp.API;

import java.time.LocalDate;
import java.util.Date;

public class Connection {
    Integer connectionId;
    Integer price;
    LocalDate connectionDate;

    Connection(Integer connectionId, Integer price) {
        this.connectionId = connectionId;
        this.price = price;
        this.connectionDate = LocalDate.now();


    }
}