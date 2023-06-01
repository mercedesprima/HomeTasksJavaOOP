package Task2;
import Task2.amphibians.*;
import Task2.fish.*;
import Task2.mammals.*;
import Task2.reptiles.*;
import Task2.shellfish.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Animal frog = new Frog("Лягушка");
        Animal beluga = new Beluga("Белуга");

        Aquarium aquarium = new Aquarium();
        aquarium.addAnimal(frog).addAnimal(beluga).addAnimal(new Carp("Карп")).addAnimal(new Pike("Щука"))
                .addAnimal(new Piranha("Пиранья")).addAnimal(new Shark("Акула"))
                .addAnimal(new Stingray("Скат")).addAnimal(new Otter("Нутрия")).addAnimal(new Seal("Нерпа"))
                .addAnimal(new Crocodile("Крокодил")).addAnimal(new Octopus("Осьминог"))
                .addAnimal(new Cuttlefish("Каракатица")).addAnimal((new Manatees("Ламантин")));
        System.out.println(aquarium);

        System.out.println("-----Хищники-----");
        List predators = aquarium.getPredators();
        for (Object predator : predators) {
            System.out.println(predator);
        }

        System.out.println();
        System.out.println("-----Растительноядные-----");
        List herbivores = aquarium.getHerbivores();
        for (Object herbivor : herbivores) {
            System.out.println(herbivor);
        }

        System.out.println();
        Size champ = aquarium.getBiggest();
        System.out.println("-----Самый большой водный житель-----");
        System.out.println(champ);

        System.out.println();
        LifeDuration champion = aquarium.getLongLived();
        System.out.println("-----Долгожитель-----");
        System.out.println(champion);

        System.out.println();
        Size swimChamp = aquarium.getBiggest();
        System.out.println("-----Самый быстроходный-----");
        System.out.println(swimChamp);
    }
}
