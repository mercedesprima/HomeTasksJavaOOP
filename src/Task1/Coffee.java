package Task1;
    public class Coffee extends Drinks{
        private final String coffeeColor;
        private final String coffeeSweetness;

        public Coffee(String drinkName, int drinkVolume, String drinkTemperature, double drinkPrice, String coffeeColor,
                      String coffeeSweetness) {
            super(drinkName, drinkVolume, drinkTemperature, drinkPrice);
            this.coffeeColor = coffeeColor;
            this.coffeeSweetness = coffeeSweetness;
        }

        @Override
        public String toString() {
            return super.toString() + ", " + coffeeColor + ", " + coffeeSweetness;
        }

//    public String getCoffeeColor() {
//        return coffeeColor;
//    }
//    public String getCoffeeSweetness() {
//        return coffeeSweetness;
//    }
    }

