package com.telran.prof.homeworkjava.homeworkthree;

import java.util.ArrayList;
import java.util.List;

public abstract class Truck {
    protected List<Product> products;
    protected int capacity;

    public Truck(int capacity) {
        this.capacity = capacity;
        this.products = new ArrayList<>();
    }

    public void loadTruck(Product product) {
        if (products.size() < capacity) {
            products.add(product);
        } else {
            System.out.println("Трак полный!");
        }
    }

    public void unloadTruck(Storage storage) {
        for (Product product : products) {
            storage.loadStorage(product);
        }
        products.clear();
//        System.out.println("Трак пустой!");
    }

    public void printProducts() {
        if (products.isEmpty()) {
            System.out.println("Трак пустой!");
        } else {
            for (Product product : products) {
                System.out.println(product.getName());
            }
        }
//        for (Product product : products) {
//            System.out.println(product.getName());
//        }
    }
}
