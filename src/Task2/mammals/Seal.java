package Task2.mammals;


import Task2.LifeDuration;
import Task2.Size;
import Task2.SwimSpeed;

public class Seal extends Mammals implements Size, LifeDuration, SwimSpeed {
    public Seal(String name) {
        super(name);
    }

    @Override
    public int getSwimSpeed() {
        return 15;
    }

    @Override
    public String nutrition() {
        return "хищник";
    }

    @Override
    public int getLifeDuration() {
        return 55;
    }

    @Override
    public double getSize() {
        return 1.65;
    }
}
