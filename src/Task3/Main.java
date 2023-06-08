package Task3;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        CargoTrain<String> cargoTrain = new CargoTrain<>();
        Iterator<String> iterator;
        cargoTrain.add("локомотив");
        cargoTrain.add("цистерна1");
        cargoTrain.add("цистерна2");
        cargoTrain.add("цистерна3");
        cargoTrain.add("хоппер1");
        cargoTrain.add("хоппер2");
        cargoTrain.add("пплатформа1");
        cargoTrain.add("платформа2");
        cargoTrain.add("думкар1");

        System.out.print("Последовательность вагонов в поезде: \n");

        for (String van : cargoTrain) {
            System.out.println(van);
        }
        System.out.printf("длина состава: %d вагонов\n" , cargoTrain.size());

        cargoTrain.remove("хоппер2", false);
        System.out.println("\n---отцеплен 5-й вагон---");
        iterator = cargoTrain.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.printf("длина состава: %d\n", cargoTrain.size());

        cargoTrain.addFirst("тягач");
        System.out.println("\n---прицеплен тягач перед локомотивом---");
        for (String item : cargoTrain) {
            System.out.println(item);
        }

        System.out.println("\n---найдены первый и поседний вагоны---");
        System.out.println(cargoTrain.get(2));
        System.out.println(cargoTrain.get(-1));

        cargoTrain.removeFirst();

        System.out.println("\n---тягач отцеплен---");
        for (String item : cargoTrain) {
            System.out.println(item);
        }
        System.out.printf("длина состава: %d вагонов\n" , cargoTrain.size());

        System.out.println("\n---отцеплен последний вагон---");
        cargoTrain.removeLast();
        iterator = cargoTrain.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.printf("длина состава: %d вагонов\n ", cargoTrain.size());

        cargoTrain.add("автомобилевоз1");
        cargoTrain.add("автомобилевоз2");
        cargoTrain.add("автомобилевоз3");
        cargoTrain.add("автомобилевоз4");
        System.out.println("\n---прицеплены новые вагоны---");
        for (String item : cargoTrain) {
            System.out.println(item);
        }

        cargoTrain.clear();

        System.out.println("\n---состав расформирован---");
        iterator = cargoTrain.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.printf("длина состава: %d вагонов\n", cargoTrain.size());

        System.out.println("состав расформирован? - " + (cargoTrain.isEmpty() ? "нет" : "да"));

        cargoTrain.add("локомотив");
        cargoTrain.add("платформа1");
        cargoTrain.add("платформа2");
        cargoTrain.add("автомобилевоз4");
        cargoTrain.add("автомобилевоз4");
        cargoTrain.add("думкар1");
        cargoTrain.add("думкар2");
        cargoTrain.add("думкар3");
        System.out.println("\n---сформирован новый состав---");
        for (String item : cargoTrain) {
            System.out.println(item);
        }
        System.out.printf("длина состава - %d\n", cargoTrain.size());
        System.out.println("состав расформирован? - " + (cargoTrain.isEmpty() ? "нет" : "да"));
    }
}

