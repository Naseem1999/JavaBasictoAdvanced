
public class Demo {
    public static void main(String[] args)  {
       VeryAdvCalc obj=new VeryAdvCalc();

       int r1=obj.add(3,3);
       int r2=obj.sub(9,3);
       int r3=obj.multi(9,3);
       int r4=obj.div(9,3);
       double r5=obj.power(2, 3);

       System.out.println(r1);
       System.out.println(r2);
       System.out.println(r3);
       System.out.println(r4);
       System.out.println(r5);
    }
}
