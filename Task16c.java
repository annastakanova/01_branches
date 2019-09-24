//На плоскости ХОY задана своими координатами точка А.
// Указать, где она расположена (на какой оси или в каком координатном угле).

package com.epam;

public class Task16c {
    public static void main(String[] args) {
        int x = -5;
        int y = 3;
        if(x==0 && y==0) System.out.println("точка расположена в начале координат");
        else if (x==0 && y!=0) System.out.println("точка расположена в на оси х");
        else if (x!=0 && y==0) System.out.println("точка расположена в на оси y");
        else if (x>0 && y>0) System.out.println("точка расположена в I четверти");
        else if (x<0 && y>0) System.out.println("точка расположена вo II четверти");
        else if (x<0 && y<0) System.out.println("точка расположена в III четверти");
        else System.out.println("точка расположена в IV четверти");
    }
}
