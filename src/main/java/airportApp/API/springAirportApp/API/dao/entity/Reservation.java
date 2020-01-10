package airportApp.API.springAirportApp.API.dao.entity;

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;

@Entity
@Table(name="reservation")
public class Reservation {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer reservation_id;
    @ManyToOne
    @JoinColumn(name="connection_id")
    private Connection connection;
    @OneToOne
    @JoinColumn(name="seat_id")
    private Seat seat;
    private Integer client_id;

    public Reservation(){}

    public Reservation(Integer reservation_id, Connection connection, Seat seat, Integer client_id) {
        this.reservation_id = reservation_id;
        this.connection = connection;
        this.seat = seat;
        this.client_id = client_id;
    }

    public Integer getReservation_id() {
        return reservation_id;
    }

    public Connection getConnection() {
        return connection;
    }

    public Seat getSeat() {
        return seat;
    }

    public Integer getClient_id() {
        return client_id;
    }
}
