package classes;

import java.util.Objects;

public class SpaceShip {
    private String name;

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
}
