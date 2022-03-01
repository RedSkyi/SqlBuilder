package com.exemple.sqlbuilder;

import com.exemple.sqlbuilder.commands.OrderByCommand;

import static org.junit.jupiter.api.Assertions.*;

class SqlBuilderTest {

    public static void main(String[] args) {
        new SqlBuilderTest().test();
    }

    public void test() {
        System.out.println(
            SqlBuilder.select("nom", "prenom")
                    .from("users")
                    .where("nom = Jean")
                    .where("prenom = Pierre")
                    .orderBy("nom", OrderByCommand.Order.ASC)
                    .limit(5)
                    .build()
        );
    }

}
