/*
* File: FruitController.java
* Author: Erős István
* Copyright: 2026, Erős István
* Group: Szoft II-N
* Date: 2026-10-21
* Github: https://github.com/eros/
* Licenc: MIT
*/

package com.example;

import java.util.List;

public class FruitController {
    FruitService fruitService;
    FruitView fruitView;
    public FruitController(
        FruitService fruitService, 
        FruitView fruitView) {
            this.fruitService = fruitService;
            this.fruitView = fruitView;
            initApplication();
    }

    private void initApplication() {
        List<Fruit> fruitList = fruitService.findAll();
        fruitView.printFruits(fruitList);
    }


}
