import java.util.Scanner;

public class Test4 {
    //计算三角形的面积
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("底边长和高：");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println(new TriAngle(a, b).ji());
    }
}
class TriAngle{
    private double base;//边长
    private double hight;//高

    public TriAngle(double base,double hight){
        this.base=base;
        this.hight=hight;
    }
    public double ji(){
        return base*hight/2;
    }
}
