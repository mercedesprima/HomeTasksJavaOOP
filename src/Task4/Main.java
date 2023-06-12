package Task4;

import Task4.shields.ArcherShield;
import Task4.shields.InfantrymanShield;
import Task4.shields.Shield;
import Task4.warriors.Archer;
import Task4.warriors.Infantryman;
import Task4.warriors.Warrior;
import Task4.weapons.meleeWeapon.Axe;
import Task4.weapons.meleeWeapon.Sword;
import Task4.weapons.rangedWeapon.Bow;
import Task4.weapons.rangedWeapon.CrossBow;

public class Main {
    public static void main(String[] args) {
        Team<Warrior> vivaldi = new Team<>();
        vivaldi.add(new Archer("Антонио", 100, new Bow(), new ArcherShield()));
        vivaldi.add(new Infantryman("Фредерико", 15, new Axe(), new InfantrymanShield()));

        Team<Archer> mozartArchers = new Team<>();
        mozartArchers.add(new Archer("Вольфганг", 100, new CrossBow()));
        mozartArchers.add(new Archer("Амадеус", 100, new Bow(), new ArcherShield()));

        Team<Infantryman>  debussyInfantryman = new Team<>();
        debussyInfantryman.add(new Infantryman("Клод", 150, new Sword(), new InfantrymanShield()));

        System.out.println(vivaldi);
        System.out.println("-----------");
        System.out.println(mozartArchers);
        System.out.println("-----------");
        System.out.println( debussyInfantryman);


        Battle battle1 = new Battle(new Infantryman("Фредерико", 150, new Axe(), new InfantrymanShield()),
                (new Archer("Антонио", 100, new Bow(), new ArcherShield())));

        battle1.fight();
    }
}
