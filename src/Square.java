import java.util.Enumeration;

public class Square extends Shape {

    private double sideLength;

    public Square (String shapeName, String shapeColour, int sideLength) {
        super(shapeName, shapeColour);
        this.sideLength = sideLength;
    }

    @Override
    public Double getArea() {
        return (sideLength*sideLength);
    }

}
