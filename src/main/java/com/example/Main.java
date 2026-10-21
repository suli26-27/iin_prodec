/*
* File: Main.java
* Author: Erős István
* Copyright: 2026, Erős István
* Group: Szoft II-N
* Date: 2026-10-21
* Github: https://github.com/eros/
* Licenc: MIT
*/

package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Gyümölcsök...");
        FruitService fruitService = new FruitService(new Sqlite());
        FruitView fruitView = new FruitView();
        new FruitController(fruitService, fruitView);
    }
}