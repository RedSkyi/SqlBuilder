package com.exemple.sqlbuilder.commands;

public interface OrderByCommand<T> {

    /**
     * Add a 'order by' with ascending order clause to the query in construction
     * @see OrderByCommand#orderBy(String, Order)
     * @param column specified limit in the query
     * @return next state of the statement
     */
    T orderBy(String column);

    /**
     * Add a 'order by' clause to the query in construction
     * @param column specified column to order by in the query
     * @param order specified order in the query
     * @return next state of the query
     */
    T orderBy(String column, Order order);

    enum Order { ASC, DESC }

}
