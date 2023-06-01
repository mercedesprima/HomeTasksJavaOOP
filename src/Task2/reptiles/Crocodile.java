package Task2.reptiles;

import Task2.LifeDuration;
import Task2.Size;
import Task2.SwimSpeed;

public class Crocodile extends Reptiles implements Size, LifeDuration, SwimSpeed {
    public Crocodile(String name) {
        super(name);
    }

    @Override
    public int getSwimSpeed() {
        return 30;
    }

    @Override
    public String nutrition() {
        return "хищник";
    }

    @Override
    public int getLifeDuration() {
        return 60;
    }

    @Override
    public double getSize() {
        return 1.5;
    }
}
