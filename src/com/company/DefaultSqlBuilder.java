package com.company;

import java.util.List;

public abstract class DefaultSqlBuilder implements SqlBuilder {
    private List<String> columns;
    private List<String> tables;
    private List<String> conditions;
    private List<String> orderBys;

    @Override
    public void setColumns(List<String> columns) {
        this.columns = columns;
    }

    @Override
    public void setTables(List<String> tables) {
        this.tables = tables;
    }

    @Override
    public void setConditions(List<String> conditions) {
        this.conditions = conditions;
    }

    @Override
    public void setOrderBys(List<String> orderBys) {
        this.orderBys = orderBys;
    }

    public SimpleSqlQuery build() {
        return new SimpleSqlQuery(columns, tables, conditions, orderBys);
    }
}
