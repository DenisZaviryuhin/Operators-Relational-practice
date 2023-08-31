package app;
import java.util.Scanner;
//У компанії прийнято прогресивну шкалу виплати бонусів
//від продажів.
//При обсязі продажів до 10000, включно, виплачується
//10% обсягу, при від 10000 до 20000, включно - 15%,
//а понад 20000 – 20%.
//Реалізуйте розрахунок бонусу за певного обсягу продаж.
public class Main1 {
    static int sales;
    static double bonus;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sum :");
        sales = sc.nextInt();

        if (sales <= 10000) {
            bonus = (sales / 100) * 10;
            System.out.printf("Your bonus is %.2f", bonus);
        } else if (sales > 10000 & sales <= 20000) {
            bonus = (sales / 100) * 15;
            System.out.printf("Your bonus is %.2f", bonus);

        }
        else   {
            bonus = (sales / 100) * 20;
            System.out.printf("Your bonus is %.2f", bonus);
        }
    }
}








