import java.util.Scanner;

public class FoodOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        int count = 0;
        double totalPrice = 2.50;
        while (!input.equals("Order")){
            double productPrice = Double.parseDouble(scanner.nextLine());
            count++;
            totalPrice = totalPrice + productPrice;

            if (totalPrice > budget) {
                System.out.println("You will exceed the budget if you order this!");
                totalPrice = totalPrice - productPrice;
                count--;
            }

            input = scanner.nextLine();
        }
        System.out.printf("You ordered %d items!",count);
        System.out.printf("%nTotal: %.2f",totalPrice);

    }
}
