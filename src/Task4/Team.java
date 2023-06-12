package Task4;

import Task4.warriors.Warrior;
import Task4.warriors.Archer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Team<T extends Warrior> implements Iterable<T> {
    private List<T> team = new ArrayList<>();

    public void add(T element) {
        team.add(element);
    }

    @Override
    public Iterator<T> iterator() {
        return team.iterator();
    }

    public int getTeamHealth() {
        int teamHealth = 0;
        for (T t : this) {
            teamHealth += t.getHealthPoint();
        }
        return teamHealth;
    }

    public int maxAttackDistance() {
        int maxDistance = 0;
        for (T t : this) {
            if (!(t instanceof Archer)) {
                continue;
            }
            int currentDistance = ((Archer) t).distance();
            if (maxDistance < currentDistance) {
                maxDistance = currentDistance;
            }
        }
        return maxDistance;
    }

    public int getTeamAttack() {
        int teamAttack = 0;
        for (T t : this) {
            teamAttack += t.getWeapon().damage();
        }
        return teamAttack;
    }
    public int minTeamProtection() {
        int minTeamProtection = Integer.MAX_VALUE;
        for (T t : this) {
            int currentProtection = 0;
            if (t.getShield() != null) {
                currentProtection = t.getShield().protection();
            }
            if (currentProtection < minTeamProtection) {
                minTeamProtection = currentProtection;
            }
        }
        return minTeamProtection;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (T t : this) {
            builder.append(t).append('\n');
        }
        builder.append(String.format("Атака команды: %d ", getTeamAttack()));
        builder.append(String.format("Здоровье команды: %d ", getTeamHealth()));
        builder.append(String.format("Дальность действия команды: %d ", maxAttackDistance()));
        builder.append(String.format("Минимальный щит члена команды: %d ", minTeamProtection()));
        return builder.toString();
    }
}
