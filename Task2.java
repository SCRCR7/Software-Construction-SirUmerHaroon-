
class Rectangle{
    private double length;
    private double width;
    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    public double getMul(){
        return length*width;
    }
    
}
public class Task2{
    public static void main (String[] args){

        Rectangle r1=new Rectangle(40,20);
           System.out.println(r1.getMul());
    }
}