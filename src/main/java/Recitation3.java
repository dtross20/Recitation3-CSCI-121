import java.util.Scanner;

public class Recitation3 {
    public static void main(String[] argv)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter x:");
        double x = scan.nextDouble();

        System.out.println("Enter y:");
        double y = scan.nextDouble();

        Point point = new Point(x, y);
        Circle circle16 = new Circle(point, 16.0);
        Circle circle40 = new Circle(new Point(14, 12), 40.0);

        if (circle16.intersects(circle40)) {
            System.out.println("Circles intersect!");
        } else {
            System.out.println("Circles do not intersect!");
        }



    }
}
