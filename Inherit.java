//inheritance program
class Vehical
{
    protected String brand="Ford";
    public void honk()
    {
        System.out.println("tuut,tuut");
    }
}
class Inherit extends Vehical
{
    private String modelname="mustang";//car attribute
    public static void main(String[]args)
    {
        //create a mycar object
        Inherit mycar=new Inherit();
        mycar.honk();
        //display value of the brand attribute
        System.out.println(mycar.brand+" " +mycar.modelname);
}
    
    
}
