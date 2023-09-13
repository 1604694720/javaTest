package day1_day9;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        //1.boolean equals(int[] a,int[] b);判断2个数组是否相等。
        int[] a = {1,2,3,4};
        int[] b = {1,3,2,4};
        boolean c = Arrays.equals(a,b);
        System.out.println(c);

        //2.String toString(int[] a);输出数组信息。
        System.out.println(Arrays.toString(a));

        //3.void fill(int[] a,int val);将指定的值填充到数组(替换)。
        Arrays.fill(a,10);
        System.out.println(Arrays.toString(a));

        //4.void sort(int[] a);对数组进行排序。
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));

        //5.int binarySearch(int[] a,int key);二分查找。
        int[] d = new int[] {-98,-2,0,5,9,26,60,84,100};
        int index = Arrays.binarySearch(d,100);
        System.out.println(index);//找到了
        index = Arrays.binarySearch(d,50);
        System.out.println(index);//未找到返回负数
    }
}
