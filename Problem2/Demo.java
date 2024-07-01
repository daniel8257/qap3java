package Problem2;

public class Demo {
    public static void main(String[] args) {
        Circle C1 = new Circle(5.0, "blue", true);
        Rectangle R = new Rectangle(2.0, 3.0);
        Rectangle R1 = new Rectangle(2.0, 3.0, "green", false);
        Square Sq = new Square(4.0);
        Square Sq1 = new Square(4.0, "yellow", true);

        System.out.println(C1.toString());
        System.out.println("Area: " + C1.getArea() + ", Perimeter: " + C1.getPerimeter());

        System.out.println(R.toString());
        System.out.println("Area: " + R.getArea() + ", Perimeter: " + R.getPerimeter());

        System.out.println(R1.toString());
        System.out.println("Area: " + R1.getArea() + ", Perimeter: " + R1.getPerimeter());

        System.out.println(Sq.toString());
        System.out.println("Area: " + Sq.getArea() + ", Perimeter: " + Sq.getPerimeter());

        System.out.println(Sq1.toString());
        System.out.println("Area: " + Sq1.getArea() + ", Perimeter: " + Sq1.getPerimeter());
    }
}
