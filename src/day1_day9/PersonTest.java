/*
一、设计类，设计类的成员
属性=成员变量=field=域、字段
方法=成员方法=函数=method

创建类的对象=类的实例化=实例化类

二、类和对象的使用（面对对象思想落地的实现）：
1.创建类，设计类的对象
2.创建类的对象
3.调用对象

三、如果创建了一个类的多个对象，这每个对象都独立的拥有一套类的属性。（非static）
   如果我们修改了一个对象的属性a的值，另一个对象不受影响。
 */
public class PersonTest {
    public static void main(String[] args) {
        //创建Person类的对象
        Person p1 = new Person();
        //调用对象的结构：属性、方法
        //调用属性：“对象.属性”
        p1.name="Tom";
        p1.isMale=true;
        System.out.println(p1.name);

        //调用方法：“对象.方法”
        p1.eat();
        p1.sleep();
        p1.talk("English");
        //******************************************************
        Person p2=new Person();
        System.out.println(p2.name);//Tom? null? 报错？
        System.out.println(p2.isMale);//null。默认初始化值。
        //****************************************
        //p1变量的地址值给了p3，导致p1和p3都指向了对空间中同一个对象实体
        Person p3=p1;
        System.out.println(p3.name);//Tom

        p3.age=10;
        System.out.println(p1.age);//10

        Person p4=new Person();
        p4=p1;
        System.out.println(p4.name);

        //匿名对象
//        new Person().eat();
//        new Person().sleep();

        new Person().name="Jon";
        System.out.println(new Person().name);//null
    }

}
class Person{
    //属性
    String name;
    int age=1;
    boolean isMale;

    //方法
    public void eat(){
        System.out.println("人可以吃饭");
    }
    public void sleep(){
        System.out.println("人可以睡觉");
    }
    public void talk(String language){
        System.out.println("人可以说话，使用语言的是"+language);
    }
}
