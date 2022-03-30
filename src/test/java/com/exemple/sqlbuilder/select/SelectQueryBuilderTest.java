package com.exemple.sqlbuilder.select;

import com.exemple.sqlbuilder.select.statements.OrderByCommand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectQueryBuilderTest {

    private SelectQueryBuilder builder;

    @BeforeEach
    public void setUp() {
        builder = new SelectQueryBuilder();
    }

    @Test
    void select() {
        assertEquals(
                "SELECT col1, col2",
                ((SelectQueryBuilder) builder.select("col1", "col2")).build());
    }

    @Test
    void selectWithoutDistinct() {
        assertEquals(
                "SELECT col1, col2",
                ((SelectQueryBuilder) builder.select(false, "col1", "col2")).build());
    }

    @Test
    void selectDistinct() {
        assertEquals(
                "SELECT DISTINCT col1, col2",
                ((SelectQueryBuilder) builder.select(true, "col1", "col2")).build());
    }

    @Test
    void from() {
        assertEquals(
                " FROM table",
                builder.from("table").build());
    }

    @Test
    void build() {
        assertEquals(
                "SELECT col FROM table WHERE col = true",
                builder.select("col").from("table").where("col = true").build());
    }

    @Test
    void limit() {
        assertEquals(
                " LIMIT 5",
                builder.limit(5).build());
    }

    @Test
    void orderBy() {
        assertEquals(
                " ORDER BY col DESC",
                builder.orderBy("col").build());
    }

    @Test
    void orderByWithOrder() {
        assertEquals(
                " ORDER BY col ASC",
                builder.orderBy("col", OrderByCommand.Order.ASC).build());
    }

    @Test
    void where() {
        assertEquals(
                " WHERE col = true",
                builder.where("col = true").build());
    }

    @Test
    void multipleWhere() {
        assertEquals(
                " WHERE col = true AND WHERE col2 = false",
                builder.where("col = true").where("col2 = false").build());
    }
}
