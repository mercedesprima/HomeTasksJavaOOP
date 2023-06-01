package Task2.fish;

import Task2.LifeDuration;
import Task2.Size;
import Task2.SwimSpeed;

public class Pike extends Fish implements Size, LifeDuration, SwimSpeed {
    public Pike(String name) {super(name);}

    @Override
    public int getSwimSpeed() {
        return 15;
    }

    @Override
    public String nutrition() {
        return "хищник";
    }

    @Override
    public String habitat() {
        return "пресноводная";
    }

    @Override
    public int getLifeDuration() {
        return 30;
    }

    @Override
    public double getSize() {
        return 1;
    }
}
