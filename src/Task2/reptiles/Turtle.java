package Task2.reptiles;

import Task2.LifeDuration;
import Task2.Size;
import Task2.SwimSpeed;

public class Turtle extends Reptiles implements Size, LifeDuration, SwimSpeed {
    public Turtle(String name) {
        super(name);
    }

    @Override
    public int getSwimSpeed() {
        return 36;
    }

    @Override
    public String nutrition() {
        return "хищник";
    }

    @Override
    public int getLifeDuration() {
        return 150;
    }

    @Override
    public double getSize() {
        return 0.85;
    }
}
