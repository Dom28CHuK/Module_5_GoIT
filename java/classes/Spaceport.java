package classes;

public class Spaceport {
    private GasStation gasStation = new GasStation();
    private ServiceTower serviceTower = new ServiceTower();
    public void launch() {
        gasStation.refuel();
        serviceTower.service();
    }
}
