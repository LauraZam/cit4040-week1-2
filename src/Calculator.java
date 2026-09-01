public class Calculator {
    public static void main(String[] args) {
        String productName = "Calculator";
        int stockQuantity = 45;
        double itemPrice = 129.99;
        boolean isAvailable = true;
        char energyClass = 'A';
        System.out.printf("Product: %s | Price: $%.2f | Stock: %d | Class: %c | Available: %b%n",
                productName, itemPrice, stockQuantity, energyClass, isAvailable);
    }
}
