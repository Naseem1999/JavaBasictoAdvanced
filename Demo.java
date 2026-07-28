class Student{
    int rollno;
    String name;
    int marks;
}

public class Demo {
    public static void main(String[] args) {

        //single dimensional arrays
        // int nums[]={1,2,3,4,5};
        // nums[0]=12;
        // System.out.println(nums[0]);


        // int nums[]=new int[4];
        // nums[0]=2;
        // nums[1]=44;
        // nums[2]=45;
        // nums[3]=564;

        // for(int i=0;i<nums.length;i++){
        //     System.out.println(nums[i]);
        // }

        //multidimensional arrays

        // int nums[][]=new int[3][4];

        //  for(int i=0;i<3;i++){
        //     for(int j=0;j<4;j++){
        //         nums[i][j]=(int)(Math.random()*100);
        //     }
           
        // }

        // for(int i=0;i<3;i++){
        //     for(int j=0;j<4;j++){
        //         System.out.print(nums[i][j] + " ");
        //     }
        //     System.out.println();
        // }


        // for(int n[] :nums){
        //     for(int m: n){
        //         System.out.print(m + " ");
        //     }
        //     System.out.println();
        // }
    

        //jagged arrays
        // int nums[][]=new int[3][];

        // nums[0]=new int[1];
        // nums[1]=new int[2];
        // nums[2]=new int[3];

        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums[i].length;j++){
        //         nums[i][j]=(int)(Math.random() *10);
        //     }
        // }

        // for(int n[] :nums){
        //     for(int m: n){
        //         System.out.print(m + " ");
        //     }
        //     System.out.println();
        // }
        
        //exceptions are runtime errors
        // int nums[]=new int[6];
        // nums[0]=32;
        // nums[1]=34;
        // nums[2]=4;
        // nums[3]=3;

        // for(int i=0;i<nums.length;i++){
        //     System.out.println(nums[i]);
        // }

        // Student s1=new Student();
        // s1.name="Naseem";
        // s1.marks=99;
        // s1.rollno=1223;

        // Student s2=new Student();
        // s2.name="Mubeen";
        // s2.marks=87;
        // s2.rollno=4444444;

        // Student s3=new Student();
        // s3.name="Naeem";
        // s3.marks=99;
        // s3.rollno=3444444;
       
        // Student student[]=new Student[3];
        // student[0]=s1;
        // student[1]=s2;
        // student[2]=s3;

        // for(int i=0;i<student.length;i++){
        //     System.out.println(student[i].name +":" + student[i].marks);
        // }

        // for(Student s: student){
        //     System.out.println(s.name +":" +s.marks +":"+s.rollno);
        // }
        //string is not cahngable you are creating new strings
        // String s1=new String("Naseem");
        // String name="Naseem ";
        // name=name + "Mushtaq";
        // System.out.println(s1.concat("dasdasd"));
        // System.out.println(s1.charAt(1));

        // System.out.println("hello"+ " " +name);
        // System.out.println(name);

        // String n1="navin";
        // String n2="navin";
        // System.out.println(n1==n2);
        
       //mutable and immuteable strings bydefault strings are immutable


       StringBuffer sb=new StringBuffer("Naseem");
       sb.append(" Mushtaq");
    //    sb.deleteCharAt(2);
    // sb.insert(7, "Java ");
    sb.setLength(30);
       System.out.println(sb);
    //    String str=sb.toString();

    }
}
