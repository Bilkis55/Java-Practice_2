enum Size1{
    SMALL, MEDIUM, LARGE, EXTRALARGE
}
 class Test{
    Size pizzaSize;
    public Test(Size pizzaSize)
    {
        this.pizzaSize=pizzaSize;
    }
    public void orderpizza()
    {
        switch(pizzaSize)
        {
            case SMALL:
                System.out.println("i ordered a small size pizza");
        
        break;
        case MEDIUM:
            System.out.println("I ordered a medium size pizza");
            break;
        default:
            System.out.println("I dont know which one to order");
            break;
    }
}
 }
class Newclass1
{
    public static void main(String[]args)
    {
        Test t1=new Test(Size.MEDIUM);
        t1.orderpizza();
    }
}
  