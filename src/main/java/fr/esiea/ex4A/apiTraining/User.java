package fr.esiea.ex4A.apiTraining;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Optional;

public class User {
    private final String userMail;
    private final String userName;
    private final String userTweeter;
    private final String userCountry;
    private final String userSex;
    private final String userSexPref;
    private final Optional<Integer> age;


    @JsonCreator
    public User(@JsonProperty("userEmail") String userMail,
                @JsonProperty("userName") String userName,
                @JsonProperty("userTweeter") String userTweeter,
                @JsonProperty("userCountry") String userCountry,
                @JsonProperty("userSex") String userSex,
                @JsonProperty("userSexPref") String userSexPref) {
        this.userMail = userMail;
        this.userName = userName;
        this.userTweeter = userTweeter;
        this.userCountry = userCountry;
        this.userSex = userSex;
        this.userSexPref = userSexPref;
        this.age = Optional.empty();
    }

    public User(User user, int age) {
        this.userMail = user.userMail;
        this.userName = user.userName;
        this.userTweeter = user.userTweeter;
        this.userCountry = user.userCountry;
        this.userSex = user.userSex;
        this.userSexPref = user.userSexPref;
        this.age = Optional.of(age);
    }
    public String getUserMail() {
        return userMail;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserTweeter() {
        return userTweeter;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public String getUserSex() {
        return userSex;
    }

    public String getUserSexPref() {
        return userSexPref;
    }

    public Integer getUserage(){return age.get();}
}
