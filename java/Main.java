import classes.SpaceShip;

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

        ship.setName("Voyager");
        ship.setSerialNumber("SN506788");

        //Name is Voyager, serial number is SN504030
        ship.printInfo();
    }
}
