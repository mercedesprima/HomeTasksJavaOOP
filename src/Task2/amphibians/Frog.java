package Task2.amphibians;

import Task2.LifeDuration;
import Task2.Size;

public class Frog extends Amphibians implements Size, LifeDuration {

    public Frog(String name) {super(name);
    }

    @Override
    public String nutrition() {
        return "хищник";
    }

    @Override
    public int getLifeDuration() {return 10;}

    @Override
    public double getSize() {return 0.7;}
    }

