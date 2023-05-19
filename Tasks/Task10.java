package Tasks;

import java.util.Scanner;

//Write a program to calculate the ideal weight for height.
//Height and weight are stored in constants, output a message of
//how many kg we need to gain or lose (ideal weight = height - 110)
//to the console.
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println( " zadajte visku v cm: ");
        float viska= scanner.nextFloat();
        System.out.println( " zadajte vahu v kg: ");
        float vaha = scanner.nextFloat();
        double idealnaVaha = viska-110;
        System.out.println( "tvoja idealna vaha je : " + idealnaVaha);
        //System.out.println("you have to lose : " + (vaha - idealnaVaha));
        if (idealnaVaha< vaha){
            System.out.println(  "musis stratit vahu  :" + (idealnaVaha+ (vaha-idealnaVaha) ));}
        else { System.out.println( " musis ziskat  vahu :" + (idealnaVaha -vaha) );}
        }
    }

