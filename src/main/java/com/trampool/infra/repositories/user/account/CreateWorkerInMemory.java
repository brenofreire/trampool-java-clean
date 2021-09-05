package com.trampool.infra.repositories.user.account;

import com.trampool.domain.entities.worker.Worker;
import com.trampool.infra.models.UserAccount;

public class CreateWorkerInMemory implements CreateAccountInterface {
    private Worker worker;
    private UserAccountRepositoryInterface userAccountRepository;
 
    public CreateWorkerInMemory(Worker worker, UserAccountRepositoryInterface userAccountRepository) {
        this.worker = worker;
        this.userAccountRepository = userAccountRepository;
    }

    @Override
    public UserAccount create() {
        UserAccount userAccount = new UserAccount(worker.personalData.getName(), worker.personalData.getUsername(), worker.personalData.getPassword());

        this.userAccountRepository.add(userAccount);

        return userAccount;
    }
}
