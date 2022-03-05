package com.exemple.sqlbuilder.commands;

public interface LimitCommand<T> {

    /**
     * Add a limit clause to the query in construction
     * @param limit specified limit in the query
     * @return next state of the query
     */
    T limit(int limit);

}
