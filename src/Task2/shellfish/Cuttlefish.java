package Task2.shellfish;

import Task2.LifeDuration;
import Task2.Size;
import Task2.SwimSpeed;

public class Cuttlefish extends Sellfish implements Size, LifeDuration, SwimSpeed {
    public Cuttlefish(String name) {
        super(name);
    }

    @Override
    public int getSwimSpeed() {
        return 40;
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
