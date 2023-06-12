package Task4.warriors;

import Task4.shields.ArcherShield;
import Task4.weapons.rangedWeapon.Ranged;

public class Archer extends Warrior<Ranged, ArcherShield> {
    public Archer(String name, int healthPoint, Ranged weapon, ArcherShield shield) {
        super(name, healthPoint, weapon, shield);
    }
    public Archer(String name, int healthPoint, Ranged weapon) {
        super(name, healthPoint, weapon);
    }

    public int distance(){
        return super.getWeapon().distance();
    }


    @Override
    public String toString() {
        return String.format("Лучник: %s, Расстояние: %d", super.toString(),
                distance());
    }
}

