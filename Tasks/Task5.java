package Tasks;
//Calculate the area and circumference of a circle with a radius
//R. The radius should be set by a constant in the program. Output
//the result to the console.
public class Task5 {
    private static final double Radius =6;
    public static void main(String[] args) {
        double area= Math.PI* Radius*Radius;
        double circunference= 2*Math.PI*Radius;
        System.out.println( " area je: " + area);
        System.out.println( " circunference je: " + circunference);

    }

}
