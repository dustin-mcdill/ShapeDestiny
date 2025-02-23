import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void testRectangleArea() {
        double length = 4.0;
        double width = 5.0;
        Rectangle rectangle = new Rectangle(length, width);
        double expectedArea = length * width;
        assertEquals(expectedArea, rectangle.getArea(), 0.0001);
    }
    
    @Test
    public void testRectanglePerimeter() {
        double length = 4.0;
        double width = 5.0;
        Rectangle rectangle = new Rectangle(length, width);
        double expectedPerimeter = 2 * (length + width);
        assertEquals(expectedPerimeter, rectangle.getPerimeter(), 0.0001);
    }
    
    @Test
    public void testRectangleNumberOfSides() {
        double length = 4.0;
        double width = 5.0;
        Rectangle rectangle = new Rectangle(length, width);
        assertEquals(4, rectangle.numberOfSides());
    }
}
