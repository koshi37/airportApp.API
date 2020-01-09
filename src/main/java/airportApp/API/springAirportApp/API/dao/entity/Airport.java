package airportApp.API.springAirportApp.API.dao.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="airport")
public class Airport {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer airport_id;
    private String address;
    @OneToOne
    @JoinColumn(name="city_id",referencedColumnName = "city_id",unique=true, nullable=false, updatable=false)
    private City city;

    public Airport(){}
    public Airport(Integer airport_id, String address, City city) {
        this.airport_id = airport_id;
        this.address = address;
        this.city = city;
    }

    public Integer getAirport_id() {
        return airport_id;
    }

    public String getAddress() {
        return address;
    }

    public City getCity() {
        return city;
    }
}
