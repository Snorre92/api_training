package fr.esiea.ex4A.apiTraining;

public class Matches {
    private final String name;
    private final String twitter;

    public Matches (String name, String twitter){
        this.name= name;
        this.twitter = twitter;
    }

    public String getName() {
        return name;
    }

    public String getTwitter() {
        return twitter;
    }

    @Override
    public String toString() {
        return "Matches{" +
            "name='" + name + '\'' +
            ", twitter='" + twitter + '\'' +
            '}';
    }
}
