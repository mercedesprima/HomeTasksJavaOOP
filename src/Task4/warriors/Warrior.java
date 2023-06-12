package Task4.warriors;

import Task4.shields.Shield;
import Task4.weapons.Weapon;
import java.util.Random;

public abstract class Warrior<W extends Weapon, S extends Shield> {
    private final String name;
    private int healthPoint;
    private W weapon;
    private S shield;

    public Warrior(String name, int healthPoint, W weapon, S shield) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.shield = shield;
    }

    public Warrior(String name, int healthPoint, W weapon) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.shield = null;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public W getWeapon() {
        return weapon;
    }

    public S getShield() {
        return shield;
    }

    public int hit() {
        Random rnd = new Random();

        return rnd.nextInt(0, weapon.damage() + 1);
    }

    public void reduceHealth(int damage) {
//
        int protection = 0;
        if (shield != null) {
            protection = shield.protection();
        }
        damage -= protection;
        if (damage < 0) {
            damage = 0;
            healthPoint -= protection;
            if (healthPoint < 0) {
                healthPoint = 0;
            }
        }
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Имя: ").append(name).append(",");
        builder.append(" Оружие: ").append(weapon).append(",");
        if (shield != null) {
            builder.append(" Щит: ").append(shield).append(",");
        }
        builder.append(" Уровень здоровья: ").append(healthPoint);
        return builder.toString();
    }
}
