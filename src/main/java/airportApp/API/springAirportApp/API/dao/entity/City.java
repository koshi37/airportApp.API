package airportApp.API.springAirportApp.API.dao.entity;

import javax.persistence.*;

@Entity
@Table(name="city")
public class City {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer city_id;
    private String name;

    public City(){}

    public City(Integer city_id, String name) {
        this.city_id = city_id;
        this.name = name;
    }

    public Integer getCity_id() {
        return city_id;
    }

    public String getName() {
        return name;
    }
}

