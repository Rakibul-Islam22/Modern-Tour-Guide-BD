import java.util.*;

public class Place {
    private String name;
    private String description;
    private double distanceFromCity;
    private double costPerPerson;
    private String bestTimeToVisit;
    private List<String> reviews;

    public Place(String name, String description, double distanceFromCity, double costPerPerson, String bestTimeToVisit) {
        this.name = name;
        this.description = description;
        this.distanceFromCity = distanceFromCity;
        this.costPerPerson = costPerPerson;
        this.bestTimeToVisit = bestTimeToVisit;
        this.reviews = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addReview(String review) {
        reviews.add(review);
    }

    public void viewReviews() {
        if (reviews.isEmpty()) {
            System.out.println("No reviews yet.");
        } else {
            System.out.println("Reviews for " + name + ":");
            for (String review : reviews) {
                System.out.println(review);
            }
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nDescription: " + description + "\nDistance from Main City: " + distanceFromCity +
                " km\nCost per person: " + costPerPerson + " BDT\nBest time to visit: " + bestTimeToVisit;
    }
}
