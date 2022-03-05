package com.exemple.sqlbuilder.commands;

public interface WhereCommand<T> {

    /**
     * Add a where clause to the query in construction
     * @param condition specified where condition in the query
     * @return the next state of the query
     */
    T where(String condition);

}
