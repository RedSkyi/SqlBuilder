package com.exemple.sqlbuilder.commands;

public interface FromCommand<T> {

    T from(String table);

}
