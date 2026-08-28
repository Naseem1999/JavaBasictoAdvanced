//final variable,class,method

class Calc{  //if you make class final then it should not be extended
  public final void show(){ //if you not want to override the method use final keyword
    System.out.println("In calc show");
  }
  public void add(int a,int b){
    System.out.println(a+b);
  }
}

class AdvCalc extends Calc{  //
  public void show(){
    System.out.println("In calc show");
  }
}

public class Demo {
    public static void main(String[] args)  {
      // final int num=6;
      // num=3;
      // System.out.println(num);

      Calc obj=new Calc();
      obj.show();
      obj.add(3, 5);

    }
}
