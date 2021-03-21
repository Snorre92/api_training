package fr.esiea.ex4A.apiTraining;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RepositoryService {
    private final UserRepository userRepository;


    public RepositoryService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean contains(User user){
        for (User listed: userRepository.getUserList()) {
            if (listed.getUserName().equals(user.getUserName())){
                return true;
            }
        }
        return false;
    }

    public ArrayList<User> getAll(){
        return userRepository.getUserList();
    }

    public boolean add(User user){
        return  userRepository.getUserList().add(user);
    }

    public User getUser(String username){
        for (User user: userRepository.getUserList()) {
            if (user.getUserName().equals(username)){
                return user;
            }
        }
        return null;
    }
}
