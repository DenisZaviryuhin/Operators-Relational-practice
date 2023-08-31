package app;
import java.util.Scanner;

public class Main2 {
    static String color;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Light color: ");
        color = scanner.nextLine();


        if (color.equalsIgnoreCase("Red")){
            System.out.println("Stop!");}
        if (color.equalsIgnoreCase("Yellow")){
            System.out.println("Prepare!");}
        if (color.equalsIgnoreCase("Green")){
            System.out.println("Go!");}

    }

}
