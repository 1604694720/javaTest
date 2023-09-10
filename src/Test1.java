public class Test1 {
    public static void main(String[] args) {
        Circle circle=new Circle(10);
        System.out.println(circle.mianji());

    }
}
class Circle{
    int r;
    int pai=3;
    public Circle(int r){
        this.r=r;
    }
    public int mianji(){
        return pai*this.r*this.r;
    }
}