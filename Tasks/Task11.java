package Tasks;

import java.util.Scanner;

//Santa Claus has a watch, which shows how much time is left
//before each New Year in seconds. Since Santa Claus is already well
//into old age, he cannot perform some mathematical operations
//quickly. Help Santa to determine how many full days, hours,
//minutes, and seconds are left until the next New Year, if you know
//how many seconds are left, that is, divide the time in seconds into
//the full number of days, hours, minutes, and seconds. Output the
//result to the console.
//An example of how the result should look like:
//10 days, 14 hours, 5 minutes, and 33 seconds
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println(" zadajte pocet sekunda: ");
        long sekundaChybajuci = scanner.nextLong();
        long minuti = sekundaChybajuci/60; //minuti definujeme ako sekundia svisok podelene 3600 vsetko lomene 60
        long sekundi =  sekundaChybajuci % 60; //sec tu definujeme ako svisok podelene 60

        long hodiny= minuti/60;
        minuti%= 60;
        long dni = (hodiny/24);
        hodiny %= 24;
        //System.out.printf(" %d dni " + dni +"  hodiny "+ hodiny + " minuti " + minuti + " Sekundi  " + sekundi);
        System.out.printf("%d dni, %d hodiny, %d minuti, and %d sec", dni, hodiny, minuti, sekundi);
    }
}
