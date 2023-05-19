package Tasks;

import java.util.Scanner;

/*Two natural numbers are stored in the variables x and y. Create
        a program that outputs to the console:
        ■■ Result of the integer division of x by y.
        ■■ Remainder of dividing x by y.
        ■■ Square root of x.*/
public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("zadajte cislo");
        int x = scanner.nextInt();
        System.out.println("zadajte druhe cislo");
        int y = scanner.nextInt();
        int division = x/y;
        int Remainder= x %y;
        double SquareRoot = Math.sqrt(x);
        System.out.println( "division je: " + division);
        System.out.println("Remainder je : " +Remainder);
        System.out.println("SquareRoot je : " +SquareRoot);

    }
}