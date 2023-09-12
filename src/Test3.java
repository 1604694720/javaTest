public class Test3 {
    public static void main(String[] args) {
        PassObject passObject = new PassObject();
        Circle circle = new Circle();
        passObject.printAreas(circle,5);
    }
}
class Circle{
    double radius;
    public double findArea() {
        return radius*radius*Math.PI;
    }
}
class PassObject{
    public void printAreas(Circle c,int time){
        for (int i=1;i<=time;i++){
            c.radius=i;
            System.out.println(c.radius+"\t"+c.findArea());
        }
    }
}
