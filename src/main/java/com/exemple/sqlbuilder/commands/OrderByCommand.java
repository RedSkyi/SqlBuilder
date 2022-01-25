package com.exemple.sqlbuilder.commands;

public interface OrderByCommand<T> {

    T orderBy(String column);

    T orderBy(String column, Order oder);

    enum Order { ASC, DESC }

}
