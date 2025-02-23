import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class CircleTest {

    @Test
    public void testCircleArea() {
        double radius = 3.0;
        Circle circle = new Circle(radius);
        double expectedArea = Math.PI * radius * radius;
        assertEquals(expectedArea, circle.getArea(), 0.0001);
    }
    
    @Test
    public void testCirclePerimeter() {
        double radius = 3.0;
        Circle circle = new Circle(radius);
        double expectedPerimeter = 2 * Math.PI * radius;
        assertEquals(expectedPerimeter, circle.getPerimeter(), 0.0001);
    }
}