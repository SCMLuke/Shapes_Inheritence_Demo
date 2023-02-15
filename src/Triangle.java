public class Triangle extends Shape {

    private double baseLength;
    private double height;

    public Triangle (String shapeName, String shapeColour, double baseLength, double height) {
        super(shapeName,shapeColour);
        this.baseLength = baseLength;
        this.height = height;
    }

    @Override
    public Double getArea() {
        return (baseLength*height)/2;
    }

}
