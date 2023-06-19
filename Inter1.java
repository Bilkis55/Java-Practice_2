//java Interface
interface Polygon
{
    void getArea(int length, int Breadth);
    }
//implement the polygon interface
class Rectangle implements Polygon
{
    //implements of abstract method
    public void getArea(int length,int breadth)
    {
        System.out.println("The area of the rectangle is  " +(length*breadth));
    }
}

public class Inter1 {
    public static void main(String[]args)
    {
        Rectangle r1=new Rectangle();
        r1.getArea(5,6);
    }
    
}
