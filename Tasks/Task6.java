package Tasks;

import java.sql.Savepoint;
import java.util.Scanner;

//There is a rectangle, in which the width w and height h are
//given, find the perimeter and the area of the specified rectangle
//and output to the console. The height and width of the rectangle
//should be specified by constant variables in the program code.
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("zadajte width :" );
        int width= scanner.nextInt();
        Scanner scaner2 = new Scanner(System.in);
        System.out.println("zadajte height :" );
        int height = scanner.nextInt();
        int perimeter= (width+height)*2;
        int area = height*width;
        System.out.println("perimeter is  :"  + perimeter );
        System.out.println("area is  :" + area );


    }
}
