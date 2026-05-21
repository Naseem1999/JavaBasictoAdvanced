class Caculator{
  int a;
  public int add(int n1,int n2){
    int r=n1+n2;
    return r;
  }
}


class Hello{
    public static void main(String[] args) {
      int num1=4;
      int num2=5;
    Caculator c1=new Caculator();
    int result=c1.add(num1,num2);
    System.out.println(result);


    }
}

