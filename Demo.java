class Laptop{
  String model;
  int price;
  @Override
  public String toString() {
    return "Laptop [model=" + model + ", price=" + price + "]";
  }

  public boolean equals(Laptop that){
    if(this.model.equals(that.model) && this.price==that.price){
      return true;
    }else{
      return false;
    }
  }
}

public class Demo {
    public static void main(String[] args)  {
    Laptop obj=new Laptop();
    obj.model="lenovo";
    obj.price=2333;
    Laptop obj1=new Laptop();
    obj1.model="lenovo";
    obj1.price=2333;
    // System.out.println(obj);

    boolean res=obj.equals(obj1);
    System.out.println(res);

    }
}
