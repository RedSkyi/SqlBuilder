package com.exemple.sqlbuilder.select;

import com.exemple.sqlbuilder.select.statements.LimitCommand;
import com.exemple.sqlbuilder.select.statements.OrderByCommand;

/**
 * Describes the state of a 'order by' statement
 */
public interface OrderByQuery extends OrderByCommand<OrderByQuery>, LimitCommand<LimitQuery> {
}
