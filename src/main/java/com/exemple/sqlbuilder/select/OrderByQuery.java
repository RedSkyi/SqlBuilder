package com.exemple.sqlbuilder.select;

import com.exemple.sqlbuilder.SqlQuery;
import com.exemple.sqlbuilder.commands.LimitCommand;

public interface OrderByQuery extends LimitCommand<LimitQuery>, SqlQuery {
}
