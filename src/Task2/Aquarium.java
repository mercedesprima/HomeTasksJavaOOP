package Task2;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private final List<Animal> aquarium = new ArrayList<>();

    public Aquarium addAnimal(Animal someAnimal) {
        aquarium.add(someAnimal);
        return this;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("--------------В аквариуме:-----------\n");
        for (Animal animal : aquarium) {
            builder.append(animal)
                    .append('\n');
        }
        return builder.toString();
    }

    public List<Size> dimensions() {
        List<Size> dimensions = new ArrayList<>();
        for (Animal animal : aquarium) {
            if (animal instanceof Size) {
                dimensions.add((Size) animal);
            }
        }
        return dimensions;
    }

    public Size getBiggest() {
        List<Size> dimensions = dimensions();
        Size champ = dimensions.get(0);
        for (Size dimension : dimensions()) {
            if (champ.getSize() < dimension.getSize()) {
                champ = dimension;
            }
        }
        return champ;
    }

    public List<LifeDuration> lifetimes() {
        List<LifeDuration> lifetimes = new ArrayList<>();
        for (Animal animal : aquarium) {
            if (animal instanceof LifeDuration) {
                lifetimes.add((LifeDuration) animal);
            }
        }
        return lifetimes;
    }

    public LifeDuration getLongLived() {
        List<LifeDuration> lifetimes = lifetimes();
        LifeDuration champion = lifetimes.get(0);
        for (LifeDuration lifetime : lifetimes()) {
            if (champion.getLifeDuration() < lifetime.getLifeDuration()) {
                champion = lifetime;
            }
        }
        return champion;
    }

    public List getPredators() {
        List predators = new ArrayList<>();
        for (Animal animal : aquarium) {
            if ("хищник".equals(animal.nutrition())) {
                predators.add(animal);
            }
        }
        return predators;
    }

    public List getHerbivores() {
        List herbivores = new ArrayList<>();
        for (Animal animal : aquarium) {
            if ("растительноядный".equals(animal.nutrition())) {
                herbivores.add(animal);
            }
        }
        return herbivores;
    }

    public List<SwimSpeed> swimmers() {
        List<SwimSpeed> lifetimes = new ArrayList<>();
        for (Animal animal : aquarium) {
            if (animal instanceof SwimSpeed) {
                swimmers().add((SwimSpeed) animal);
            }
        }
        return lifetimes;
    }

    public SwimSpeed getSwimSpeed() {
        List<SwimSpeed> swimmers = swimmers();
        SwimSpeed swimChamp = swimmers.get(0);
        for (SwimSpeed swimmer : swimmers()) {
            if (swimChamp.getSwimSpeed() < swimmer.getSwimSpeed()) {
                swimChamp = swimmer;
            }
        }
        return swimChamp;
    }
}