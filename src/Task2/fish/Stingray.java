package Task2.fish;

import Task2.LifeDuration;
import Task2.Size;
import Task2.SwimSpeed;

public class Stingray extends Fish implements Size, LifeDuration, SwimSpeed {
    public Stingray(String name) {
        super(name);
    }

    @Override
    public int getSwimSpeed() {
        return 14;
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
