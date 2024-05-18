////////////////////////////////////////////////////////////////////
// [Agnese] [Carraro] [2068226]
// [Giovanni Battista] [Matteazzi] [2082852]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class IntegerToRomanTest {
    @Test
    public void NullTest() {
        assertNull(IntegerToRoman.convert(-2));
        assertNull(IntegerToRoman.convert(0));
        assertNull(IntegerToRoman.convert(25));
    }


    @Test
    public void NumbersTest() {
        assertEquals("II", IntegerToRoman.convert(2));
        assertEquals("V", IntegerToRoman.convert(5));
        assertEquals("VIII", IntegerToRoman.convert(8));
    }

}
