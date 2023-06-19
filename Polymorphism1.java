//Polymorphism using method overriding
class Language
{
public void displayInfo()
{
System.out.println("Common English Language");
}
}
class Java extends Language
{
    @Override
    public void displayInfo()
    {
        System.out.println("Java programming");
    }
}
        
public class Polymorphism1 
{
    public static void main(String[]args)
    {
        //create an object of java class
        Java j1=new Java();
        j1.displayInfo();
        //create an object of Language class
        Language l1=new Language();
        l1.displayInfo();
    }
    
}
