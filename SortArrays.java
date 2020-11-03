public class SortArrays{

    public static void main(String args[]){

        int[] array={101, 201, 10, 222};
        System.out.println("Array Elements Before Sort");

        for(int elem: array){
            System.out.println(elem);
        }

        //Call Arrays.sort on the int Arrays
        Arrays.sort(array);
        System.out.println("Array Elements After sort");
        for(int elem: array)
        {
            System.out.println(elem);
        }

    }
}