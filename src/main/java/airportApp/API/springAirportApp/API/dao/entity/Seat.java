package airportApp.API.springAirportApp.API.dao.entity;

import javax.persistence.*;

@Entity
@Table(name="seat")
public class Seat {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer seat_id;
    private Integer row;
    private Integer number;
    private Integer connection_id;
    private boolean reserved;

    public Seat(Integer seat_id, Integer row, Integer number, Integer connection_id, boolean reserved) {
        this.seat_id = seat_id;
        this.row = row;
        this.number = number;
        this.connection_id = connection_id;
        this.reserved = reserved;
    }

    public Seat() {
    }

    public Integer getSeat_id() {
        return seat_id;
    }

    public Integer getRow() {
        return row;
    }

    public Integer getNumber() {
        return number;
    }

    public Integer getConnection_id() {
        return connection_id;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }
}
