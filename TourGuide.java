import java.util.*;

public class TourGuide {
    private String name;
    private String contact;
    private List<String> languagesSpoken;

    public TourGuide(String name, String contact, List<String> languagesSpoken) {
        this.name = name;
        this.contact = contact;
        this.languagesSpoken = languagesSpoken;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public List<String> getLanguagesSpoken() {
        return languagesSpoken;
    }

    @Override
    public String toString() {
        return "Tour Guide Name: " + name + "\nContact: " + contact + "\nLanguages Spoken: " + String.join(", ", languagesSpoken);
    }
}
