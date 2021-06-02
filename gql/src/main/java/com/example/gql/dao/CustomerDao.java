package com.example.gql.dao;

import com.example.gql.type.Account;
import com.example.gql.type.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDao {

    public Customer getCustomer(final String id) {
        return new Customer(id, "name", 18, List.of(new Account("account-id", "normal", "1000")));
    }

    public Customer saveCustomer(final String name, final Integer age) {
        return new Customer("id", name, age, List.of(new Account("account-id", "normal", "1000")));
    }

    public Customer getCustomer(final String name, final Integer age) {
        return new Customer("id", name, age, List.of(new Account("account-id", "normal", "1000")));
    }
}
