package com.trampool.infra.repositories.user.account;

import com.trampool.domain.entities.user.User;
import com.trampool.infra.models.UserAccount;

public class CreateUserInMemory implements CreateAccountInterface {
    private User user;
    private UserAccountRepositoryInterface userAccountRepository;
 
    public CreateUserInMemory(User user, UserAccountRepositoryInterface userAccountRepository) {
        this.user = user;
        this.userAccountRepository = userAccountRepository;
    }

    @Override
    public UserAccount create() {
        UserAccount userAccount =  new UserAccount(user.personalData.getName(), user.personalData.getUsername(), user.personalData.getPassword());

        this.userAccountRepository.add(userAccount);

        return userAccount;
    }
}
