package com.company;

import java.util.List;

public class Director {
    public void makeSelectAllSql(SqlBuilder sqlBuilder) {
        selectAllTables(sqlBuilder);
    }

    public void makeSelectAllCustomersOrderedSql(SqlBuilder sqlBuilder) {
        selectAllTables(sqlBuilder);
        sqlBuilder.setOrderBys(List.of("Customer.id DESC", "Customer.name"));
    }

    private void selectAllTables(SqlBuilder sqlBuilder) {
        sqlBuilder.setColumns(List.of("*"));
        sqlBuilder.setTables(List.of("Customer", "User", "Product"));
    }
}
