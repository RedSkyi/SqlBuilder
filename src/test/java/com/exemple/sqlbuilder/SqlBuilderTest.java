package com.exemple.sqlbuilder;

import com.exemple.sqlbuilder.select.SelectQueryBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class SqlBuilderTest {

    @Test
    void select() {
        assertInstanceOf(SelectQueryBuilder.class, SqlBuilder.select("col", "col2"));
    }

    @Test
    void selectDistinct() {
        assertInstanceOf(SelectQueryBuilder.class, SqlBuilder.selectDistinct("col", "col2"));
    }
}
