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
 */
public class UserTest {
}
class User{
    private String name;
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

