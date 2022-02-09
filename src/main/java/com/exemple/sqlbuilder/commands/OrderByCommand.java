package com.exemple.sqlbuilder.commands;

public interface OrderByCommand<T> {

    T orderBy(String column);

    T orderBy(String column, Order order);

    enum Order { ASC, DESC }

}
