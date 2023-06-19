//Inner class example

class CPU{
    double price;
    //nested class
    class Processor
    {
        //memebers of nested class
        double cores;
        String manufacturer;
        double getCache()
        {
            return 4.3;
            
        }
    }
    //nested protected class
    protected class RAM
    {
        ///members of protected nested class
        double memory;
        String manufacturer;
        double getClockSpeed()
        {
            return 5.5;
            
        }
    }
    
}


public class Computer {
    public static void main(String[]args)
    {
        //create object of Outer class CPU
        CPU cpu=new CPU();
        //create object of inner class processor using outer class
        CPU.Processor processor=cpu.new Processor();
        //create an object of inner class RAM using outer class CPU
        CPU.RAM ram=cpu.new RAM();
        System.out.println("Processor Cache = " +processor.getCache());
        System.out.println("RAM Clock Speed=" +ram.getClockSpeed());
    }
    
}
