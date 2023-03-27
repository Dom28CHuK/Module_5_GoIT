import classes.Planets;
import classes.Point;
import classes.SpaceUtils;
import classes.SpaceportMessages;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Planets.MERCURY);

//        SpaceportMessages.generateLandingMessage("SunFlower", "EarthKeeper", "20:40");

//        System.out.println(SpaceUtils.PLANET_COUNT);//8
//        System.out.println(SpaceUtils.pluralPlanets(1));//1 planet
//        System.out.println(SpaceUtils.pluralPlanets(5));//5 planets
//        System.out.println(SpaceUtils.generateStartMessage("Earthkeeper", "20:40"));

        Point p1 = new Point();
        p1.setX(1);
        p1.setY(1);
        p1.setZ(1);

        Point p2 = new Point();
        p2.setX(1);
        p2.setY(1);
        p2.setZ(1);

        System.out.println(p1.equals(p2)); //Will be false
    }
}
