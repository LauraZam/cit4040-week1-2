public class Calculator {
    public static void main(String[] args) {
        String productName = "Calculator";
        int stockQuantity = 45;
        double itemPrice = 129.99;
        boolean isAvailable = true;
        char energyClass = 'A';
        System.out.printf("Product: %s | Price: $%.2f | Stock: %d | Class: %c | Available: %b%n",
                productName, itemPrice, stockQuantity, energyClass, isAvailable);
        System.out.println("\n--- Task 3.2: Calculate Totals ---");
        System.out.println("Input (15.50, 5): " + calculateTotal(15.50, 5));     // Normal price
        System.out.println("Input (15.50, 10): " + calculateTotal(15.50, 10));    // 10% discount applied
        System.out.println("Input (10.00, 0): " + calculateTotal(10.00, 0));     // Zero quantity
        System.out.println("Input (-5.00, 3): " + calculateTotal(-5.00, 3));     // Negative input check
    }
    public static double calculateTotal(double price, int quantity) {
        if (price < 0 || quantity < 0) {
            System.out.println("[WARNING] Price or quantity cannot be negative.");
            return 0.0;
        }
        double total = price * quantity;
        if (quantity >= 10) {
            total *= 0.90; // Apply 10% discount
        }
        return total;
    }
}
