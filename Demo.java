class A{
  public void show1(){
    System.out.println("In A show");
  }
}

class B extends A{
  public void show2(){
    System.out.println("In B show");
  }
}

public class Demo {
    public static void main(String[] args)  {

    //  double d=4.5;  
    //  int a=(int)d;  //type casting

    //  System.out.println(a);

    // A obj =new A();
    // obj.show1();
      // A obj =(A)new B();  //upcasting
      // obj.show1();

      // B obj1=(B) obj;  //downcasting
      // obj1.show2();


      //wrapper class
      // int num=7;
      // Integer num1=4;
      int num=7;
      Integer num1=num;  //atoboxing

      // int num2=num1.intValue();  //auto-unboxing
      // int num2=num;//auto-unboxing
      // System.out.println(num1);


      String str="12";
      Integer num2=Integer.parseInt(str);
      System.out.println(num2*2);

    }
}
