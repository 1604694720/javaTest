import java.util.Arrays;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil util = new ArrayUtil();
        int[] arr = new int[]{1, 3, 4, 5, 7, 9, 2, 0, 6, 8};
        int max = util.getMax(arr);
        System.out.println("最大值为：" + max);
        int min = util.getMin(arr);
        System.out.println("最小值为：" + min);
        System.out.println("查找6在哪");
        System.out.println(util.getIndex(arr, 6));
        System.out.println("排序前");
        util.print(arr);
        System.out.println("排序后");
        util.sort(arr);
        util.print(arr);
        int sum= util.getSum(arr);
        System.out.println("数组总和" + sum);
        System.out.println("反转数组后：");
        util.reverse(arr);
        util.print(arr);
    }
}
