package fr.esiea.ex4A.apiTraining;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class RepositoryServiceTest {

    private UserRepository userRepository;
    RepositoryService repositoryService = new RepositoryService(userRepository);
    User user = new User("Nobody@noone.com","MrNobody","Nobody","FR","M","F");

    @Test
    boolean contains() {return repositoryService.contains(user);}

    @Test
    ArrayList<User> getAll() {
        return repositoryService.getAll();
    }

    @Test
    void add() {
        repositoryService.add(user);
    }

    @Test
    User getUser() {
        return repositoryService.getUser("MrNobody");
    }
}
