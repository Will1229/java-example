package com.example.gql.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.gql.dao.CustomerDao;
import com.example.gql.type.Customer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CustomerMutation implements GraphQLMutationResolver {

    private final CustomerDao customerDao;

    public Customer addCustomer(String name, Integer age) {
        return customerDao.saveCustomer(name, age);
    }

}
