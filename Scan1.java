import java.util.Scanner;

class Scan1 {
    
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the name");
        //String input
        String name=obj.nextLine();
        //Numerical input
        System.out.println("Enter no");
         int age=obj.nextInt();
         System.out.println("enter your Salary");
        double salary=obj.nextDouble();
        //Output input by user
        System.out.println("Name :" +name);
        System.out.println("Age:" + age);
        System.out.println("Salary :" + salary);
        
    }
    
}
