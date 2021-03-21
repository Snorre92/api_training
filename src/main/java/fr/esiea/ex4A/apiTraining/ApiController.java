package fr.esiea.ex4A.apiTraining;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ApiController {

    private final AgifyService agifyService;
    private final RepositoryService repositoryService;

    public ApiController(AgifyService agifyService, RepositoryService repositoryService){this.agifyService = agifyService;
        this.repositoryService = repositoryService;
    }

    @PostMapping(path = "/api/inscription", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> responseEntity(@RequestBody User user) {
        if(repositoryService.contains(user)){
            System.out.println("L'utilisateur existe dejà");
            return ResponseEntity.status(HttpStatus.CONFLICT).body("User is existing already??? WTF are you doing man ?");
        }
        else {
            int age = agifyService.getUserAge(user.getUserName(), user.getUserCountry());
            User matchableUser = new User(user , age);
            repositoryService.add(matchableUser);
            return ResponseEntity.status(HttpStatus.CREATED).body(matchableUser);
        }
    }

    @GetMapping(path = "/api/matches", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Object> match(@RequestParam(name = "userName") String userName, @RequestParam(name = "userCountry") String userCountry) {
        //String username = repositoryService.getUser(userName).getUserName();
        System.out.println(userName+" C'est son nom");
        System.out.println(userCountry+" C'est son pays");
        int age = repositoryService.getUser(userName).getUserage();
        System.out.println(age);
        String sexPref = repositoryService.getUser(userName).getUserSexPref();
        System.out.println(sexPref);
        List<User> usermatches = repositoryService.getAll().stream()
            .filter(x -> !x.getUserName().equals(userName) &&
                x.getUserSex().equals(sexPref) &&
                x.getUserage() >= age - 4 &&
                x.getUserage() <= age + 4)
            .collect(Collectors.toList());
        List<Matches> listMatches = new ArrayList<>();
        System.out.println(usermatches.toString());
        for (User user : usermatches) {
            Matches matches = new Matches(user.getUserName(), user.getUserTweeter());
            listMatches.add(matches);
        }
        if (listMatches.isEmpty()) {
            System.out.println("On est ici peut être ?");
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("No matches found");
        } else {
            System.out.println("ON EST OU LA ?!");
            System.out.println(ResponseEntity.status(HttpStatus.FOUND).body(listMatches));
            return ResponseEntity.status(HttpStatus.OK).body(listMatches);
        }
    }
}
