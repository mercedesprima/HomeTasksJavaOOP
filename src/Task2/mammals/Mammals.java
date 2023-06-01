package Task2.mammals;

import Task2.Animal;

public abstract class Mammals extends Animal {
    public Mammals(String name) {
        super(name);
    }

    @Override
    public String habitat() {
        return "пресноводная";
    }
}
