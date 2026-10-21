/*
* File: Database.java
* Author: Erős István
* Copyright: 2026, Erős István
* Group: Szoft II-N
* Date: 2026-10-21
* Github: https://github.com/eros/
* Licenc: MIT
*/

package com.example;

import java.sql.Connection;

public interface Database {
    public Connection connect();
}
