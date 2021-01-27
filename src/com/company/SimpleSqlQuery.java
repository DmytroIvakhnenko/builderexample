package com.company;

import java.util.List;
import java.util.Objects;

public class SimpleSqlQuery {
    private final List<String> columns;
    private final List<String> tables;
    private final List<String> conditions;
    private final List<String> orderBys;

    public SimpleSqlQuery(List<String> columns, List<String> tables, List<String> conditions, List<String> orderBys) {
        this.columns = columns;
        this.tables = tables;
        this.conditions = conditions;
        this.orderBys = orderBys;
    }

    @Override
    public String toString() {
        return getPrettyPrint("SELECT", columns) +
                getPrettyPrint("FROM", tables) +
                getPrettyPrint("WHERE", conditions) +
                getPrettyPrint("ORDER BY", orderBys);
    }

    private String getPrettyPrint(String statement, List<String> list) {
        if (Objects.isNull(list) || list.isEmpty()) {
            return "";
        } else {
            return statement + " " + String.join(", ", list) + "\n";
        }
    }

}
