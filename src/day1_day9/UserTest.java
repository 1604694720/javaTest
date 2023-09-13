package day1_day9;

/*
类中属性的使用

属性（成员变量）vs 局部变量
1.相同点
   格式：类型 名 = 变量值
   先声明，后使用
   都有其对应的作用域

2.不同点：
  2.1 在类中声明的位置不同
  属性：直接定义在类的一对{}内
  局部变量：生命在方法内，方法形参，代码块，构造器形参，构造器内部的变量
  2.2 关于权限修饰符不同
  属性：可以在声明属性时，指明其权限，使用权限修饰符。
       常用的权限修饰符：private、public、缺省、protected
  局部变量：不可以使用修饰符
  2.3 默认初始化值的情况：
  属性：类的属性，根据其类型，都有默认初始化值。
       整型：0
       浮点型：0
       字符型：0
       布尔型：false
       引用数据类型：null
  局部变量：没有默认初始化值.
          调用时赋值即可
  2.4 在内存中加载的位置不同：
  属性：加载在对空间中
  局部变量：加载到栈空间中
 */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.name);
        System.out.println(u1.age);
        System.out.println(u1.isMale);

        u1.talk("日语");
        u1.eat();
    }
}
class User{
    String name;
    public int age;
    boolean isMale;
    public void talk(String language){//局部变量
        System.out.println("我们使用"+language);
    }
    public void eat(){
        String food="烙饼";//局部变量
        System.out.println("北方人喜欢吃"+food);
    }

}

