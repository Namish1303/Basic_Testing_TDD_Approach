import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class typeTest {

    Triangle triangle;
    @BeforeEach
    void setup()
    {
        triangle = new Triangle();
    }
    @Test
    void checkEquilateral()
    {
        Assertions.assertEquals("Equilateral",triangle.kindofTriangle(7,7,7));
    }
}
