package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();

        InternalSqlBuilder internalBuilder = new InternalSqlBuilder();
        director.makeSelectAllCustomersOrderedSql(internalBuilder);
        System.out.println(internalBuilder.build().toString());

        ExternalSqlBuilder externalBuilder = new ExternalSqlBuilder(List.of("User", "Role"));
        director.makeSelectAllSql(externalBuilder);
        System.out.println(externalBuilder.build().toString());

    }
}
