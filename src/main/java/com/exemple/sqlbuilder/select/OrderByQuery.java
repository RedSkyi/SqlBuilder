package com.exemple.sqlbuilder.select;

import com.exemple.sqlbuilder.SqlQuery;
import com.exemple.sqlbuilder.commands.LimitCommand;

/**
 * Describes the state of a 'order by' statement
 */
public interface OrderByQuery extends LimitCommand<LimitQuery>, SqlQuery {
}
