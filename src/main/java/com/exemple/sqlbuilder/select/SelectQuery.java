package com.exemple.sqlbuilder.select;

public interface SelectQuery {

    /**
     * Add a from statement to the query in construction
     * @param table specified table to gather information from
     * @return the next state of the query
     */
    FromQuery from(String table);

}
