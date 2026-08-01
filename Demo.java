class Student{
    int rollno;
    String name;
    int marks;
}

class Humman{
 private int age;
 private String name;

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

public class Demo {
    public static void main(String[] args) {
    //Encapsulation 
    Humman obj=new Humman();
    obj.setName("Naseem");
    obj.setAge(22,obj);
    System.out.println(obj.getName() + ":"+obj.getAge() );




    }
}
