package airportApp.API.springAirportApp.API.dao.entity;

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
    @OneToOne
    @JoinColumn(name="client_id")
    private Client client;

    public Reservation(){}

    public Reservation(Integer reservation_id, Connection connection, Seat seat, Client client) {
        this.reservation_id = reservation_id;
        this.connection = connection;
        this.seat = seat;
        this.client = client;
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

    public Client getClient() {
        return client;
    }
}
