package Task2.amphibians;

import Task2.Animal;

public abstract class Amphibians extends Animal {
    public Amphibians(String name) {
        super(name);
    }

    @Override
    public String habitat() {
        return "пресноводная";
    }
}
