import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CitySearchTool {
    private static void inputCityNames(Scanner scanner, ArrayList<String> cityNames) {
        System.out.println("Enter city names (type 'done' when finished):");
        while (true) {
            String cityName = scanner.nextLine().trim();
            if (cityName.equalsIgnoreCase("done")) {
                break;
            }
            cityNames.add(cityName);
        }
    }
    private static void printCityNames(ArrayList<String> cityNames) {
        Collections.sort(cityNames);
        for (String cityName : cityNames) {
            System.out.println(cityName);
        }
    }
    private static void searchAndPrintCities(ArrayList<String> cityNames, String searchLetters) {
        System.out.println("Cities starting with the letters '" + searchLetters + "':");
        for (String cityName : cityNames) {
            if (cityName.toLowerCase().startsWith(searchLetters)) {
                System.out.println(cityName);
            }
        }
    }

//    main method

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> cityNames = new ArrayList<>();
        inputCityNames(scanner, cityNames);
        System.out.println("City names in alphabetical order:");
        printCityNames(cityNames);
        System.out.print("Enter letters to search for cities (case-insensitive): ");
        String searchLetters = scanner.nextLine().toLowerCase();
        searchAndPrintCities(cityNames, searchLetters);
    }
}
