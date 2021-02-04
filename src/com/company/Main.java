package com.company;

import com.company.builders.ExternalSqlBuilder;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        //without director
        System.out.println(new ExternalSqlBuilder(new RestrictedTables(List.of("Account")))
                .withColumns(List.of("UserId", "ProductId"))
                .withTables(List.of("Customer", "User", "Product"))
                .build()
                .toString());

        //with director
        Director director = new Director(new RestrictedTables(List.of("User", "Account")));

        System.out.println(director.makeSelectAllCustomersOrderedSql(UserType.INTERNAL).toString());
        System.out.println(director.makeSelectAllSql(UserType.EXTERNAL).toString());
    }
}
