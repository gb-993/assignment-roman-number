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
        assertNull(RomanPrinter.print(1830));
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
        assertEquals("""
                 __   __  __   __  __      __  _____  _____  _____\s
                 \\ \\ / /  \\ \\ / /  \\ \\    / / |_   _||_   _||_   _|
                  \\ V /    \\ V /    \\ \\  / /    | |    | |    | | \s
                   > <      > <      \\ \\/ /     | |    | |    | | \s
                  / . \\    / . \\      \\  /     _| |_  _| |_  _| |_\s
                 /_/ \\_\\  /_/ \\_\\      \\/     |_____||_____||_____|
                """, RomanPrinter.print(28));
        assertEquals("""
                 __   __  __   __  __   __  _____  __   __\s
                 \\ \\ / /  \\ \\ / /  \\ \\ / / |_   _| \\ \\ / /\s
                  \\ V /    \\ V /    \\ V /    | |    \\ V / \s
                   > <      > <      > <     | |     > <  \s
                  / . \\    / . \\    / . \\   _| |_   / . \\ \s
                 /_/ \\_\\  /_/ \\_\\  /_/ \\_\\ |_____| /_/ \\_\\\s
                """, RomanPrinter.print(39));
        assertEquals("""
                  _       _____\s
                 | |     |_   _|
                 | |       | | \s
                 | |       | | \s
                 | |____  _| |_\s
                 |______||_____|
                """, RomanPrinter.print(51));
        assertEquals("""
                  _       __   __  __   __  _____  _____  _____\s
                 | |      \\ \\ / /  \\ \\ / / |_   _||_   _||_   _|
                 | |       \\ V /    \\ V /    | |    | |    | | \s
                 | |        > <      > <     | |    | |    | | \s
                 | |____   / . \\    / . \\   _| |_  _| |_  _| |_\s
                 |______| /_/ \\_\\  /_/ \\_\\ |_____||_____||_____|
                """, RomanPrinter.print(73));
        assertEquals("""
                 __   __    _____  _____  __   __\s
                 \\ \\ / /   / ____||_   _| \\ \\ / /\s
                  \\ V /   | |       | |    \\ V / \s
                   > <    | |       | |     > <  \s
                  / . \\   | |____  _| |_   / . \\ \s
                 /_/ \\_\\   \\_____||_____| /_/ \\_\\\s
                """, RomanPrinter.print(99));
    }
}
