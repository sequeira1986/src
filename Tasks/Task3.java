package Tasks;

import java.util.Scanner;

//The variable n stores a real number with a nonzero fractional
//part. Create a program that rounds the number n to the nearest
//integer and outputs the rounding result to the screen.
public class Task3 {
    public static void main(String[] args) {
        Scanner scannera = new Scanner(System.in);
        System.out.println(" Zadajte cislo ");
        double n = scannera.nextDouble();
        System.out.println( " cislo zaokruhlene je " + Math.round(n));
    }
}
