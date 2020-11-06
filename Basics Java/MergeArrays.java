import java.util.Arrays;

public class MergeTwoArrays{

    public static void main(String[] args) {
        int[] ar1= {10,20,30};
    
        int[] ar2= {100,200,300};
        //Print the two arrays for loops
        int[] merge= new int[ar1.length+ ar2.length];
    
        for(int i=0;i<ar1.length;i++)
        {
            merge[i]= ar1[i];
        }
        for(int i=0;i<ar2.length;i++)
        {
            merge[i+ar1.length]= ar2[i];
        }
        //Print the merged Array
        System.out.println(Arrays.toString(merge)); 
    }
}