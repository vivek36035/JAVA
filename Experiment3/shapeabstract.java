import java.util.*;

abstract class Shape {
    double dim1, dim2;

    Shape(double d1, double d2) {
        dim1 = d1;
        dim2 = d2;
    }

    abstract void area();
}

class Triangle extends Shape {
    Triangle(double b, double h) {
        super(b, h);
    }

    void area() {
        System.out.println("Area of a Triangle is : " + 0.5 * dim1 * dim2);
    }
}

class Rectangle extends Shape {
    Rectangle(double l, double b) {
        super(l, b);
    }

    void area() {
        System.out.println("Area of a Rectangle is : " + dim1 * dim2);
    }
}

public class shapeabstract {
    public static void main(String[] args) {
        Shape s1;
        s1 = new Triangle(23.1, 12.3);
        s1.area();
        s1 = new Rectangle(15.2, 17.1);
        s1.area();
    }
}
