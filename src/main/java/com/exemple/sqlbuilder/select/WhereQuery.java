package com.exemple.sqlbuilder.select;

import com.exemple.sqlbuilder.SqlQuery;
import com.exemple.sqlbuilder.commands.*;
import com.exemple.sqlbuilder.select.statements.LimitCommand;
import com.exemple.sqlbuilder.select.statements.OrderByCommand;

/**
 * Describes the state of a where statement
 */
public interface WhereQuery extends
        WhereCommand<WhereQuery>,
        OrderByCommand<OrderByQuery>,
        LimitCommand<LimitQuery>,
        SqlQuery {
}
