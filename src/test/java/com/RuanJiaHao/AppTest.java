package com.RuanJiaHao;

import org.junit.Test;
import org.junit.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest {

  /**
   * Rigorous Test :-)
   */
  @Test
  public void test1() {
      int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
      int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
      Assert.assertEquals(true, App.comp(a, b));
  }

    @Test
    public void test2() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{11 * 11, 121 * 121, 144 * 144, 190 * 190, 161 * 161, 19 * 19, 144 * 144, 19 * 19};
        Assert.assertEquals(false, App.comp(a, b));
    }

    @Test
    public void test3() {
        int[] a = new int[]{};
        int[] b = new int[]{1};
        Assert.assertEquals(false, App.comp(a, b));
    }

    @Test
    public void test4() {
        int[] a = new int[]{};
        int[] b = new int[]{};
        Assert.assertEquals(true, App.comp(a, b));
    }

    @Test
    public void test5() {
        int[] a = new int[]{};
        int[] b = null;
        Assert.assertEquals(false, App.comp(a, b));
    }

    @Test
    public void test6() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11, 1008};
        int[] b = {11 * 11, 121 * 121, 144 * 144, 190 * 190, 161 * 161, 19 * 19, 144 * 144, 19 * 19};
        Assert.assertEquals(false, App.comp(a, b));
    }

    @Test
    public void test7() {
        int[] a = new int[]{121, 1440, 191, 161, 19, 144, 195, 11};
        int[] b = {11 * 11, 121 * 121, 1440 * 1440, 191 * 191, 161 * 161, 19 * 19, 144 * 144, 195 * 195};
        Assert.assertEquals(true, App.comp(a, b));
    }

    @Test
    public void test8() {
        int[] a = new int[]{0, -14, 191, 161, 19, 144, 195, 1};
        int[] b = {1, 0, 14 * 14, 191 * 191, 161 * 161, 19 * 19, 144 * 144, 195 * 195};
        Assert.assertEquals(true, App.comp(a, b));
    }

    @Test
    public void test9() {
        int[] a = new int[]{0, -14, 191, 161, 19, 144, 195, 1, 2};
        int[] b = {1, 0, 14 * 14, 191 * 191, 161 * 161, 19 * 19, 144 * 144, 195 * 195, 3};
        Assert.assertEquals(false, App.comp(a, b));
    }

    @Test
    public void test10() {
        int[] a = new int[]{2, 2, 3};
        int[] b = {4, 9, 9};
        Assert.assertEquals(false, App.comp(a, b));
    }

    @Test
    public void test1a() {
        int[] a = new int[]{2, 2, 3};
        int[] b = {4, 4, 9};
        Assert.assertEquals(true, App.comp(a, b));
    }

    @Test
    public void test2a() {
        int[] a = new int[]{4, 4};
        int[] b = {1, 31};
        Assert.assertEquals(false, App.comp(a, b));
    }

    @Test
    public void test3a() {
        int[] a = new int[]{3, 4};
        int[] b = {0, 25};
        Assert.assertEquals(false, App.comp(a, b));
    }
}
