public class Test2 {
    public static void main(String[] args) {
        int x=2,y=4;
        String n="Tom";
        double a=2.0,b=6.0,c=4.0;
        MOL mol = new MOL();
        MAX max = new MAX();
        mol.mOL(x);
        mol.mOL(x,y);
        mol.mOL(n);
        max.max(x,y);
        max.max(a,b);
        max.max(a,b,c);
    }

}
class MOL{
    public void mOL(int a){
        System.out.println(a * a);
    }
    public void mOL(int a,int b){
        System.out.println(a * b);
    }
    public void mOL(String a){
        System.out.println(a);
    }
}

class MAX{
    public void max(int a,int b){
        System.out.println(Math.max(a, b));
    }
    public void max(double a,double b){
        System.out.println(Math.max(a, b));
    }
    public void max(double a,double b,double c){
        System.out.println(Math.max(Math.max(a, b), c));
    }
}
