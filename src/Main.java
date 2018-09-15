import java.util.Scanner;

public class Main {

    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String enteredString = scn.nextLine();
        char[] splitString = enteredString.toCharArray();
        double charSum = 0.0;
        for (int i = 0; i < splitString.length; i++) {
            charSum += splitString[i];  // adding a char to a number value will add its ascii instead
        }

        charSum /= splitString.length; // divide by length of String to find average
        System.out.println("Average ASCII value of given string is: " + charSum);
    }
}
