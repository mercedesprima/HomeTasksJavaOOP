package Task2.mammals;

import Task2.LifeDuration;
import Task2.Size;
import Task2.SwimSpeed;

public class Otter extends Mammals implements Size, LifeDuration, SwimSpeed {
    public Otter(String name) {
        super(name);
    }

    @Override
    public int getSwimSpeed() {
        return 4;
    }

    @Override
    public String nutrition() {
        return "растительноядный";
    }

    @Override
    public int getLifeDuration() {
        return 13;
    }

    @Override
    public double getSize() {
        return 1.2;
    }
}
