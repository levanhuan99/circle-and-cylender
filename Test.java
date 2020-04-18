package CircleAndCylender;

public class Test {
    public static void main(String[] args) {
        Circle circle=new Circle(5,"black");
        System.out.println(circle);
        System.out.println("dien tich la :"+ circle.getArea());


        Cylender cylender=new Cylender(6,"blue",15);
        System.out.println(cylender);
        System.out.println("the tich la :"+ cylender.getVolum());
    }
}
