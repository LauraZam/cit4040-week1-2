public class Calculator {
    public static void main(String[] args) {
        String productName = "Calculator";
        int stockQuantity = 45;
        double itemPrice = 129.99;
        boolean isAvailable = true;
        char energyClass = 'A';
        System.out.printf("Product: %s | Price: $%.2f | Stock: %d | Class: %c | Available: %b%n",
                productName, itemPrice, stockQuantity, energyClass, isAvailable);

        System.out.println("\nTask 3.2: Calculate Totals");
        System.out.println("Input (15.50, 5): " + calculateTotal(15.50, 5));     // Normal price
        System.out.println("Input (15.50, 10): " + calculateTotal(15.50, 10));    // 10% discount applied
        System.out.println("Input (10.00, 0): " + calculateTotal(10.00, 0));     // Zero quantity
        System.out.println("Input (-5.00, 3): " + calculateTotal(-5.00, 3));     // Negative input check

        System.out.println("\nTask 3.3.1: Numbers 1 to 20 divisible by 3");
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("\nTask 3.3.2: Double 1 until exceeding 1000");
        int currentNum = 1;
        while (currentNum <= 1000) {
            System.out.print(currentNum + " ");
            currentNum *= 2;
        }
        System.out.println();

        System.out.println("\nTask 3.3.3: Count vowels in a String");
        String sampleText = "Backend Development with Java";
        int vowelCount = 0;
        String lowerText = sampleText.toLowerCase();
        for (int i = 0; i < lowerText.length(); i++) {
            char ch = lowerText.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Text: \"" + sampleText + "\" contains " + vowelCount + " vowels.");

//        triggerNullPointer();

        //Task 3.5: String comparison
        System.out.println("\n--- Task 3.5: Safe String Comparison ---");
        checkRole("admin");
        checkRole(null);
        checkRole("user");
    }
    public static double calculateTotal(double price, int quantity) {
        if (price < 0 || quantity < 0) {
            System.out.println("[WARNING] Price or quantity cannot be negative.");
            return 0.0;
        }
        double total = price * quantity;
        if (quantity >= 10) {
            total *= 0.90; // Task 3.2 Method implementation
        }
        return total;
    }
    public static void triggerNullPointer() {
        String text = null;
        System.out.println(text.length()); // Task 3.4 Helper to trigger NullPointerException
    }
    public static void checkRole(String role) {
        if ("admin".equals(role)) {
            System.out.println("Access granted"); // Task 3.5 Role check method
        } else {
            System.out.println("Access denied");
        }
    }
}
