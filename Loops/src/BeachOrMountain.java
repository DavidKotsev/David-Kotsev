import java.util.Scanner;

public class BeachOrMountain {
    public static void main(String[] args) {
        String holiday;
//        String Mountain;
        int holidaymoney;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Where would you go: ");
        holiday = scanner.nextLine();


        if (holiday.equals("Mountain")) {
            System.out.println("What is your budget per day: ");
            holidaymoney = scanner.nextInt();
            if (holidaymoney < 30) {
                System.out.println("Got to mountain in Bulgaria. ");
            } else {
                System.out.println("You can go to mountain outside Bulgaria.");
            }
        } else if (holiday.equals("Beach")) {
            System.out.println("What is your budget per day: ");
            holidaymoney = scanner.nextInt();
            if (holidaymoney < 50) {
                System.out.println("Got to beach in Bulgaria. ");
            } else {
                System.out.println("You can go to Beach outside Bulgaria.");
            }
        } else{
            System.out.println("There is no information about such type of holiday!");
        }
    }}
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Where would you go: ");



