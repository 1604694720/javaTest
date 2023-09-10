/*
类中方法的声明和使用

方法：描述类应该具有的功能。
比如：Math类：sqrt（）、random（）、...

1.举例：
 public void  eat(){}
 public void sleep(int hour){}
 public String getName(){}
 public String getNation(String nation){}

 2.方法的声明：权限修饰符 返回值类型 方法名(形参列表){
                      方法体
             }

 3.说明：
   3.1 关于权限修饰符：默认方法的权限修饰符都使用public
   private、public、缺省、protected
   3.2 返回值类型：有返回值(声明方法时，指定返回值类型，使用return返回)，
                 无返回值(声明方法时，使用void表示，一般不使用return，只能”return;”表示结束方法
   3.3 方法名：属于标识符，遵循标识符的规则和规范，“见名知意”。
   3.4 形参列表：方法可以声明0个，或者多个形参。
   3.5 方法体：方法功能的体现
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer cust1 = new Customer();
        cust1.eat();

    }

}

//客户类
class Customer{
    //属性
    String name;
    int age;
    boolean isMale;
    //方法
    public void  eat() {
        System.out.println("客户吃饭");
    }
    public void sleep(int hour) {
        System.out.println("休息了" + hour + "小时");
    }
    public String getName(){
        return name;
    }
    public String getNation(String nation){
        return "我的国际是"+nation;
    }


}
