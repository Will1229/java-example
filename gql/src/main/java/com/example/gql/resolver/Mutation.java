package com.example.gql.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.gql.dao.CustomerDao;
import com.example.gql.type.Customer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Mutation implements GraphQLMutationResolver {

    private final CustomerDao customerDao;

    public Customer getCustomer(String name, Integer age) {
        return customerDao.getCustomer(name, age);
    }

    public Customer addCustomer(String name, Integer age) {
        return customerDao.saveCustomer(name, age);
    }

}
