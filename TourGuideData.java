import java.util.*;

public class TourGuideData {
    private Map<String, Map<String, Place>> divisionData = new HashMap<>();
    private Map<String, List<TourGuide>> tourGuides = new HashMap<>();
    private List<String> packages = new ArrayList<>();
    private Map<String, User> userAccounts = new HashMap<>();

    public TourGuideData() {
        
         addDivision("Dhaka", Map.of(
            "Dhaka", new Place("Ahsan Manzil", "A historical palace in Dhaka.", 2, 100, "Winter"),
            "Narayanganj", new Place("Sonargaon Museum", "Ancient capital of Bengal.", 20, 200, "Winter"),
            "Gazipur", new Place("Bhawal National Park", "Popular forest destination.", 40, 150, "Winter"),
            "Tangail", new Place("Madhupur National Park", "Famous for Sal forests.", 100, 250, "Winter"),
            "Manikganj", new Place("Baliati Palace", "Historical zamindar house.", 50, 200, "Winter"),
            "Munshiganj", new Place("Meghna River", "Scenic beauty along the river.", 25, 120, "Winter"),
            "Faridpur", new Place("Famous Padma Resort", "Relaxation by the Padma river.", 90, 300, "Winter"),
            "Madaripur", new Place("Rayerbazar", "Notable historical place.", 110, 220, "Winter"),
            "Rajbari", new Place("Goalundo", "Gateway to Padma river.", 85, 150, "Winter"),
            "Kishoreganj", new Place("Haor Region", "Beautiful wetlands.", 120, 350, "Monsoon")
        ));
         addDivision("Chattogram", Map.of(
            "Chattogram", new Place("Patenga Beach", "Famous beach destination.", 10, 150, "Winter"),
            "Cox's Bazar", new Place("Cox's Bazar Sea Beach", "Longest sea beach in the world.", 120, 500, "Winter"),
            "Rangamati", new Place("Kaptai Lake", "Beautiful man-made lake.", 80, 400, "Winter"),
            "Bandarban", new Place("Nilgiri Hills", "Famous hill station.", 95, 450, "Winter"),
            "Khagrachari", new Place("Alutila Cave", "Mysterious natural cave.", 110, 300, "Winter"),
            "Brahmanbaria", new Place("Ashuganj Meghna Bridge", "Scenic river views.", 60, 200, "Winter"),
            "Feni", new Place("Muhuri Project", "A river dam area.", 70, 220, "Winter"),
            "Noakhali", new Place("Chairman Ghat", "Famous for its scenic beauty.", 80, 250, "Winter"),
            "Lakshmipur", new Place("Ramganj Upazila", "A peaceful travel destination.", 95, 300, "Winter"),
            "Chandpur", new Place("Meghna Junction", "Confluence of rivers.", 50, 200, "Winter")
        ));
        addDivision("Rajshahi", Map.of(
            "Rajshahi", new Place("Varendra Museum", "Ancient artifacts and relics.", 5, 100, "Winter"),
            "Natore", new Place("Uttara Gonobhaban", "Historical palace.", 40, 300, "Winter"),
            "Pabna", new Place("Hardinge Bridge", "Famous railway bridge.", 60, 250, "Winter"),
            "Sirajganj", new Place("Jamuna Bridge", "Largest bridge in Bangladesh.", 80, 350, "Winter"),
            "Naogaon", new Place("Paharpur Monastery", "UNESCO World Heritage Site.", 100, 400, "Winter"),
            "Bogra", new Place("Mahasthangarh", "Ancient archeological site.", 120, 350, "Winter"),
            "Joypurhat", new Place("Nandail Dighi", "Beautiful waterbody.", 140, 300, "Winter"),
            "Chapainawabganj", new Place("Kansat Mango Orchards", "Famous for mangoes.", 60, 200, "Summer"),
            "Kushtia", new Place("Lalon Shah's Mazaar", "Cultural heritage.", 110, 250, "Winter"),
            "Ishwardi", new Place("Pakshi Resort", "Scenic beauty.", 70, 300, "Winter")
        ));
         addDivision("Sylhet", Map.of(
            "Sylhet", new Place("Jaflong", "Scenic spot at the border.", 60, 300, "Winter"),
            "Moulvibazar", new Place("Lawachara National Park", "Rainforest and biodiversity.", 30, 200, "Winter"),
            "Habiganj", new Place("Tea Gardens", "Famous tea estates.", 50, 250, "Winter"),
            "Sunamganj", new Place("Tanguar Haor", "Wetland and bird sanctuary.", 90, 400, "Monsoon"),
            "Sreemangal", new Place("Tea Research Institute", "Learn about tea cultivation.", 25, 150, "Winter"),
            "Beanibazar", new Place("Hakaluki Haor", "Largest freshwater wetland.", 70, 300, "Monsoon"),
            "Golapganj", new Place("Rathbari House", "Historic residence.", 40, 200, "Winter"),
            "Osmaninagar", new Place("Shahi Eidgah", "Historic prayer ground.", 10, 100, "Winter"),
            "Zakiganj", new Place("Border View", "Scenic river border.", 80, 350, "Winter"),
            "Bishwanath", new Place("Hason Raja Museum", "Heritage museum.", 50, 200, "Winter")
        ));
         addDivision("Khulna", Map.of(
            "Khulna", new Place("Sundarbans", "Largest mangrove forest.", 80, 500, "Winter"),
            "Bagerhat", new Place("Sixty Dome Mosque", "UNESCO World Heritage Site.", 40, 250, "Winter"),
            "Satkhira", new Place("Kaliganj Beach", "Scenic coastal area.", 120, 400, "Winter"),
            "Jessore", new Place("Michael Madhusudan Dutt Memorial", "Historic poet's residence.", 50, 200, "Winter"),
            "Narail", new Place("Narail Museum", "Cultural and historical artifacts.", 60, 220, "Winter"),
            "Kushtia", new Place("Rabindra Kuthibari", "Historic residence of Tagore.", 70, 300, "Winter"),
            "Jhenaidah", new Place("Jor Bangla Temple", "Historical temple.", 80, 250, "Winter"),
            "Magura", new Place("Ichamati River", "Peaceful river retreat.", 40, 200, "Winter"),
            "Chuadanga", new Place("Tagore Lodge", "Historic building.", 50, 200, "Winter"),
            "Meherpur", new Place("Mujibnagar Memorial", "Historic site.", 30, 150, "Winter")
        ));
         addDivision("Barishal", Map.of(
            "Barishal", new Place("Kuakata Sea Beach", "Scenic beach known as the Daughter of the Sea.", 120, 500, "Winter"),
            "Bhola", new Place("Char Kukri Mukri", "Scenic island.", 80, 350, "Winter"),
            "Pirojpur", new Place("Bhandaria", "Historic sites and beauty.", 50, 200, "Winter"),
            "Jhalokati", new Place("Floating Guava Market", "Unique water market.", 60, 250, "Monsoon"),
            "Patuakhali", new Place("Kuakata Eco Park", "Nature and biodiversity.", 110, 450, "Winter"),
            "Barguna", new Place("Shutki Palli", "Famous for dried fish.", 90, 300, "Winter"),
            "Barishal Sadar", new Place("Durga Sagar", "Largest pond in southern region.", 20, 150, "Winter"),
            "Muladi", new Place("Muladi River Port", "Picturesque port area.", 50, 200, "Winter"),
            "Bakerganj", new Place("Bakerganj Museum", "Cultural artifacts.", 60, 220, "Winter"),
            "Mehendiganj", new Place("Mehendiganj Riverside", "Relaxing river spot.", 70, 250, "Winter")
        ));
        addDivision("Mymensingh", Map.of(
            "Mymensingh", new Place("Bhawal Monipur", "Cultural heritage site.", 50, 200, "Winter"),
            "Jamalpur", new Place("Jamalpur Park", "Beautiful natural park.", 60, 250, "Winter"),
            "Netrokona", new Place("Birishiri", "Scenic and hilly landscape.", 80, 300, "Winter"),
            "Sherpur", new Place("Garo Hills", "Lush green hills.", 100, 400, "Winter"),
            "Muktagacha", new Place("Muktagacha Zamindar Bari", "Historical landmark.", 20, 150, "Winter"),
            "Phulpur", new Place("Phulpur Palace", "Historic palace.", 40, 200, "Winter"),
            "Bhaluka", new Place("Bhaluka Tea Estate", "Beautiful tea garden.", 70, 250, "Winter"),
            "Haluaghat", new Place("Border Park", "Scenic border area.", 80, 300, "Winter"),
            "Gaffargaon", new Place("Old Railway Bridge", "Picturesque views.", 60, 250, "Winter"),
            "Iswarganj", new Place("Old Zamindar Estate", "Historic site.", 30, 150, "Winter")
        ));
         addDivision("Rangpur", Map.of(
            "Rangpur", new Place("Tajhat Palace", "Historical palace.", 40, 200, "Winter"),
            "Dinajpur", new Place("Kantajew Temple", "Ancient Hindu temple.", 80, 300, "Winter"),
            "Thakurgaon", new Place("Nilsagar", "Scenic water body.", 60, 250, "Winter"),
            "Panchagarh", new Place("Banglabandha", "Famous border area.", 100, 400, "Winter"),
            "Lalmonirhat", new Place("Teesta Barrage", "Largest irrigation project.", 50, 200, "Winter"),
            "Kurigram", new Place("Chilmari Port", "Historic river port.", 40, 150, "Winter"),
            "Gaibandha", new Place("Sundarganj Park", "Peaceful park.", 30, 100, "Winter"),
            "Pirganj", new Place("Pirganj Lake", "Relaxing natural spot.", 20, 120, "Winter"),
            "Sadullapur", new Place("Old Heritage House", "Historical landmark.", 70, 250, "Winter"),
            "Gobindaganj", new Place("Gobindaganj Market", "Famous trade center.", 60, 200, "Winter")
        ));

        
        packages.add("Package 1: Dhaka City Tour - 1000 BDT, 1 Day");
        packages.add("Package 2: Sonargaon Museum Visit - 1500 BDT, 1 Day");
        packages.add("Package 3: Cox's Bazar Beach Tour - 5000 BDT, 3 Days");
        packages.add("Package 4: Sylhet Tea Garden Tour - 3000 BDT, 2 Days");
        packages.add("Package 5: Saint Martin Tour - 10000 BDT, 3 Days");
        packages.add("Package 6: Kuakata Tour - 4000 BDT, 3 Days");
        packages.add("Package 7: Patenga Sea Beach Tour - 2000 BDT, 2 Days");
        packages.add("Package 8: Kanchanjhanga Tour - 5000 BDT, 3 Days");
        packages.add("Package 9: Panam City Tour - 2000 BDT, 2 Days");
        packages.add("Package 10: Buddha Temple Tour - 2000 BDT, 2 Days");

      
        addTourGuide("Ahsan Manzil", new TourGuide("Rahim", "01711111111", Arrays.asList("Bengali", "English")));
        addTourGuide("Patenga Beach", new TourGuide("Rakib", "01322352222", Arrays.asList("Bengali")));
        addTourGuide("Varendra Museum", new TourGuide("Malik", "01722246222", Arrays.asList("Bengali")));
        addTourGuide("Kantajew Temple", new TourGuide("Fahim", "01823452222", Arrays.asList("Bengali")));
        addTourGuide("Bhawal Monipur", new TourGuide("Nurea", "01922643522", Arrays.asList("Bengali")));
        addTourGuide("Kuakata Sea Beach", new TourGuide("Babu", "01627652222", Arrays.asList("Bengali")));
        addTourGuide("Jaflong", new TourGuide("Siam", "01322234522", Arrays.asList("Bengali")));
        addTourGuide("Sonargaon Museum", new TourGuide("Rohan", "01522456222", Arrays.asList("Bengali")));
    }

