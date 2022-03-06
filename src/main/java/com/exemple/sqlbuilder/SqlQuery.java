package com.exemple.sqlbuilder;

/**
 * Describes a finished query
 */
public interface SqlQuery {

    /**
     * Build the query
     * @return the SQL query
     */
    String build();

}
