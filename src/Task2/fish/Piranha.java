package Task2.fish;


import Task2.LifeDuration;
import Task2.Size;

public class Piranha extends Fish implements Size, LifeDuration {
    public Piranha(String name) {
        super(name);
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
        return 20;
    }

    @Override
    public double getSize() {
        return 0.14;
    }
}
