package Tasks;

import java.util.Scanner;

//Knowing the speed of sound propagation in the air, you can
//calculate the distance to the place of the lightning strike based on
//the time between the flash and the clap of thunder. Knowing the
//time in seconds between the flash and the clap of thunder (it is a
//constant in the program), calculate distances to the place of the
//lightning strike and output it to the screen.
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("zadaj cas : ");
        int cas = scanner.nextInt();
        int vzdalenost = 343* cas;
        System.out.println("vzdalenost  je :" + vzdalenost + " metri ");
        System.out.println( "cas je " + Math.round(vzdalenost)/343);

    }
}
