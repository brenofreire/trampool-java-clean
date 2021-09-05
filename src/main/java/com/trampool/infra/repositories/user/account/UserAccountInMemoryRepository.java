package com.trampool.infra.repositories.user.account;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.trampool.infra.models.UserAccount;

public class UserAccountInMemoryRepository implements UserAccountRepositoryInterface {
    List<UserAccount> userAccounts = new ArrayList<UserAccount>();    

    @Override
    public void add(UserAccount userAccount) {
        this.userAccounts.add(userAccount);
    }

    @Override
    public List<UserAccount> listAll() {
        return this.userAccounts;
    }
    
    @Override
    public Optional<UserAccount> getUserAccountByUsername(String username) {
        return this.userAccounts.stream().filter(userAccount -> userAccount.getUsername() == username).findFirst();
    }
}
