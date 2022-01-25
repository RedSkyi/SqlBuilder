package com.exemple.sqlbuilder.select;

import com.exemple.sqlbuilder.SqlQuery;
import com.exemple.sqlbuilder.commands.*;

public interface WhereQuery extends
        OrCommand<OrQuery>,
        AndCommand<AndQuery>,
        OrderByCommand<OrderByQuery>,
        LimitCommand<LimitQuery>,
        SqlQuery {
}
