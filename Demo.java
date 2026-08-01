class Student{
    int rollno;
    String name;
    int marks;
}

class Humman{
 private int age;
 private String name;

 

 public Humman(int age, String name) {
    this.age = age;
    this.name = name;
}
 public Humman(String name) {
    this.name = name;
}
 public Humman() {
    System.out.println("object created.....");
}
 public int getAge(){
    return age;
 }
 public void setAge(int age,Humman obj){
    Humman obj1=obj;
    obj1.age=age;
 }
 public String getName(){
    return name;
 }
  public void setName(String name){
    this.name=name;
 }
}

class Mobile{
    String brand;
    int price;
    static String name;
  

    
    public Mobile(){
        System.out.println("In constructor");
        brand="ANNSA";
        price=12323;
    }
    static{
        name="phone";
        System.out.println("in static block");
        //static block only calls once how many obj you create 
        //class loading first then statc block then constructor
    }

    public void show(){
        System.out.println( "Mobile [brand=" + brand + ", price=" + price + ", name=" + name + "]");
    }

    //you can not us enot static variable inside static method
    public static void show1(Mobile obj1){
        System.out.println("Mobile [brand=" + obj1.brand + ", price=" + obj1.price + ", name=" + name + "]");
    }
    
}
public class Demo {
    public static void main(String[] args) throws ClassNotFoundException {
    //Encapsulation 
    // Humman obj=new Humman();
    // obj.setName("Naseem");
    // obj.setAge(22,obj);
    // System.out.println(obj.getName() + ":"+obj.getAge() );

    //constructor
  
        // Humman obj=new Humman(2,"ABC");
        // Humman obj1=new Humman();
    // obj.setName("Naseem");
    // obj.setAge(22,obj);
    // System.out.println(obj.getName() + ":"+obj.getAge() );
    // System.out.println(obj1.getName() + ":"+obj1.getAge() );
     


    Class.forName("Mobile");
    // Mobile obj1=new Mobile();
    // obj1.brand="Apple";
    // Mobile.name="smartPhone";
    // obj1.price=1200;


    // Mobile obj2=new Mobile();
    // obj2.brand="samsung";
    // Mobile.name="smartPhone";
    // obj2.price=4000;

    // Mobile.name="asdas";

    // System.out.println(obj2.toString());
    // System.out.println(obj1.toString());
    // System.out.println(obj2.toString());
    // Mobile.show1(obj1);



    }
}
