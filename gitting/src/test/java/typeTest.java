import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class typeTest {
    Triangle triangle;
    @Before
    public void typeTest()
    {
        triangle = new Triangle();
    }

    @Test
    public void checkEquilateral()
    {
        Assertions.assertEquals("Equilateral",triangle.kindOfTriangle(7,7,7));
    }


}
