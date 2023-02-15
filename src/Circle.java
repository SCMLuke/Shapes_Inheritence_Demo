public class Circle extends Shape {

    private int radius;

    public Circle (String shapeName, String shapeColour, int radius) {
        super(shapeName, shapeColour);
        this.radius = radius;
    }

    @Override
    public Double getArea() {
        return Math.PI*(radius*radius);
    }

}
