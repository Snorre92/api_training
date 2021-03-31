package fr.esiea.ex4A.apiTraining;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    private UserRepository userRepository;
    @Test
    ArrayList<User> getUserList() {
        return userRepository.getUserList();
    }
}
