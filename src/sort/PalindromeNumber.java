package sort;

import java.util.ArrayList;

/**
 * Created by hcq on 2017/8/15.
 */
public class PalindromeNumber {

//    public static Boolean isPalindrome(int x) {
//        int midd = 0;
//        int left = 0;
//        int right = 0;
////        System.out.println(String.valueOf(x).length());
//        String s = String.valueOf(x);
//        int length = s.length();
//        if (length == 1) {
//            return true;
//        }
//        if (length / 2 == 0) {
//            midd = length / 2;
//            left = midd - 1;
//            right = midd;
//        } else {
//            midd = length / 2 + 1;
//            left = midd - 1;
//            right = midd - 1;
//        }
//        boolean isPal = true;
//        for (int i = right; i < length; i++) {
//            if (s.charAt(left) != s.charAt(right)) {
//                isPal = false;
//            }
//            left--;
//            right++;
//        }
//        return isPal;
//    }

    public static Boolean isPalindrome(int x) {
        if (x > Integer.MAX_VALUE || x < -Integer.MAX_VALUE || x < 0) {
            return false;
        }
        int t = x;
        long afterRe = 0;
        int count = 0;
        while (t % 10 != 0 || t / 10 != 0) {
            afterRe = afterRe * 10 + t % 10;
            t = t / 10;
            count++;
        }
        if (afterRe > Integer.MAX_VALUE || afterRe < -Integer.MAX_VALUE) {
            return false;
        }
        int afterRe1 = (int) afterRe;
        int be = (int) (x / (Math.pow(10, count / 2)));
        int re = (int) (afterRe1 / (Math.pow(10, count / 2)));
        System.out.println(re + "   " + be);
        if (re == be) {
            return true;
        } else {
            return false;
        }
    }

    public static Boolean isPalindrome2(int x) {
        int be=x;
        int afterRe = 0;
        if (x > Integer.MAX_VALUE || x < -Integer.MAX_VALUE || x < 0) {
            return false;
        }
        while (x % 10 != 0 || x / 10 != 0) {
            afterRe = afterRe * 10 + x % 10;
            x = x / 10;
        }
        if (afterRe > Integer.MAX_VALUE || afterRe < -Integer.MAX_VALUE) {
            return false;
        }
        if (afterRe == be) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
//        System.out.println(isPalindrome2(1));
        ArrayList a = new ArrayList();
        a.add("6");
        System.out.println( a.indexOf("1"));
    }
}
