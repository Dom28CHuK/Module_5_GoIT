import classes.Engine;
import classes.SpaceRocketLauncher;
import classes.SpaceShip;
import classes.XFuelEngine;

public class Main {
    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip();
//        ship.setName("Walker");
//        System.out.println(ship.getName()); //Should be Walker
//
//        ship.setName("");
//        System.out.println(ship.getName()); //Should be Walker, empty value ignored
//
//        ship.setName("Voyager ".repeat(100));
//        System.out.println(ship.getName()); //Should be Walker, too long value ignored

//        ship.setSerialNumber("SN506788");
//        System.out.println(ship.getSerialNumber()); //Should be SN506788
//
//        ship.setSerialNumber("EE123456");
//        System.out.println(ship.getSerialNumber()); //Should be SN506788 - old value

//        ship.setName("Voyager");
//        ship.setSerialNumber("SN506788");
//
//        //Name is Voyager, serial number is SN504030
//        ship.printInfo();

//        SpaceRocketLauncher launcher = new SpaceRocketLauncher();
//        launcher.setBigRocketCount(5);
//        launcher.setSmallRocketCount(35);
//
//        System.out.println("Power is " + launcher.getTotalPower());
//
//        launcher.launchBigRocket();
//        System.out.println("Big rocket count is " + launcher.getBigRocketCount());
//
//        launcher.launchSmallRocket();
//        System.out.println("Small rocket count is " + launcher.getSmallRocketCount());
//
//        System.out.println("Power is " + launcher.getTotalPower());

//        System.out.println(new Engine().getFuelType());

        Engine basicEngine = new Engine();
        System.out.println(basicEngine.getFuelType()); //A500

        Engine xFuelEngine = new XFuelEngine();
        System.out.println(xFuelEngine.getFuelType()); //XFuel


    }
}
