////////////////////////////////////////////////////////////////////
// [Agnese] [Carraro] [2068226]
// [Giovanni Battista] [Matteazzi] [2082852]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {
    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }
    private static String printAsciiArt(String romanNumber){
        String result = "";

        // lettera I
        String[] i = {" _____ ", "|_   _|", "  | |  ",
                "  | |  ", " _| |_ ", "|_____|"};

        // lettera V
        String[] v = {" __      __ ", " \\ \\    / / ",
                "  \\ \\  / /  ", "   \\ \\/ /   ",
                "    \\  /    ", "     \\/     "};

        // lettera X
        String[] x = {" __   __ ", " \\ \\ / / ", "  \\ V /  ",
                "   > <   ", "  / . \\  ", " /_/ \\_\\ "};

        if (romanNumber != null) {
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < romanNumber.length(); k++) {
                    char letter = romanNumber.charAt(k);
                    if (letter == 'I') {
                        result = result.concat(i[j]);
                    } else if (letter == 'V') {
                        result = result.concat(v[j]);
                    } else if (letter == 'X') {
                        result = result.concat(x[j]);
                    }
                }
                result = result.concat("\n");
            }
        }

        if (!result.isEmpty()) {return result;}
        else {return null;}
    }
}
