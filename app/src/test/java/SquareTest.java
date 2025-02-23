import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SquareTest {

    @Test
    public void testSquareArea() {
        double side = 5.0;
        Square square = new Square(side);
        double expectedArea = side * side; // 25.0
        assertEquals(expectedArea, square.getArea(), 0.0001);
    }
    
    @Test
    public void testSquarePerimeter() {
        double side = 5.0;
        Square square = new Square(side);
        double expectedPerimeter = 4 * side; // 20.0
        assertEquals(expectedPerimeter, square.getPerimeter(), 0.0001);
    }
    
    @Test
    public void testSquareNumberOfSides() {
        double side = 5.0;
        Square square = new Square(side);
        assertEquals(4, square.numberOfSides());
    }
}
