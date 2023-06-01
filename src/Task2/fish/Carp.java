package Task2.fish;

import Task2.LifeDuration;
import Task2.Size;

public class Carp extends Fish implements Size, LifeDuration {
    public Carp(String name) {
        super(name);
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
