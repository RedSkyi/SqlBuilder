package com.exemple.sqlbuilder.commands;

public interface WhereCommand<T> {

    T where(String condition);

}
