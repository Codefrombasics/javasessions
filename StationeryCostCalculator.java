import java.util.Scanner;

public class StationeryCostCalculator {

    public static void main(String[] args) {
        // Constants for the cost of pen and eraser
        final int PEN_COST = 10;
        final int ERASER_COST = 2;
        final double TAX_RATE = 0.18;

        Scanner scanner = new Scanner(System.in);

        // Getting the quantity of pens from the user
        System.out.print("Enter the quantity of pens: ");
        int penQuantity = scanner.nextInt();

        // Getting the quantity of erasers from the user
        System.out.print("Enter the quantity of erasers: ");
        int eraserQuantity = scanner.nextInt();
        
        // Calculating the cost of pens and erasers
        int totalPenCost = penQuantity * PEN_COST;
        int totalEraserCost = eraserQuantity * ERASER_COST;
        int subtotal = totalPenCost + totalEraserCost;

        // Calculating the total bill with 2% tax
        double tax = subtotal * TAX_RATE;
        double totalBill = subtotal + tax;

        // Printing the details
        System.out.println("Cost of pens: " + totalPenCost);
        System.out.println("Cost of erasers: " + totalEraserCost);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Tax (2%): " + tax);
        System.out.println("Total bill: " + totalBill);

        scanner.close();
    }
}
