package com.RuanJiaHao;

/**
 * Hello world!
 */
public class App {

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }





  

    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null) {
            return false;
        }else if (a.length != b.length) {
            return false;
        } else if (a.length == 1 && a.length == b.length) {
            return (Math.pow(a[0], 2) != b[0]);
        } else if (a.length == b.length) {
            sort(a);
            sort(b);
            for (int i = 0; i < a.length; i++) {
                if (Math.pow(a[i], 2) != b[i]) {
                    return false;
                }
            }
        }
        return true;
    }//end comp

    public static int[] sort(int[] a) {
        int temp;

        for (int i = 1; i < a.length; i++) {
            if (a[i] < 0) {
                a[i] *= -1;
            }
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
        return a;
    }//end sort
}
