package it.unipd.mtss;////////////////////////////////////////////////////////////////////
// [Agnese] [Carraro] [2068226]
// [Giovanni Battista] [Matteazzi] [2082852]
////////////////////////////////////////////////////////////////////

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class RomanPrinterTest {
    @Test
    public void NullTest() {
        assertNull(RomanPrinter.print(-8));
        assertNull(RomanPrinter.print(0));
        assertNull(RomanPrinter.print(19));
    }
    @Test
    public void NumbersTest() {
        assertEquals("""
                 _____  _____  _____\s
                |_   _||_   _||_   _|
                  | |    | |    | | \s
                  | |    | |    | | \s
                 _| |_  _| |_  _| |_\s
                |_____||_____||_____|
                """, RomanPrinter.print(3));
        assertEquals("""
                 _____  __      __\s
                |_   _| \\ \\    / /\s
                  | |    \\ \\  / / \s
                  | |     \\ \\/ /  \s
                 _| |_     \\  /   \s
                |_____|     \\/    \s
                """, RomanPrinter.print(4));
        assertEquals("""
                 __      __  _____  _____\s
                 \\ \\    / / |_   _||_   _|
                  \\ \\  / /    | |    | | \s
                   \\ \\/ /     | |    | | \s
                    \\  /     _| |_  _| |_\s
                     \\/     |_____||_____|
                """, RomanPrinter.print(7));
        assertEquals("""
                 _____  __   __\s
                |_   _| \\ \\ / /\s
                  | |    \\ V / \s
                  | |     > <  \s
                 _| |_   / . \\ \s
                |_____| /_/ \\_\\\s
                """, RomanPrinter.print(9));
    }
}
