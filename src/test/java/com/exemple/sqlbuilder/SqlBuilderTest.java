package com.exemple.sqlbuilder;

import static org.junit.jupiter.api.Assertions.*;

class SqlBuilderTest {

    public void test() {
        new SqlBuilder().select("nom", "prenom").from("users").where("").where("").orderBy("").limit(5);
    }

}
