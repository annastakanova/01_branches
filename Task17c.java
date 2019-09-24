//Даны целые числа m, n.
// Если числа не равны, то заменить каждое из них одним и тем же числом, равным большему из исходных,
// а если равны, то заменить числа нулями.

package com.epam;

public class Task17c {
    public static void main(String[] args) {
        int m = 2;
        int n = 5;

        if (m==n){
            m = 0;
            n = 0;
            System.out.println("числа m и n равны и им присвоено значения " +m+ " и " +n+ " соответственно");
            }
        else if (m!=n) {
            if (m>n)
                n = m;
            else if (n>m)
                m = n;
            System.out.println("числа m и n не равны и им присвоено значения " +m+ " и " +n+ " соответственно");
        }
    }
}
