import java.util.Scanner;// Import the Scanner class
class Scan {
    public static void main(String[]args)
    {
        Scanner myobj=new Scanner(System.in);
        System.out.println("Enter user name :");
        String username =myobj.nextLine();
        System.out.println("user name is : " + username);
    }
}
  