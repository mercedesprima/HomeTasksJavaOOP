package Task2.mammals;

import Task2.LifeDuration;
import Task2.Size;

public class Otter extends Mammals implements Size, LifeDuration {
    public Otter(String name) {
        super(name);
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
