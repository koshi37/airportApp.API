package airportApp.API.springAirportApp.API;

import java.util.ArrayList;
import java.util.List;

public class GetFromContextMock {
    Connection connection1 = new Connection(1,1500);
    Connection connection2 = new Connection(2,2500);
    Connection connection3 = new Connection(3,3500);
    Connection connection4 = new Connection(4,4500);


    public Iterable<Connection> getConnections() {
        System.out.println("ZAPYTANIE");
        List<Connection> connections = new ArrayList<Connection>();
        connections.add(connection1);
        connections.add(connection2);
        connections.add(connection3);
        connections.add(connection4);

        return connections;
    }


}
