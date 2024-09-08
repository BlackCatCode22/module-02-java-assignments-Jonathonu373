//
//

public class MethodsMadness {
    public static void main(String[] args) {

        System.out.println("Hello welcome");

        int userInputNumber = 0;

        userInputNumber = getUserInput();
        System.out.println("\n The user input the number: " + userInputNumber);

        // Find the largest of two ints.
        int myFirstNum = 8;
        int mySecondNum = 4;
        int largest = 0;


        // Call the method named compareTwoInts()
        largest = compareTwoInts(myFirstNum, mySecondNum);
        System.out.println("\n The largest of " + myFirstNum + " and " + mySecondNum);


        // Sum two ints!
        int theSumOfTwoInts = 0;
        theSumOfTwoInts = sumTwoInts(myFirstNum, mySecondNum);
        System.out.println("\n The sum of " + myFirstNum + " and " + mySecondNum);


        // Method to get an integer from the user
        public static int getUserInput() {

        }


    }
}