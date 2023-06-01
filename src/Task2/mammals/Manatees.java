package Task2.mammals;

import Task2.LifeDuration;
import Task2.Size;

public class Manatees extends Mammals implements Size, LifeDuration {
    public Manatees(String name) {
        super(name);
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
