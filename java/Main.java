import classes.Planets;
import classes.SpaceUtils;
import classes.SpaceportMessages;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Planets.MERCURY);

//        SpaceportMessages.generateLandingMessage("SunFlower", "EarthKeeper", "20:40");

        System.out.println(SpaceUtils.PLANET_COUNT);//8
        System.out.println(SpaceUtils.pluralPlanets(1));//1 planet
        System.out.println(SpaceUtils.pluralPlanets(5));//5 planets
        System.out.println(SpaceUtils.generateStartMessage("Earthkeeper", "20:40"));
    }
}
