package Task2.shellfish;

import Task2.LifeDuration;
import Task2.Size;

public class Cuttlefish extends Sellfish implements Size, LifeDuration {
    public Cuttlefish(String name) {
        super(name);
    }

    @Override
    public String nutrition() {
        return "хищник";
    }

    @Override
    public int getLifeDuration() {
        return 1;
    }

    @Override
    public double getSize() {
        return 0.35;
    }
}
