package CircleAndCylender;

public class Circle {
    private  double radius;
    private  String color;
    public Circle(){
    }
    public Circle(double radius,String color){
        this.color=color;
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return  this.radius*this.radius*Math.PI;
    }
    @Override
    public String toString(){
        return "A circle with radius is "+getRadius()+" and color is "+ getColor();
    }
}
class Cylender extends Circle{
    private  double height;
    public Cylender(){

    }
    public Cylender(double radius, String color, double height){
        super(radius,color);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolum(){
        return getRadius()*getRadius()*Math.PI*this.height;
    }
    @Override
    public String toString(){
        return "A cylender is created with raidus is "+getRadius()+","+getColor();
    }
}
