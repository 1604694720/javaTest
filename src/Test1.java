public class Test1 {
    public static void main(String[] args) {
        Cir circle=new Cir(10);
        System.out.println(circle.mianji());

    }
}
class Cir{
    int r;
    int pai=3;
    public Cir(int r){
        this.r=r;
    }
    public int mianji(){
        return pai*this.r*this.r;
    }
}