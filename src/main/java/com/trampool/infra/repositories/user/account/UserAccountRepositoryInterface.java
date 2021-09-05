package com.trampool.infra.repositories.user.account;

import java.util.List;
import java.util.Optional;

import com.trampool.infra.models.UserAccount;

public interface UserAccountRepositoryInterface {
    void add(UserAccount userAccount);

    List<UserAccount> listAll();

    Optional<UserAccount> getUserAccountByUsername(String username);
}