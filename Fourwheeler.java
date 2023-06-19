//Accessing Members of Outer Class within Inner Class
class Car
{
    String carname;
    String cartype;
    //Assign values using constructor 
    public Car(String name,String type)
    {
        this.carname=name;
        this.cartype=type;
       
    }
    //private method
    private String getCarName()
    {
        return this.carname;
    }
   //inner class
    class Engine
    {
        String engineType;
        void setEngine()
        {
            //accessing the cartype property of car
            if(Car.this.cartype.equals("4WD"))
            {
                //Invoking method getCarName()of car
                if(Car.this.getCarName().equals("Crysler"))
                {
                    this.engineType="Smaller";
                }
                else
                {
                    this.engineType="Bigger";
                }
                
            }
            else
            {
                this.engineType="Bigger";
            }
        }
        String getEngineType()
        {
            return this.engineType;
        }
    }
}
public class Fourwheeler {
    public static void main(String[]args)
    {
        //create an object of the outer class of Car
        Car car1=new Car("Mazda","8WD");
        //create an object of inner class
        Car.Engine engine=car1.new Engine();
        engine.setEngine();
        System.out.println("Engine type for 8WD=" +engine.getEngineType());
        Car car2=new Car("Crysler","4WD");
        Car.Engine c2engine=car2.new Engine();
        c2engine.setEngine();
        System.out.println("Engine Type for 4WD=" + c2engine.getEngineType());
        
    }
    
    
}
