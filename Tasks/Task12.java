package Tasks;

import java.util.Scanner;

//One pasty is given to pupils of the first grade, if the weight of
//the first grader is less than 30 kg, they additionally get 1 glass
//of milk and 1 more pasty. In the first grades of school, there are
//n pupils. The glass of milk has a capacity of 200 ml, and milk
//packaging has a capacity of 0.9 liters.
//Write a program that will determine the number of packages of
//milk and pasties required each day for the following conditions:
//■■ If 100% of all students weigh less than 30 kg in the school.
//■■ If 60% of students weigh less than 30 kg in the school.
//■■ If 1% of students weigh less than 30 kg in the school.
//(!!!) Note that you cannot buy two and a half packages of milk,
//you can buy two or three of them.
public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" zadj pocet ziakov   ");
        //n pocet studentov
        double n = scanner.nextDouble();
        //p1,2,3 je pocet pastis
        // m1,2,3 pocet mlieko
        double p1 = 2*n;
        double p2 =(2*(0.6*n))+(0.4*n);
        double p3 = (2*(0.01*n)+(0.99*n));
        double m1 = n/4.5;
        double m2 = (0.6*n)/4.5;
        double m3 = (0.01*n)/4.5;
        System.out.println("ak 100% pupils maju menej ako 30kg pocet pastis je: " + p1 + " pocet mlieka: " + Math.ceil(m1));
        System.out.println("ak 60% pupils maju menej ako 30kg pocet pastis je: " + p2 + " pocet mlieka: " + Math.ceil(m2));
        System.out.println("ak 1% pupils maju menej ako 30kg pocet pastis je: " + p3 + " pocet mlieka: " + Math.ceil(m3));

    }
}


