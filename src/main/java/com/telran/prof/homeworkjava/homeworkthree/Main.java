package com.telran.prof.homeworkjava.homeworkthree;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Storage receivingStorage = new Storage();
        boolean repeatProcess = true;

        while (repeatProcess) {

            System.out.println("Введите наименования продуктов (5)," +
                    "\nв названии продукта должно быть слово tech,food, или book," +
                    "\nбез добавления этих категорий по умолчания пролдукт будет переведен" +
                    "\nв категорию book");
            List<String> productNames = new ArrayList<>();
            while (productNames.size() < 5) {
                String productName = scanner.nextLine();
                if (!productName.trim().isEmpty()) {
                    productNames.add(productName);
                }
            }

            List<Product> products = new ArrayList<>();
            for (String name : productNames) {
                if (name.toLowerCase().contains("tech")) {
                    products.add(new TechProduct("Tech: " + name));
                } else if (name.toLowerCase().contains("food")) {
                    products.add(new FoodProduct("Food: " + name));
                } else {
                    products.add(new BookProduct("Book: " + name));
                }
            }

            Storage sendingStorage = new Storage();


            for (Product product : products) {
                sendingStorage.loadStorage(product);
            }

            System.out.println("Введите тип трака (Big, Medium, Small):");
            String truckType = scanner.nextLine().toLowerCase();

            Truck truck;
            switch (truckType) {
                case "big":
                    truck = new BigTruck();
                    break;
                case "medium":
                    truck = new MediumTruck();
                    break;
                case "small":
                    truck = new SmallTruck();
                    break;
                default:
                    throw new IllegalArgumentException("Неправильный тип трака.");
            }


            for (Product product : sendingStorage.getProducts()) {
                truck.loadTruck(product);
            }

            sendingStorage.getProducts().clear();

            System.out.println("Продукты в траке:");
            truck.printProducts();

            truck.unloadTruck(receivingStorage);

            System.out.println("Продукты в траке после выгрузки:");
            truck.printProducts();

            System.out.println("Продукты на складе доставки:");
            receivingStorage.printProducts();

            System.out.println("Повторить процесс? (yes/no):");
            String userResponse = scanner.nextLine().trim().toLowerCase();
            if (!userResponse.equals("yes") && !userResponse.equals("да")) {
                repeatProcess = false;
            }
        }
            scanner.close();
    }
}
