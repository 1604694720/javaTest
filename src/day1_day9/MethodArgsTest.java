package day1_day9;

import java.util.Arrays;

/*
jdk-5.0 新增
可变个数形参的方法
2.具体使用:
 2.1 可变个数形参的格式：数据类型...变量名
 2.2 当调用可变个数形参的方法时，传入的参数个数可以是：0个，1个，2个...
 2.3 可变个数形参的方法与本类中方法名相同，形参不同的方法之间构成重载
 2.4 在声明时要在末尾
 2.5 可变个数形参在方法的形参中，最多只能声明一个可变形参。
 */
public class MethodArgsTest {
    public static void main(String[] args) {
        MethodArgsTest test = new MethodArgsTest();
        test.show(12);
        test.show("hello");
        test.show("hell","word");
    }
    public void show(int i){
    }
    public void show(String s){
    }
    public void show(String ... strs){
        System.out.println(Arrays.toString(strs));
    }
}


