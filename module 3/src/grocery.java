import java.util.Scanner;

public class Income {
    public static void main(String[] args) {
        Scanner coupon = new Scanner(System.in);
        System.out.println("What is your coupon amount?");

        int n = coupon.nextInt();
        System.out.println("Your coupon amount is " + n);

        Scanner weekone = new Scanner(System.in);
        System.out.println("What was your grocery bill for week 1?");
        int a = weekone.nextInt();

        Scanner weektwo = new Scanner(System.in);
        System.out.println("What was your grocery bill for week 2?");
        int b = weektwo.nextInt();

        Scanner weekthree = new Scanner(System.in);
        System.out.println("What was your grocery bill for week 3?");
        int c = weekthree.nextInt();

        Scanner weekfour = new Scanner(System.in);
        System.out.println("What was your grocery bill for week 4?");
        int d = weekfour.nextInt();

        int f, weeklytotal;
        weeklytotal = (int) ((a + b + c + d) / 4);
        System.out.println("Your monthly and weekly average without your coupon is " + weeklytotal);

        int i, total;
        total = (int) ((a + b + c + d) / (float) n);
        System.out.println("Your monthly and weekly average with your coupon is " + total);



    }
}
