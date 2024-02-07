import java.util.Scanner;
public class Lab_05_ShipCostCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


    System.out.println("What it the price of the item? ");
    double itemPrice = in.nextDouble();

    double shippingCost;
    if (itemPrice >= 100.0) { shippingCost = 0.0;}
    else { shippingCost = itemPrice * 0.02;}

    double totalPrice = itemPrice + shippingCost;

        System.out.println("Shipping Cost = $" + shippingCost);
    System.out.println("Total Price = $" + totalPrice);

    in.close();




    }
}