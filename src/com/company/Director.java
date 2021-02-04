package com.company;

import com.company.builders.ExternalSqlBuilder;
import com.company.builders.InternalSqlBuilder;
import com.company.builders.SqlBuilder;

import java.util.List;

public class Director {
    private RestrictedTables tablePermissions;

    public Director(RestrictedTables tablePermissionsChecker) {
        this.tablePermissions = tablePermissionsChecker;
    }

    public SimpleSqlQuery makeSelectAllSql(UserType userType) {
        return selectAllTables(userType).build();
    }

    public SimpleSqlQuery makeSelectAllCustomersOrderedSql(UserType userType) {
        return selectAllTables(userType)
                .withOrderBys(List.of("Customer.id DESC", "Customer.name"))
                .build();
    }

    private SqlBuilder selectAllTables(UserType userType) {
        if (userType.equals(UserType.EXTERNAL)) {
            return new ExternalSqlBuilder(tablePermissions)
                    .withColumns(List.of("*"))
                    .withTables(List.of("Customer", "User", "Product"))
                    .checkPermissionForTables();
        } else {
            return new InternalSqlBuilder()
                    .withColumns(List.of("*"))
                    .withTables(List.of("Customer", "User", "Product"));
        }
    }
}
