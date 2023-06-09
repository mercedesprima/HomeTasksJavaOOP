package Task2.fish;

import Task2.LifeDuration;
import Task2.Size;
import Task2.SwimSpeed;

public class Shark extends Fish implements Size, LifeDuration, SwimSpeed {
    public Shark(String name) {
        super(name);
    }

    @Override
    public int getSwimSpeed() {
        return 8;
    }

    @Override
    public String nutrition() {
        return "хищник";}

    @Override
    public String habitat() {
        return "морская";
    }

    @Override
    public int getLifeDuration() {
        return 30;
    }

    @Override
    public double getSize() {
        return 2;
    }
}
