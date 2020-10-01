import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Chhose an operation");
            System.out.println("Press 1 for Addition");
            System.out.println("Press 2 for Subtraction");
            System.out.println("Press 3 for Multiplication");
            System.out.println("Press 4 for Division");
            int operation = sc.nextInt();
            System.out.println("Enter first no.");
            int no1 = sc.nextInt();
            System.out.println("Enter secon no.");
            int no2 = sc.nextInt();
            if (operation == 1) {
                System.out.println(no1 + no2);
            }
            else if (operation == 2) {
                System.out.println(no1 - no2);
            }
            else if (operation == 3) {
                System.out.println(no1 * no2);
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
