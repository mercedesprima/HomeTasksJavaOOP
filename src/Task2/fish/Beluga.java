package Task2.fish;

import Task2.LifeDuration;
import Task2.Size;
import Task2.SwimSpeed;

public class Beluga extends Fish implements Size, LifeDuration, SwimSpeed {
    public Beluga(String name) {
        super(name);
    }

    @Override
    public int getSwimSpeed() {
        return 8;
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
