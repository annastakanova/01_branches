//Даны три числа a, b, с. Определить, какое из них равно d.
// Если ни одно не равно d, то найти max(d — a, d — b, d —c).

package com.epam;

public class Task28c {
    public static void main(String[] args) {
        int a = 9;
        int b = -6;
        int c = 21;
        int d = 222;

        if (a==d) System.out.println("a=d, ");
        else if (b==d) System.out.println("b=d, ");
        else if (c==d) System.out.println("c=d, ");

        else {
            int da = d - a;
                //System.out.println(da);
            int db = d - b;
                //System.out.println(db);
            int dc = d - c;
                //System.out.println(dc);


            int max = da;
            if (db > dc && db > da)
                max = db;
            else if (dc > da && dc > db)
                max = dc;
            System.out.println(max);
        }
    }
}
