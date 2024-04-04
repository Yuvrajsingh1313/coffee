package coffesize;

import java.util.Scanner;

public class CoffeSizeSelector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to select a coffee size
        System.out.println("Please select your coffee size:");
        System.out.println("1. Small");
        System.out.println("2. Medium");
        System.out.println("3. Large");
        System.out.print("Enter your choice (1, 2, or 3): ");
        int choice = scanner.nextInt();

        // Determine coffee size based on user's choice
        String coffeeSize = selectCoffeeSize(choice);

        // Display the selected coffee size
        System.out.println("You selected: " + coffeeSize);

        // Display a message based on the selected size
        switch (coffeeSize) {
            case "Small($3.5) (":
                System.out.println("Enjoy your small coffee!");
                break;
            case "Medium ($5.20)":
                System.out.println("Enjoy your medium coffee!");
                break;
            case "Large ($6.20)":
                System.out.println("Enjoy your large coffee!");
                break;
            default:
                System.out.println("Invalid choice");
            
        }
        // Display programmer's name
        System.out.println("Program done by: yuvraj singh");

        scanner.close();
    }

    public static String selectCoffeeSize(int choice) {
        switch (choice) {
            case 1:
                return "Small ($3.50)";
            case 2:
                return "Medium ($5.20)";
            case 3:
                return "Large ($6.20)";
            default:
                return "Unknown";
        }
    }
}

