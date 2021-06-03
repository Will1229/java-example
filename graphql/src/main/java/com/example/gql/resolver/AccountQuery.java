package com.example.gql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.gql.dao.CustomerDao;
import com.example.gql.type.Account;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AccountQuery implements GraphQLQueryResolver {

    private final CustomerDao customerDao;

    public Account getAccount(String id) {
        return customerDao.getAccount(id);
    }

}
