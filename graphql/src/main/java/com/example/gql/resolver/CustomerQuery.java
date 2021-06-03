package com.example.gql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.gql.dao.CustomerDao;
import com.example.gql.type.Customer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CustomerQuery implements GraphQLQueryResolver {

    private final CustomerDao customerDao;

    public Customer getCustomer(String id) {
        return customerDao.getCustomer(id);
    }

}
