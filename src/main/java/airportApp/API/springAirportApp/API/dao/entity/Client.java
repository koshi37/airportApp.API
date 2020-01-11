package airportApp.API.springAirportApp.API.dao.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="client")
public class Client {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer client_id;
    private String login;
    private String password;
    private String name;
    private String surname;
    private String email;
    private boolean admin_permission;

    public Client(){}

    public Client(Integer client_id, String login, String password, String name, String surname, String email, boolean admin_permission) {
        this.client_id = client_id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.admin_permission = admin_permission;
    }

    public Integer getClient_id() {
        return client_id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public boolean isAdmin_permission() {
        return admin_permission;
    }
}
