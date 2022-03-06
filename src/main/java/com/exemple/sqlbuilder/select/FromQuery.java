package com.exemple.sqlbuilder.select;

import com.exemple.sqlbuilder.SqlQuery;
import com.exemple.sqlbuilder.commands.LimitCommand;
import com.exemple.sqlbuilder.commands.OrderByCommand;
import com.exemple.sqlbuilder.commands.WhereCommand;

/**
 * Describes the state of a from statement
 */
public interface FromQuery extends
        WhereCommand<WhereQuery>,
        OrderByCommand<OrderByQuery>,
        LimitCommand<LimitQuery>,
        SqlQuery {
}
