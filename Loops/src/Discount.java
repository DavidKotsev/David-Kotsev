import java.util.Scanner;

public class Discount {

    public static void main(String[] args) {

        double quantity, price, fifteenDiscount, twentyDiscount, discountedprice15, discountedprice20;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter quantity: ");
        quantity = scanner.nextDouble();
        System.out.println("Enter unit price: ");
        price = scanner.nextDouble();

        fifteenDiscount = price * 0.15;
        discountedprice15 = price * 0.85;
        discountedprice20 = price * 0.8;
        twentyDiscount = price * 0.2;
        if(quantity >= 100 && quantity < 120) {
            System.out.println("The price with discount is " + quantity * discountedprice15);
            System.out.println("The discount is: " + (quantity * fifteenDiscount));
        } else if(quantity > 119 ){
            System.out.println("The price with discount is " + quantity * discountedprice20);
            System.out.println("The discount is: " + (quantity * twentyDiscount));
        } else {
            System.out.println("Regular price is: " + (quantity * price));
        }
    }
}