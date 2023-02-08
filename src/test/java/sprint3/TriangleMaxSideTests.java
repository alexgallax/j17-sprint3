package sprint3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleMaxSideTests {

    @Test
    public void maxSideTest() {
        Triangle triangle = new Triangle(2, 3, 4);

        assertEquals("Wrong max side", 4, triangle.maxSide());
    }
}
