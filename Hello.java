class Hello{
    public static void main(String[] args) {
      //conditional statement

      // int x=8;
      // int y=7;
      // int z=9;
      // if(x>y && x>z)
      //   System.out.println(x);
      // else if(y>x && y >z)
      //   System.out.println(y);
      // else
      //   System.out.println(z);

      // int n=5;
      // int result=0;

      // if(n%2==0)
      //   result=10;
      // else
      //   result=20;
      // result=n%2==0 ? 10 :20;

      // System.out.println(result);

      int n=1;

      // if(n==1)
      //    System.out.println("Monday");
      // else if(n==2)
      //   System.out.println("Tuesday");
      // else if(n==3)
      //   System.out.println("wednesday");
      // else if(n==4)
      //   System.out.println("thursday");
      // else if(n==5)
      //   System.out.println("friday");
      // else if(n==6)
      //   System.out.println("saturday");
      // else
      //   System.out.println("sunday");

      switch (n) {
        case 1:
          System.out.println("Monday");
          break;
        case 2:
          System.out.println("Tuesday");
          break;
        case 3:
          System.out.println("wednesday");
          break;
        case 4:
          System.out.println("thursday");
          break;
        case 5:
          System.out.println("friday");
          break;
        case 6:
          System.out.println("saturday");
          break;
        default:
          System.out.println("sunday");
          break;
      }
    }
}

