enum Size2
{
        SMALL, MEDIUM, LARGE, EXTRALARGE;

public String getSize2()
{
//this will refer to the object SMALL
switch(this)
{
case SMALL:
return"small";
case MEDIUM:
return "medium";
case LARGE:
return "large";
case EXTRALARGE:
return "extra large";
default:
return null;
}
}



//public class NewClass2 {
  public static void main(String[]args)
  {
      //call get Size ()
      //using the object small
System.out.println("the size of the pizza is " + Size2.SMALL.getSize2());
}
}