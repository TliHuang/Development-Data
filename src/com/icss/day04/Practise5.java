package com.icss.day04;

public class Practise5 {
    public static void main(String[] args) {
        int x = 1;
      /*x+y+z=100;
      5*x+3*y+z/3=100;*/
        while (x < 20) {
            int y = 1;
            while (y < 33) {
                int z = 0;
                while (z < 100) {
                    if (x + y + z == 100 && 5 * x + 3 * y + z / 3 == 100) {
                        System.out.println("公鸡" + x + "只," + "母鸡" + y + "只," + "小鸡" + z + "只");
                    }
                    z += 3;
                }
                y++;
            }
            x++;
        }
    }
}
