import java.util.Scanner;


public class TourGuideApp {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TourGuideData tourGuideData = new TourGuideData();
        User currentUser = null;

        while (true) {
             
            if (currentUser == null) {
                System.out.println("\nWelcome to Modern Tour Guide BD");
                System.out.println("1. Sign Up");
                System.out.println("2. Log In");
                System.out.println("3. Exit");
                System.out.print("Choose an option: ");

                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        System.out.print("Enter username: ");
                        String username = scanner.nextLine();
                        System.out.print("Enter password: ");
                        String password = scanner.nextLine();
                        currentUser = new User(username, password);
                        tourGuideData.signUp(currentUser);
                        break;
                    case 2:
                        System.out.print("Enter username: ");
                        username = scanner.nextLine();
                        System.out.print("Enter password: ");
                        password = scanner.nextLine();
                        currentUser = tourGuideData.logIn(username, password);
                        break;
                    case 3:
                        System.out.println("Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid choice!");
                }
            } else {
                System.out.println("\nWelcome, " + currentUser.getUsername() + "!");
                System.out.println("1. Search Destinations");
                System.out.println("2. View Tour Packages");
                System.out.println("3. View Selected Destinations");
                System.out.println("4. View Visited Destinations");
                System.out.println("5. Join Tourist Community");
                System.out.println("6. View Community Updates");
                System.out.println("7. Log Out");
                System.out.print("Choose an option: ");

                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        tourGuideData.searchDestinations(currentUser, scanner);
                        break;
                    case 2:
                        tourGuideData.viewPackages();
                        break;
                    case 3:
                        currentUser.viewSelectedDestinations();
                        break;
                    case 4:
                        currentUser.viewVisitedDestinations();
                        break;
                    case 5:
                        currentUser.joinTouristCommunity();
                        break;
                    case 6:
                        currentUser.viewCommunityUpdates();
                        break;
                    case 7:
                        currentUser = null; 
                        System.out.println("You have logged out.");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            }
        }
    }
}
