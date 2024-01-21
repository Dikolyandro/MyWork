public class Shape {
    public int radius;
    public int length;
    public int width;

    public Shape(int radius) {
        this.radius = radius;
    }

    public Shape(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void calculateArea() {
        System.out.println("Calculating area of a shape.");
    }

    public static class Circle extends Shape {
        public Circle(int radius) {
            super(radius);
        }

        @Override
        public void calculateArea() {
            System.out.println("Area of Circle: " + (3.14 * radius * radius));
        }
    }

    public static class Rectangle extends Shape {
        public Rectangle(int length, int width) {
            super(length, width);
        }

        @Override
        public void calculateArea() {
            System.out.println("Area of Rectangle: " + (length * width));
        }
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        circle.calculateArea();
        rectangle.calculateArea();
    }
}
