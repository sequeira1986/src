package Tasks;

import java.util.Scanner;

//The variable n stores a natural (integer) three-digit number.
//Create a program that calculates and displays the sum of digits of
//the number n.
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( " vlozte cislo s troma cislicami ");
        int n= scanner.nextInt();
        int sum =0;
        while (n>0){
            sum +=n%10; //vlo posledne cislo v sume
            n /=10; //vyma3e posledne cislo z n
        }
        System.out.println( "The sum of digits is " + sum  );

    }
}
