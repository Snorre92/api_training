package fr.esiea.ex4A.apiTraining;

import org.junit.jupiter.api.Test;

class MatchesTest {

    Matches match = new Matches("MonsieurZgeg","ZgegMan");

    @Test
    String getName() {
        return match.getName();
    }

    @Test
    String getTwitter() {
        return match.getTwitter();
    }

    @Test
    String testToString() {
        return match.toString();
    }
}
