import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Making Scanner class
        Scanner sc = new Scanner(System.in);
        // Making infinite loop
        while (true) {
            System.out.println("Choose an operation");
            System.out.println("Press 1 for Addition");
            System.out.println("Press 2 for Subtraction");
            System.out.println("Press 3 for Multiplication");
            System.out.println("Press 4 for Division");
            int operation = sc.nextInt();
            System.out.println("Enter first no.");
            int no1 = sc.nextInt();
            System.out.println("Enter second no.");
            int no2 = sc.nextInt();
            // Main Code for working of code 
            if (operation == 1) {
                System.out.println(no1 + no2);
            }
            else if (operation == 2) {
                System.out.println(no1 - no2);
            }
            else if (operation == 3) {
                System.out.println(no1 * no2);
            }
            else if (operation == 4 && no2 == 0) {
                System.out.println("Invalid Second No.");
            }   
            else if (operation == 4) {
                System.out.println(no1 / no2);
            }
            else {
                System.out.println("Invalid input");
            }
        }
    }
} 
