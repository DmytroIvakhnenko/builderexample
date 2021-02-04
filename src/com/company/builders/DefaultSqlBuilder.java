package com.company.builders;

import com.company.SimpleSqlQuery;

import java.util.List;

public abstract class DefaultSqlBuilder implements SqlBuilder {
    protected List<String> columns;
    protected List<String> tables;
    protected List<String> conditions;
    protected List<String> orderBys;

    @Override
    public DefaultSqlBuilder withColumns(List<String> columns) {
        this.columns = columns;
        return this;
    }

    @Override
    public DefaultSqlBuilder withTables(List<String> tables) {
        this.tables = tables;
        return this;
    }

    @Override
    public DefaultSqlBuilder withConditions(List<String> conditions) {
        this.conditions = conditions;
        return this;
    }

    @Override
    public DefaultSqlBuilder withOrderBys(List<String> orderBys) {
        this.orderBys = orderBys;
        return this;
    }

    @Override
    public SimpleSqlQuery build() {
        return new SimpleSqlQuery(columns, tables, conditions, orderBys);
    }

    public DefaultSqlBuilder checkPermissionForTables() {
        return this;
    }
}
