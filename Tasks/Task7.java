package Tasks;

import java.util.Scanner;

//Develop a program that will allow you to calculate the deposit
//sum in a bank at a known annual rate in two years, if the initial
//value of the deposit is set.
public class Task7 {
    public static void main(String[] args) {
       // leemos la cantidad inicial de depocito
        Scanner scanner= new Scanner(System.in);
        System.out.println( " zadajte sumu :");
        double sumaInicial= scanner.nextDouble();
        //leemos el interes anual
        System.out.println( " zadajte urok v precentach (%): ");
        double interesAnual = scanner.nextDouble();
        

    }
}
