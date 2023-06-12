package Task4;

import Task4.warriors.Warrior;

public class Battle {
    private Warrior w1;
    private Warrior w2;

    public Battle(Warrior w1, Warrior w2) {
        this.w1 = w1;
        this.w2 = w2;
    }

    public void fight(){
        while (w1.getHealthPoint() > 0 && w2.getHealthPoint() > 0){
            int damage1 = w1.hit();
            System.out.println("первый атакует второго : " + damage1);
            w2.reduceHealth(damage1);
            int damage2 = w2.hit();
            System.out.println("второй атакует первого : " + damage2);
            w1.reduceHealth(damage2);
            System.out.println(w1);
            System.out.println(w2);
        }
    }
}
