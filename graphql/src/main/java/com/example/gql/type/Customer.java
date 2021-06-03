package com.example.gql.type;

import java.util.List;

public record Customer(String id, String name, int age, List<Account> accounts) {
}
