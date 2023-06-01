package Task2.mammals;

import Task2.LifeDuration;
import Task2.Size;
import Task2.SwimSpeed;

public class Manatees extends Mammals implements Size, LifeDuration, SwimSpeed {
    public Manatees(String name) {
        super(name);
    }

    @Override
    public int getSwimSpeed() {
        return 8;
    }

    @Override
    public String nutrition() {
        return "растительноядный";
    }

    @Override
    public int getLifeDuration() {
        return 60;
    }

    @Override
    public double getSize() {
        return 3;
    }
}
