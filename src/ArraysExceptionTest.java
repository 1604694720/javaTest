/*
数组常见异常：
1.数组角标越界异常：ArrayIndexOutOfBoundsExcetion;
2.空指针异常：NullPointerException

 */
public class ArraysExceptionTest {
    public static void main(String[] args) {
        //1.角标异常
        int[] arr = new int[] {1,2,3,4,5};
        try {
            for (int i = 0;i<=arr.length;i++){
               int val = arr[i];
            }
        }
        catch (Exception e){
            System.out.println(e);
        }

        //2.空指针异常
        //情况一：
        try {
            arr=null;
            System.out.println(arr[0]);
        }
        catch (Exception e){
            System.out.println(e);
        }
        //情况2：
        try {
            int[][] arr1=new int[4][];
            System.out.println(arr1[0][0]);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
