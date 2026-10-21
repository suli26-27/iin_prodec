/*
* File: FruitService.java
* Author: Erős István
* Copyright: 2026, Erős István
* Group: Szoft II-N
* Date: 2026-10-21
* Github: https://github.com/eros/
* Licenc: MIT
*/

package com.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FruitService {

    Database database;

    public FruitService(Database database){
        this.database = database;
    }

    public List<Fruit> findAll() {
        try {
            return tryFindAll();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    private List<Fruit> tryFindAll() throws SQLException {
        Connection con = this.database.connect();
        String sql = "select * from products";

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        List<Fruit> fruitList = new ArrayList<>();
        while(rs.next()) {
            Fruit fruit = new Fruit();
            fruit.setId(rs.getInt("id"));
            fruit.setName(rs.getString("name"));
            fruit.setPrice(rs.getInt("price"));
            fruit.setQuantity(rs.getInt("quantity"));
            fruit.setDescription(rs.getString("description"));
            fruitList.add(fruit);
        }
        con.close();
        return fruitList;
    }
}
