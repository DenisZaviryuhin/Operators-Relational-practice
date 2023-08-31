package app;
import java.util.Scanner;
//Товар оцінюється за п'ятибальною системою, де рейтинг зростає
//із зростанням кількості балів.
//Реалізуйте встановлення оцінки товару, що відповідає певній
//кількості балів.
public class Main3 {
    static final String GOODS = "Goods";
    static int point;

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Value of points:");
        point = scanner.nextInt();


        switch (point) {
            case 1:
                System.out.println(GOODS + " in the 5th place");
                break;
            case 2:
                System.out.println(GOODS + " in the 4th place");
            case 3:
                System.out.println(GOODS + " in the 3rd place");
                break;
            case 4:
                System.out.println(GOODS + " in the 2nd place");
                break;
            case 5:
                System.out.println(GOODS + " in the 1st place");
                break;
            default:
                System.out.println("Too much points!");


        }
    }
}

