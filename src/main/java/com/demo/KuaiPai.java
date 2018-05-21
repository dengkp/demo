package com.demo;

import java.util.Arrays;

/**
 * Author:   dengkp
 * Date:     2018/5/9 15:56
 * Description: kuaipai
 * Since: 1.0
 */
public class KuaiPai {


    public static void main(String[] args) {
        int[] array = new int[]{3, 25, 34, 11, 118, 13};
        sort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));

    }

    public static int partition(int[] array, int low, int high) {
        int temp = array[low];
        while (low < high) {
            while (low < high && array[high] >= temp) {
                high--;
            }

            array[low] = array[high];
            while (low < high && array[low] <= temp) {
                low++;
            }
            array[high] = array[low];
        }
        array[high] = temp;
        return high;
    }

    public static void sort(int[] array, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int index = partition(array, lo, hi);
        sort(array, lo, index - 1);
        sort(array, index + 1, hi);
    }

}
