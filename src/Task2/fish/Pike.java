package Task2.fish;

import Task2.LifeDuration;
import Task2.Size;

public class Pike extends Fish implements Size, LifeDuration {
    public Pike(String name) {super(name);}

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
