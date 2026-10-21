/*
* File: FruitView.java
* Author: Erős István
* Copyright: 2026, Erős István
* Group: Szoft II-N
* Date: 2026-10-21
* Github: https://github.com/eros/
* Licenc: MIT
*/

package com.example;

import java.util.List;

public class FruitView {
    public void printFruits(List<Fruit> fruitList) {
        System.out.println("-------------------------");
        System.out.printf(
            "%3s %10s %6s\n",
             "Id", "Név", "Ár"
            );
        System.out.println("-------------------------");

        fruitList.forEach(fruit -> {
            // Double price = Double.parseDouble(
            //     Integer.toString(fruit.getPrice())
            // );
            double pri = fruit.getPrice();
            System.out.printf("%3d %10s %6.2f\n",
                fruit.getId(),
                fruit.getName(),
                pri
            );
        });
    }
}
