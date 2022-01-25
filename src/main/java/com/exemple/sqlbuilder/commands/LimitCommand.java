package com.exemple.sqlbuilder.commands;

public interface LimitCommand<T> {

    T limit(int limit);

}
