package com.luis;

public class SharedDigit {

    public static boolean hasSharedDigit(int x, int y) {
        if((x < 10 || x > 99) || (y < 10 || y > 99)) {
            return false;
        }
        int xd = x / 10;
        int xm = x % 10;
        int yd = y / 10;
        int ym = y % 10;
        if((xd == yd) || (xm == ym) || (xd == ym) || (yd == xm)) {
            return true;
        }
        return false;
    }
}
