import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Making Scanner class
        Scanner sc = new Scanner(System.in);
        // Making infinite loop
        while (true) {
            //Giving choice of operators
            System.out.println("Choose an operation");
            System.out.println("Press 1 for Addition");
            System.out.println("Press 2 for Subtraction");
            System.out.println("Press 3 for Multiplication");
            System.out.println("Press 4 for Division");
            System.out.println("Press 5 to exit the code");
            //To exit the code
            if (operator == 5) {
                break;
            }
            int operation = sc.nextInt();
            System.out.println("Enter first no.");
            int no1 = sc.nextInt();
            System.out.println("Enter second no.");
            int no2 = sc.nextInt();
            // Addition 
            if (operation == 1) {
                System.out.println(no1 + no2);
            }
            //Subtraction
            else if (operation == 2) {
                System.out.println(no1 - no2);
            }
            //Multiplication
            else if (operation == 3) {
                System.out.println(no1 * no2);
            }
            //Division
            else if (operation == 4) {
                if (no2 == 0) {
                    System.out.println("Invalid no. 2");
                } else {
                    System.out.println(no1 / no2);
                }    
            }    
            //Invalid Input
            else {
                System.out.println("Invalid input");
            }
        }
    }
} 
