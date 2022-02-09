package com.exemple.sqlbuilder;

import com.exemple.sqlbuilder.commands.SelectCommand;
import com.exemple.sqlbuilder.select.SelectQuery;
import com.exemple.sqlbuilder.select.SelectQueryBuilder;

public class SqlBuilder implements SelectCommand<SelectQuery> {

    @Override
    public SelectQuery select(String... columns) {
        return new SelectQueryBuilder(columns);
    }
}
