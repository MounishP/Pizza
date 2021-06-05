
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter item id: ");
        int id = sc.nextInt();
        System.out.print("Enter category(V/N): ");
        String category = sc.next().toLowerCase();
        System.out.print("Enter type stuffed(S)/notstuffed(N): ");
        String type = sc.next().toLowerCase();
        System.out.print("Enter size(S/M/L): ");
        String size = sc.next().toLowerCase();

        try {
            if (category.equals("v")) {
                System.out.print("Enter toppings: ");
                String vegtop = sc.next().toLowerCase();
                System.out.println("Total price: " + new Veg(id, category, type, size, vegtop).calculateBillAmount());
            } else if (category.equals("n")) {
                System.out.print("Enter toppings: ");
                String nonVegTop = sc.next().toLowerCase();
                System.out.println("Total price: " + new NonVeg(id, category, type, size, nonVegTop).calculateBillAmount());
            }else {
                System.out.println("Category not found");
            }
        } finally {
            System.out.println("Thank you for visiting us...");
        }
    }
}
