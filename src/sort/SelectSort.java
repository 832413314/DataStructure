package sort;

import java.util.Random;

/**
 * Created by hcq on 2017/7/7.
 */
public class SelectSort {
    /*选择排序思路
        将第一个元素与数组的其他元素相比较，如果其他元素小于第一个数的话就调换位置
        以此类推循环到最后


    */
    public static void selectSort(int[] a){
        int t=0;
        for (int i =0;i<a.length-1;i++){
            for (int j = i+1;j<a.length;j++){
                if (a[i]>=a[j]){
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
    }

    public static  void main (String [] args) {
        Random r = new Random();

        int[] a = new int[10];
        for (int i=0 ;i<a.length;i++){
            a[i]=r.nextInt(10);
        }
        for (int i=0 ;i<a.length;i++){
            System.out.print(a[i]+",");
        }

        System.out.println("排序后为：");
        selectSort(a);
        for (int i=0 ;i<a.length;i++){
            System.out.print(a[i]+",");
        }
    }
}
