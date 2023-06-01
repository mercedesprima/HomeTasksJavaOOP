package Task2.fish;

import Task2.LifeDuration;
import Task2.Size;

public class Beluga extends Fish implements Size, LifeDuration {
    public Beluga(String name) {
        super(name);
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
        return 40;
    }

    @Override
    public double getSize() {
        return 4.2;
    }

}
