package airportApp.API.springAirportApp.API.dao.entity;

import javax.persistence.*;

@Entity
@Table(name="airport")
public class Airport {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer airport_id;
    private String address;
    private Integer city_id;

    public Airport(){}
    public Airport(Integer airport_id, String address, Integer city_id) {
        this.airport_id = airport_id;
        this.address = address;
        this.city_id = city_id;
    }

    public Integer getAirport_id() {
        return airport_id;
    }

    public String getAddress() {
        return address;
    }

    public Integer getCity_id() {
        return city_id;
    }
}
