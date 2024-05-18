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
        assertNull(IntegerToRoman.convert(1563));


    }
    @Test
    public void NumbersTest() {
        assertEquals("II", IntegerToRoman.convert(2));
        assertEquals("V", IntegerToRoman.convert(5));
        assertEquals("VIII", IntegerToRoman.convert(8));
        assertEquals("XI", IntegerToRoman.convert(11));
        assertEquals("XXXVI", IntegerToRoman.convert(36));
        assertEquals("LVII", IntegerToRoman.convert(57));
        assertEquals("LXII", IntegerToRoman.convert(62));
        assertEquals("LXXIX", IntegerToRoman.convert(79));
        assertEquals("LXXXV", IntegerToRoman.convert(85));
        assertEquals("XCIX", IntegerToRoman.convert(99));

        assertEquals("CLXIII", IntegerToRoman.convert(163));
        assertEquals("CCCLXIX", IntegerToRoman.convert(369));
        assertEquals("CDXLVII", IntegerToRoman.convert(447));
        assertEquals("DCXXIX", IntegerToRoman.convert(629));
        assertEquals("DCCLXXXIX", IntegerToRoman.convert(789));
        assertEquals("DCCCXCIX", IntegerToRoman.convert(899));
        assertEquals("CMXCVIII", IntegerToRoman.convert(998));
        assertEquals("M", IntegerToRoman.convert(1000));
    }

}
