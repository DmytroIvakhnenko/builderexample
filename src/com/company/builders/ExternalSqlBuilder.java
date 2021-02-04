package com.company.builders;

import com.company.RestrictedTables;

public class ExternalSqlBuilder extends DefaultSqlBuilder {

    private final RestrictedTables tablePermissions;

    public ExternalSqlBuilder(RestrictedTables tablePermissions) {
        this.tablePermissions = tablePermissions;
    }

    @Override
    public DefaultSqlBuilder checkPermissionForTables() {
        tablePermissions.checkPermissions(tables);
        return this;
    }
}
