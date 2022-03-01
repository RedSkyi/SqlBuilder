package com.exemple.sqlbuilder;

import com.exemple.sqlbuilder.select.SelectQuery;
import com.exemple.sqlbuilder.select.SelectQueryBuilder;

public class SqlBuilder {

    public static SelectQuery select(String... columns) {
        return new SelectQueryBuilder(columns);
    }
}
