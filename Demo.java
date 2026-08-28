import other.*;
class A{
public void show(){
  System.out.println("In a Show");
}
}
class B extends A{
public void show(){
  System.out.println("In a Show B");
}
}
class C extends A{
public void show(){
  System.out.println("In a Show C");
}
}

public class Demo {
    public static void main(String[] args)  {
      // A obj=new B();
      // obj.show();

      A obj=new A();
      obj.show();


      obj=new B();
      obj.show();

      obj=new C();
      obj.show();
    }
}
