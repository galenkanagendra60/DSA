import java.util.Scanner;

class Electricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Units:");
        int units = sc.nextInt();
        int bill = 0;
        if (units <= 100) {
            bill = units * 2;
        } else if (units <= 200) {
            bill = 100 * 2 + (units - 100) * 3;
        } else {
            bill = 100 * 2 + 100 * 3 + (units - 100) * 5;
        }
        if (bill > 500) {
            System.out.println("Bill after surcharge :");
            bill *= 10 / 100;
        }
        System.out.println("bill:" + bill);

    }
}