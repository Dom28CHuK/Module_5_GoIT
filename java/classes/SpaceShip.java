package classes;

import java.util.Objects;

public class SpaceShip {
    private String name;
    private String serialNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
//        if (name != null && name.trim().length() > 0 && name.trim().length() <= 100) {
//            this.name = name.trim();
//        }
        if (name.isBlank() || name.length() > 100) {
            return;
        }
        this.name = name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
//        if (serialNumber != null && serialNumber.matches("^SN[\\w]{6}$")) {
//            this.serialNumber = serialNumber;
//        }
        if (serialNumber.length() != 8) {
            return;
        }
        if (!serialNumber.startsWith("SN")) {
            return;
        }
        this.serialNumber = serialNumber;
    }

    public void printInfo() {
        System.out.println("Name is " + this.name + ", serial number is " + this.serialNumber);
    }
}
