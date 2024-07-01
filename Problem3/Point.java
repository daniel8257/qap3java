package Problem3;

public class Point {
    private float x;
    private float y;

    public Point() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getter and Setter methods
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    // Set both x and y
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Get both x and y
    public float[] getXY() {
        return new float[]{x, y};
    }

    // toString method
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

