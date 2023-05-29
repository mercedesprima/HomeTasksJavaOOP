package Task1;
public class Main {
    //Создать торговый кофейный автомат, напитки в автомате должны содержать следующие данные:
//наименование, объем, температура, цена.
//Проинициализировать несколько напитков в классе main и торговый автомат, воспроизвести логику продажи напитков.
        public static void main(String[] args) {

            CoffeeMachine device = new CoffeeMachine();
            device.addDrinks(new Coffee("Эспрессо", 50, "горячий",
                            150, "без молока", "без сахара"))
                    .addDrinks(new Coffee("Американо, мал.", 300, "горячий", 200, "черный",
                            "с сахаром"))
                    .addDrinks(new Coffee("Американо", 500, "горячий", 270, "черный",
                            "без сахара"))
                    .addDrinks(new Coffee("Американо с сиропом", 500, "горячий", 270, "с молоком",
                            "с сахаром"))
                    .addDrinks(new Coffee("Латте", 500, "горячий", 350, "с молоком",
                            "с сахаром"))
                    .addDrinks(new Coffee("Маккиато", 300, "горячий", 300, "с молоком",
                            "с сахаром"))
                    .addDrinks(new Drinks("Кола", 300, "холодная", 70))
                    .addDrinks(new Drinks("Чай черный мал.", 300, "горячий", 70))
                    .addDrinks(new Drinks("Чай черный большой", 500, "горячий", 110))
                    .addDrinks(new Drinks("Чай зеленый мал.", 300, "горячий", 70))
                    .addDrinks(new Drinks("Чай зеленый большой", 500, "горячий", 110))
                    .addDrinks(new Drinks("Молоко большое", 300, "горячее", 50))
                    .addDrinks(new Drinks("Молоко мал.", 100, "холодное", 50))
                    .addDrinks(new Drinks("Каркаде", 300, "горячий", 200))
                    .addDrinks(new Drinks("Горячий шоколад", 300, "горячий", 200));
            System.out.println(device);
            Drinks drink = device.findDrink("Чай черный мал.");
            System.out.println("Напиток найден: " + drink);

            System.out.println("+++++++++++++++++++++");
            System.out.println("ПРОДАНО: ");
            Drinks soldDrink = device.saleDrink("Горячий шоколад");
            System.out.println(soldDrink);
            Drinks soldDrink2 = device.saleDrink("Латте");
            System.out.println(soldDrink2);
            Drinks soldDrink3 = device.saleDrink("Чай зеленый мал.");
            System.out.println(soldDrink3);
            System.out.println(device);
        }
    }
