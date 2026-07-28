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
        int nums[]=new int[6];
        nums[0]=32;
        nums[1]=34;
        nums[2]=4;
        nums[3]=3;

        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }

    }
}
