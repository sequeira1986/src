package Tasks;
import java.util.Scanner;
//Check if a number has a real part. For example, the numbers
//3.14 and 2.5 have a real part, and the numbers 5.0 and 10.0 do not
//have it.
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println(" zadaj pomerove cislo : ");
        double cislo= scanner.nextDouble();
        //This operator returns True, if two operands are not equal, else it returns False.
        if( (cislo- (int)cislo)!=0)
            System.out.println( " ma decimalne cislo ");
        else
            System.out.println(" nema decimalna cas: ");
        //Modulus	Returns the division remainder
        double fractional = cislo%1;
        double integral = cislo - fractional;
        System.out.println( " integralna cas je : " + integral);
        System.out.println( " frakcinalna cas je:  " + fractional);


    }
}
