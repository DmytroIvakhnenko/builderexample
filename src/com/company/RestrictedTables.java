package com.company;

import com.company.exceptions.AccessDeniedException;

import java.util.List;
import java.util.Objects;

public class RestrictedTables {
    private final List<String> restrictedTables;

    public RestrictedTables(List<String> restrictedTables) {
        this.restrictedTables = restrictedTables;
    }

    public void checkPermissions(List<String> tables) {
        if (Objects.nonNull(tables) && tables.stream().anyMatch(this.restrictedTables::contains)) {
            throw new AccessDeniedException();
        }
    }
}
