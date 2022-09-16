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

    @Test
    public void checkIsosceles()
    {
        Assertions.assertEquals("Isosceles",triangle.kindOfTriangle(7,7,8));
    }

    @Test
    public void checkIsosceles2()
    {
        Assertions.assertEquals("Isosceles",triangle.kindOfTriangle(8,7,7));

    }




}
