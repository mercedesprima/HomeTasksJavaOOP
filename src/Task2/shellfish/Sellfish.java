package Task2.shellfish;

import Task2.Animal;

public abstract class Sellfish extends Animal {
    public Sellfish(String name) {
        super(name);
    }

    @Override
    public String habitat() {
        return "морская";
    }
}
