package com.exemple.sqlbuilder;

import com.exemple.sqlbuilder.select.SelectQuery;
import com.exemple.sqlbuilder.select.SelectQueryBuilder;

public class SqlBuilder {

    /**
     * Creates a select query
     * @param columns specified columns to select in the query
     * @return a select query builder
     */
    public static SelectQuery select(String... columns) {
        return new SelectQueryBuilder(columns);
    }
}
