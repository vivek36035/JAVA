interface Shape {
    void area();
}

class Rectangle implements Shape {

    public Rectangle(double length, double breadth) {
        d1 = length;
        d2 = breadth;
    }

    double d1, d2;

    public void area() {
        System.out.println("Area of Rectangle is: " + d1 * d2);
    }
}

class Triangle implements Shape {
    public double base, height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    public void area() {
        System.out.println("Area of Triangle is: " + 0.5 * base * height);
    }
}

public class shapeinteraface {
    public static void main(String args[]) {
        Shape s1 = new Rectangle(23.5, 24.30);
        s1.area();
        Shape s2 = new Triangle(12.3, 21.7);
        s2.area();

    }

}
