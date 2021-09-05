package com.trampool;

import java.util.Optional;

import com.trampool.domain.entities.user.User;
import com.trampool.domain.usecases.factories.UserFactory;
import com.trampool.domain.usecases.validations.ValidationException;
import com.trampool.infra.models.UserAccount;
import com.trampool.infra.repositories.user.account.CreateUserInMemory;
import com.trampool.infra.repositories.user.account.UserAccountInMemoryRepository;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws ValidationException {
        try {
            User user = new UserFactory("User teste", "use-teste", "super-secret").create();

            UserAccountInMemoryRepository database = new UserAccountInMemoryRepository();

            UserAccount userAccount = new CreateUserInMemory(user, database).create();

            Optional<UserAccount> search = database.getUserAccountByUsername(userAccount.getUsername());

            System.out.println(search.get().getName());
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }
    }
}
