public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();
}

class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with " + color.getColor());
    }
}

class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square with " + color.getColor());
    }
}

class Triangle extends Shape {
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a triangle with " + color.getColor());
    }
}

interface Color {
    String getColor();
}

class RedColor implements Color {
    @Override
    public String getColor() {
        return "red";
    }
}

class GreenColor implements Color {
    @Override
    public String getColor() {
        return "green";
    }
}

class BlueColor implements Color {
    @Override
    public String getColor() {
        return "blue";
    }
}

public class BridgePatternExample {
    public static void main(String[] args) {
        Color red = new RedColor();
        Shape circle = new Circle(red);
        circle.draw(); // Output: Drawing a circle with red

        Color green = new GreenColor();
        Shape square = new Square(green);
        square.draw(); // Output: Drawing a square with green

        Color blue = new BlueColor();
        Shape triangle = new Triangle(blue);
        triangle.draw(); // Output: Drawing a triangle with blue
    }
}