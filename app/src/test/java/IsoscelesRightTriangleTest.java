import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class IsoscelesRightTriangleTest {

    @Test
    public void testIsoscelesRightTriangleArea() {
        double leg = 3.0;
        IsoscelesRightTriangle triangle = new IsoscelesRightTriangle(leg);
        double expectedArea = 0.5 * leg * leg; // 4.5
        assertEquals(expectedArea, triangle.getArea(), 0.0001);
    }
    
    @Test
    public void testIsoscelesRightTrianglePerimeter() {
        double leg = 3.0;
        IsoscelesRightTriangle triangle = new IsoscelesRightTriangle(leg);
        double expectedPerimeter = leg + leg + Math.sqrt(leg * leg + leg * leg);
        assertEquals(expectedPerimeter, triangle.getPerimeter(), 0.0001);
    }
    
    @Test
    public void testIsoscelesRightTriangleNumberOfSides() {
        double leg = 3.0;
        IsoscelesRightTriangle triangle = new IsoscelesRightTriangle(leg);
        assertEquals(3, triangle.numberOfSides());
    }
}
