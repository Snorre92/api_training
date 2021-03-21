package fr.esiea.ex4A.apiTraining;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UserRepository {

    private final ArrayList<User> userList = new ArrayList<>();

    public ArrayList<User> getUserList() {
        return this.userList;
    }
}
