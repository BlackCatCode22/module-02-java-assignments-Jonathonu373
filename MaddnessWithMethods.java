// J.U 9.5.24
// MaddnessWithMethods.java

import java.util.Scanner;

public class MaddnessWithMethods {
    public static void main(String[] args) {
        System.out.println("\n Welcome to the Maddness with Methods program\n");

    }
    // Method is get an inter from the user.
    public static int getAnIntFromTheUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        return scanner.nextInt();}
    }
// Function to compare two integers
public static String compareTwoInts(int a, int b) {
    if (a > b) {
        return a + " is greater than " + b;
    } else if (a < b) {
        return a + " is less than " + b;
    } else {
        return a + " is equal to " + b;
    }
}

// Function to sum two integers
public static int sumTwoInts(int a, int b) {
    return a + b;
}

public static void main(String[] args) {
    // Get two integers from the user
    System.out.println("Enter the first integer:");
    int firstInt = MaddnessWithMethods.getAnIntFromTheUser();

    System.out.println("Enter the second integer:");
    int secondInt = MaddnessWithMethods.getAnIntFromTheUser();

    // Compare the two integers
    String comparisonResult = compareTwoInts(firstInt, secondInt);
    System.out.println(comparisonResult);

    // Sum the two integers
    int sum = sumTwoInts(firstInt, secondInt);
    System.out.println("The sum of " + firstInt + " and " + secondInt + " is " + sum);}