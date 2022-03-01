package com.exemple.sqlbuilder.select;

import com.exemple.sqlbuilder.commands.WhereCommand;

public class SelectQueryBuilder implements SelectQuery, FromQuery, LimitQuery, OrderByQuery, WhereQuery, WhereCommand<WhereQuery> {

    private final StringBuilder builder = new StringBuilder();

    private boolean hasWhere = false;

    public SelectQueryBuilder(String... columns) {
        if(columns.length == 0) throw new IllegalArgumentException("Cannot select anything");

        builder.append("SELECT ").append(columns[0]);
        for (int i = 1; i < columns.length; i++)
            builder.append(", ").append(columns[i]);
    }

    @Override
    public FromQuery from(String table) {
        builder.append(" FROM ").append(table);
        return this;
    }

    @Override
    public String build() {
        return builder.toString();
    }

    @Override
    public LimitQuery limit(int limit) {
        builder.append(" LIMIT ").append(limit);
        return this;
    }

    @Override
    public OrderByQuery orderBy(String column) {
        return orderBy(column, Order.DESC);
    }

    @Override
    public OrderByQuery orderBy(String column, Order order) {
        builder.append(" ORDER BY ").append(column).append(" ").append(order);
        return this;
    }

    @Override
    public WhereQuery where(String condition) {
        if(hasWhere) builder.append(" AND ");
        builder.append(" WHERE ").append(condition).append(" ");
        hasWhere = true;
        return this;
    }
}
