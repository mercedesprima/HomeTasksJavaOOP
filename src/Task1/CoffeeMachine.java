package Task1;

import java.util.ArrayList;
import java.util.List;

    public class CoffeeMachine {
        private final List<Drinks> vending = new ArrayList<>();
        private double cash = 0;

        public CoffeeMachine addDrinks(Drinks dr){
            vending.add(dr);
            return this;
        }

        public List<Drinks> getVending() {
            return vending;
        }

        public Drinks findDrink(String name){
            for (Drinks drink:vending) {
                if (name.equals(drink.getDrinkName())){
                    return drink;
                }
            }
            return null;
        }

        public double getCash() {
            return cash;
        }

        public Drinks saleDrink(String nameDrink){
            Drinks found = findDrink(nameDrink);
            if (found != null){
                cash = cash + found.getDrinkPrice();
                vending.remove(found);
            }
            return found;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("Денег в автомате: ").append(cash + " рублей").append("\n\n В наличии: \n");
            for (Drinks drink:vending) {
                builder.append(drink).append("\n");
            }
            return builder.toString();
        }
    }