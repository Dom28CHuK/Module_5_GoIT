package classes;

public class Spaceport {
    private GasStation gasStation = new GasStation();
    public void launch() {
        gasStation.refuel();
    }
}
