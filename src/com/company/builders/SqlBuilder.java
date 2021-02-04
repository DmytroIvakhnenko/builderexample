package com.company.builders;

import com.company.SimpleSqlQuery;

import java.util.List;

public interface SqlBuilder {
    SqlBuilder withColumns(List<String> columns);

    SqlBuilder withTables(List<String> tables);

    SqlBuilder withConditions(List<String> conditions);

    SqlBuilder withOrderBys(List<String> orderBys);

    SimpleSqlQuery build();
}
