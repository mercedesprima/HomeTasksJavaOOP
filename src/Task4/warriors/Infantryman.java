package Task4.warriors;

import Task4.shields.InfantrymanShield;
import Task4.weapons.meleeWeapon.Axe;
import Task4.weapons.meleeWeapon.Melee;

public class Infantryman extends Warrior<Melee, InfantrymanShield>{
    public Infantryman(String name, int healthPoint, Melee weapon, InfantrymanShield shield) {
        super(name, healthPoint, weapon, shield);
    }
    public Infantryman(String name, int healthPoint, Melee weapon) {
        super(name, healthPoint, weapon);
    }

    @Override
    public String toString() {
        return String.format("Пехотинец: %s", super.toString());
    }
}
