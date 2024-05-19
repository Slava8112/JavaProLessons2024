package com.telran.prof.homeworkjava.homeworkthree;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private List<Product> products;

    public Storage() {
        this.products = new ArrayList<>();
    }

    public void loadStorage(Product product) {
        products.add(product);
    }

    public void unloadStorage(Product product) {
        products.remove(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void printProducts() {
        if (products.isEmpty()) {
            System.out.println("Склад пустой!");
        } else {
            for (Product product : products) {
                System.out.println(product.getName());
            }
        }
//    public void printProducts() {
//        for (Product product : products) {
//            System.out.println(product.getName());
//        }
    }
}
