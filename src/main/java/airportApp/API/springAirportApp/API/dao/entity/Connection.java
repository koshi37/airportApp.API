package airportApp.API.springAirportApp.API.dao.entity;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name="connection")
public class Connection {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer connectionId;
    @Column
    private Double price;
    @ManyToOne
    @JoinColumn(name = "starting_airport_id")
    private Airport starting_airport;
    @ManyToOne
    @JoinColumn(name = "destination_airport_id")
    private Airport destination_airport;
    @Column
    private LocalDateTime flight_date;

    public Connection(){}

    public Connection(Integer connectionId, Double price, Airport starting_airport, Airport destination_airport, LocalDateTime flight_date) {
        this.connectionId = connectionId;
        this.price = price;
        this.starting_airport = starting_airport;
        this.destination_airport = destination_airport;
        this.flight_date = flight_date;
    }

    public void set(Integer connectionId) {
        this.connectionId = connectionId;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setStarting_airport(Airport starting_airport) {
        this.starting_airport = starting_airport;
    }

    public void setDestination_airport(Airport destination_airport) {
        this.destination_airport = destination_airport;
    }

    public void setFlight_date(LocalDateTime flight_date) {
        this.flight_date = flight_date;
    }

    public Integer getConnectionId() {
        return connectionId;
    }

    public Double getPrice() {
        return price;
    }

    public Airport getStarting_airport() {
        return starting_airport;
    }

    public Airport getDestination_airport() {
        return destination_airport;
    }

    public LocalDateTime getFlight_date() {
        return flight_date;
    }
}