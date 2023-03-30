package classes;

public class Spaceport {
    private GasStation gasStation = new GasStation();
    private ServiceTower serviceTower = new ServiceTower();
    private CompressorStation compressorStation = new CompressorStation();
    private CommandPost commandPost = new CommandPost();
    private Radar radar = new Radar();
    public void launch() {
        gasStation.refuel();
        serviceTower.service();
        compressorStation.compress();
        radar.scan();
        commandPost.command();
    }
}
