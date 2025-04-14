class Shape{
    private String color;
    public Shape(String color){
        this.color=color;
    }

    public String getColor(){
        return color;
    }

}
class Circle extends Shape {
    private double radius;
    public Circle(String color,double radius){
        super(color);
        this.radius=radius;
    }
   
    public double getArea(){
        return radius;
    }
}


public class LabTask3 {
    public static void main (String[] args) {
        Shape s1=new Shape("Red");
        Circle c1=new Circle("Blue",5.0);
        System.out.println(s1.getColor());
        System.out.println(c1.getColor()+" "+c1.getArea());
      
}
}
