//Implementing Multiple Interface
//to use the sqrt function
import java.lang.Math;
interface Polygon1
{
    void getArea();
    //calculate the perimeter of a Polygon
    default void getPerimeter(int...sides)
    {
        int perimeter=0;
        for(int side : sides)
        {
            perimeter +=side;
        }
        System.out.println("Perimeter :" + perimeter);
    }
    
}
class Triangle implements Polygon1
{
    private int a,b,c;
    private double s,area;
    // initializing sides of a triangle
    Triangle(int a, int b, int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
        s=0;
    }
    //calculate the area of tiangle
    public void getArea()
    {
        s=(double)(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area : " + area);
    }
}
public class Inter3 {
    public static void main(String[]args)
    {
        Triangle t1=new Triangle(2,3,4);
        //calls the method of the Triangle class
        t1.getArea();
        //calls the method of polygon
        t1.getPerimeter(2,3,4);
    }
    
}
