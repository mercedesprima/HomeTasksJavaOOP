package Task2.shellfish;

import Task2.LifeDuration;
import Task2.Size;

public class Octopus extends Sellfish implements Size, LifeDuration {
    public Octopus(String name) {
        super(name);
    }

    @Override
    public String nutrition() {
        return "хищник";
    }

    @Override
    public int getLifeDuration() {
        return 2;
    }

    @Override
    public double getSize() {
        return 1.3;
    }
}

