package com.company;

import com.company.exceptions.AccesDeniedException;

import java.util.List;
import java.util.Objects;

public class ExternalSqlBuilder extends DefaultSqlBuilder {

    private final List<String> restrictedTables;

    public ExternalSqlBuilder(List<String> restrictedTables) {
        this.restrictedTables = restrictedTables;
    }

    @Override
    public void setTables(List<String> tables) {
        if (Objects.nonNull(tables) && tables.stream().anyMatch(this.restrictedTables::contains)) {
            throw new AccesDeniedException();
        } else {
            super.setTables(tables);
        }
    }
}
