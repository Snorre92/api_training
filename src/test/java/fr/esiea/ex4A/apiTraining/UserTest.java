package fr.esiea.ex4A.apiTraining;

import org.junit.jupiter.api.Test;

class UserTest {

    User user = new User("Nobody@noone.com","MrNobody","Nobody","FR","M","F");

    int age = 21;

    User aged = new User(user,age);

    @Test
    String getUserMail() {
        return user.getUserMail();
    }

    @Test
    String getUserName() {
        return user.getUserName();
    }

    @Test
    String getUserTweeter() {
        return user.getUserTweeter();
    }

    @Test
    String getUserCountry() {
        return user.getUserCountry();
    }

    @Test
    String getUserSex() {
        return user.getUserSex();
    }

    @Test
    String getUserSexPref() {
        return user.getUserSexPref();
    }

    @Test
    Integer getUserage() {
        return aged.getUserage();
    }

    @Test
    void testToString() {
        aged.toString();
    }
}
