import java.util.*;

public class User {
    private String username;
    private String password;
    private List<Place> selectedDestinations;
    private List<Place> visitedDestinations;
    private List<String> touristCommunityUpdates;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.selectedDestinations = new ArrayList<>();
        this.visitedDestinations = new ArrayList<>();
        this.touristCommunityUpdates = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void addSelectedDestination(Place place) {
        selectedDestinations.add(place);
        System.out.println(place.getName() + " added to selected destinations.");
    }

    public void addVisitedDestination(Place place) {
        visitedDestinations.add(place);
        System.out.println(place.getName() + " added to visited destinations.");
    }

    public void viewSelectedDestinations() {
        if (selectedDestinations.isEmpty()) {
            System.out.println("No destinations selected.");
        } else {
            System.out.println("Selected Destinations:");
            for (Place place : selectedDestinations) {
                System.out.println(place.getName());
            }
        }
    }

    public void viewVisitedDestinations() {
        if (visitedDestinations.isEmpty()) {
            System.out.println("No destinations visited.");
        } else {
            System.out.println("Visited Destinations:");
            for (Place place : visitedDestinations) {
                System.out.println(place.getName());
            }
        }
    }

    public void joinTouristCommunity() {
        touristCommunityUpdates.add("Welcome to the Tourist Community, " + username + "!");
        System.out.println("You have joined the Tourist Community.");
    }

    public void viewCommunityUpdates() {
        if (touristCommunityUpdates.isEmpty()) {
            System.out.println("No community updates available.");
        } else {
            System.out.println("Community Updates:");
            for (String update : touristCommunityUpdates) {
                System.out.println(update);
            }
        }
    }
}
