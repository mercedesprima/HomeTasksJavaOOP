package Task2.fish;

import Task2.LifeDuration;
import Task2.Size;

public class Stingray extends Fish implements Size, LifeDuration {
    public Stingray(String name) {
        super(name);
    }

    @Override
    public String nutrition() {
        return "хищник";
    }

    @Override
    public String habitat() {
        return "морская";
    }

    @Override
    public int getLifeDuration() {
        return 15;
    }

    @Override
    public double getSize() {
        return 0.8;
    }
}
