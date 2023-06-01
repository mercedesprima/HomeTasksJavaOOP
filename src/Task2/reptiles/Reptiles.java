package Task2.reptiles;

import Task2.Animal;

public abstract class Reptiles extends Animal {
    public Reptiles(String name) {
        super(name);
    }

    @Override
    public String habitat() {
        return "пресноводная";
    }
}
