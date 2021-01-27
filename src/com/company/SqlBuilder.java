package com.company;

import java.util.List;

public interface SqlBuilder {
    void setColumns(List<String> columns);

    void setTables(List<String> tables);

    void setConditions(List<String> conditions);

    void setOrderBys(List<String> orderBys);
}
