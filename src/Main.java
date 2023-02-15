public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle ("Circle","Blue",5);
        Square square = new Square("Square","Red",4);
        Triangle triangle = new Triangle("Triangle","Pink",3,4);

        System.out.println(circle.getArea());
        System.out.println(square.getArea());
        System.out.println(triangle.getArea());

    }
}