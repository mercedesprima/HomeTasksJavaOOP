package Task2.fish;

import Task2.LifeDuration;
import Task2.Size;
import Task2.SwimSpeed;

public class Carp extends Fish implements Size, LifeDuration, SwimSpeed {
    public Carp(String name) {
        super(name);
    }

    @Override
    public int getSwimSpeed() {
        return 2;
    }

    @Override
    public String nutrition() {
        return "растительноядный";
    }

    @Override
    public String habitat() {
        return "пресноводная";
    }

    @Override
    public double getSize() {
        return 0.4;
    }

    @Override
    public int getLifeDuration() {return 40;}



}
