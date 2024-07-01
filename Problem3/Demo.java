package Problem3;

public class Demo {
    public static void main(String[] args) {
        // Create Point object
        Point p1 = new Point(2.0f, 3.0f);
        System.out.println(p1);

        // Create MovablePoint object
        MovablePoint mp1 = new MovablePoint(2.0f, 3.0f, 1.0f, 1.5f);
        System.out.println(mp1);

        // Move the MovablePoint object
        mp1.move();
        System.out.println(mp1);

        // Move again
        mp1.move();
        System.out.println(mp1);
    }
}

