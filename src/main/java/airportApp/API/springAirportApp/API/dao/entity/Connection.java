package airportApp.API.springAirportApp.API.dao.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="connection")
public class Connection {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer connectionId;
    private Double price;
    private Integer starting_airport_ID;
    private Integer destination_airport_ID;
    private LocalDate flight_date;

    public Connection(){}

    public Connection(Integer connectionId, Double price, Integer starting_airport_ID, Integer destination_airport_ID, LocalDate flight_date) {
        this.connectionId = connectionId;
        this.price = price;
        this.starting_airport_ID = starting_airport_ID;
        this.destination_airport_ID = destination_airport_ID;
        this.flight_date = flight_date;
    }

    public void set(Integer connectionId) {
        this.connectionId = connectionId;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setStarting_airport_ID(Integer starting_airport_ID) {
        this.starting_airport_ID = starting_airport_ID;
    }

    public void setDestination_airport_ID(Integer destination_airport_ID) {
        this.destination_airport_ID = destination_airport_ID;
    }

    public void setFlight_date(LocalDate flight_date) {
        this.flight_date = flight_date;
    }

    public Integer getConnectionId() {
        return connectionId;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getStarting_airport_ID() {
        return starting_airport_ID;
    }

    public Integer getDestination_airport_ID() {
        return destination_airport_ID;
    }

    public LocalDate getFlight_date() {
        return flight_date;
    }
}