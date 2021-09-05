package com.trampool;

import com.trampool.domain.entities.Negotiation;
import com.trampool.domain.entities.ServiceCategory;
import com.trampool.domain.entities.user.User;
import com.trampool.domain.entities.worker.Worker;
import com.trampool.domain.usecases.factories.UserFactory;
import com.trampool.domain.usecases.factories.WorkerFactory;
import com.trampool.domain.usecases.validations.ValidationException;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws ValidationException {
        try {
            Worker worker = new WorkerFactory("Workerini", "worke-rini", "pass-werini").create();
            User user = new UserFactory("Userini", "use-rini", "use-erini").create();
            ServiceCategory serviceCategory = new ServiceCategory("eltricity", "Elétrica");

            Negotiation negotiation = new Negotiation(user, worker, serviceCategory);


            System.out.println(negotiation.getIdentifier());
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }
    }
}
