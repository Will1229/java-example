package com.example.gql.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.gql.dao.CustomerDao;
import com.example.gql.type.Account;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AccountMutation implements GraphQLMutationResolver {

    private final CustomerDao customerDao;

    public Account addAccount(String customerId, String accountType, String balance) {
        return customerDao.addAccount(customerId, accountType, balance);
    }
}
