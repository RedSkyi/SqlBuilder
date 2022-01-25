package com.exemple.sqlbuilder.commands;

public interface SelectCommand<T> {

    T select(String... columns);

}
