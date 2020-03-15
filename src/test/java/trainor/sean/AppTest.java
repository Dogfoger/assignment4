package trainor.sean;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest extends App
{

    App a = new App();

    @Test
    public void testMap() {

     Assert.assertEquals(0, a.mapSean());

    }

    @Test
    public void setTest() {

        assertEquals("Oru", a.set());
    }

    @Test
    public void listTest() {
        assertEquals(10, a.listWork());
    }
}
