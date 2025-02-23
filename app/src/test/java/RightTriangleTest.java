import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RightTriangleTest {

    @Test
    public void testRightTriangleArea() {
        double length = 3.0;
        double width = 4.0;
        RightTriangle triangle = new RightTriangle(length, width);
        double expectedArea = 0.5 * length * width;
        assertEquals(expectedArea, triangle.getArea(), 0.0001);
    }
    
    @Test
    public void testRightTrianglePerimeter() {
        double length = 3.0;
        double width = 4.0;
        RightTriangle triangle = new RightTriangle(length, width);
        double expectedPerimeter = length + width + Math.sqrt(length * length + width * width);
        assertEquals(expectedPerimeter, triangle.getPerimeter(), 0.0001);
    }
    
    @Test
    public void testRightTriangleNumberOfSides() {
        double length = 3.0;
        double width = 4.0;
        RightTriangle triangle = new RightTriangle(length, width);
        assertEquals(3, triangle.numberOfSides());
    }
}
