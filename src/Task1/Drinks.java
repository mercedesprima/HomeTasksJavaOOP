package Task1;

public class Drinks {
        private final String drinkName;
        private final int drinkVolume;
        private final String drinkTemperature;
        private final double drinkPrice;

        public Drinks(String drinkName, int drinkVolume, String drinkTemperature, double drinkPrice) {
            this.drinkName = drinkName;
            this.drinkVolume = drinkVolume;
            this.drinkTemperature = drinkTemperature;
            this.drinkPrice = drinkPrice;
        }

        @Override
        public String toString() {
            return " " + drinkName +
                    ", " + drinkVolume + " мл" +
                    ", " + drinkTemperature +
                    ", цена: " + drinkPrice + " руб.";
        }
        public String getDrinkName() {
            return drinkName;
        }
        public int getDrinkVolume() {
            return drinkVolume;
        }
        public String getTemperature() {
            return drinkTemperature;
        }
        public double getDrinkPrice() {
            return drinkPrice;
        }
    }