    private void addDivision(String division, Map<String, Place> districts) {
        divisionData.put(division, districts);
    }

    private void addTourGuide(String destination, TourGuide guide) {
        tourGuides.computeIfAbsent(destination, k -> new ArrayList<>()).add(guide);
    }

    public void signUp(User user) {
        if (userAccounts.containsKey(user.getUsername())) {
            System.out.println("Username already exists. Please try a different username.");
        } else {
            userAccounts.put(user.getUsername(), user);
            System.out.println("Sign-up successful!");
        }
    }

    public User logIn(String username, String password) {
        User user = userAccounts.get(username);
        if (user != null && user.getPassword().equals(password)) {
            System.out.println("Login successful!");
            return user;
        } else {
            System.out.println("Invalid username or password.");
            return null;
        }
    }

    public void searchDestinations(User user, Scanner scanner) {
        System.out.println("\nAvailable Divisions:");
        divisionData.keySet().forEach(System.out::println);

        System.out.print("\nEnter a division name: ");
        String division = scanner.nextLine();

        if (!divisionData.containsKey(division)) {
            System.out.println("Division not found!");
            return;
        }

        System.out.println("\nAvailable Districts in " + division + ":");
        Map<String, Place> districts = divisionData.get(division);
        districts.keySet().forEach(System.out::println);

        System.out.print("\nEnter a district name: ");
        String district = scanner.nextLine();

        if (!districts.containsKey(district)) {
            System.out.println("District not found!");
            return;
        }

        Place place = districts.get(district);
        System.out.println("\nDestination Details:");
        System.out.println(place);

        System.out.println("\n1. Select Destination");
        System.out.println("2. Mark as Visited");
        System.out.println("3. View Reviews");
        System.out.println("4. Add Review");
        System.out.println("5. View Tour Guides");
        System.out.println("6. View Packages");
        System.out.println("7. Back");
        System.out.print("Choose an option: ");

        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                user.addSelectedDestination(place);
                break;
            case 2:
                user.addVisitedDestination(place);
                break;
            case 3:
                place.viewReviews();
                break;
            case 4:
                System.out.print("Enter your review: ");
                String review = scanner.nextLine();
                place.addReview(review);
                System.out.println("Review added successfully!");
                break;
            case 5:
                viewTourGuides(place.getName());
                break;
            case 6:
                viewPackages();
                break;
            case 7:
                return;
            default:
                System.out.println("Invalid choice!");
        }
    }

    public void viewTourGuides(String destination) {
        System.out.println("\nTour Guides for " + destination + ":");
        List<TourGuide> guides = tourGuides.get(destination);

        if (guides == null || guides.isEmpty()) {
            System.out.println("No tour guides available for this destination.");
        } else {
            for (TourGuide guide : guides) {
                System.out.println(guide);
                System.out.println("---------------------");
            }
        }
    }

    public void viewPackages() {
        System.out.println("\nAvailable Tour Packages:");
        if (packages.isEmpty()) {
            System.out.println("No packages available.");
        } else {
            for (int i = 0; i < packages.size(); i++) {
                System.out.println((i + 1) + ". " + packages.get(i));
            }
        }
    }
}
