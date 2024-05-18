////////////////////////////////////////////////////////////////////
// [Agnese] [Carraro] [2068226]
// [Giovanni Battista] [Matteazzi] [2082852]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        String result = "";

        String[] c2 = {"X","XX","XXX","XL","L", "LX", "LXX", "LXXX", "XC"};
        String[] c1 = {"I","II","III","IV","V", "VI", "VII", "VIII", "IX"};

        int n = number/10;
        if (n > 0 && n < 10) {
            result = result.concat(c2[n-1]);
            number  = number - n*10;
        }

        if (number > 0 && number < 10) {
            result = result.concat(c1[number-1]);
        }

        if (!result.isEmpty()) {return result;}
        else {return null;}
    }
}
