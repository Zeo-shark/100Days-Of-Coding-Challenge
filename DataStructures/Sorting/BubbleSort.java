class BubbleSort
{
    void bubbleSort(int arr[]){
        int n= arr.length;
        for( int i=0; i<n-1; i++)
            for(int j=0; j<n-i-1; j++)
    }


    void printArray(int arr[]){
        int n= arr.length;
        for(int i=0; i<n; i++)
        System.out.println(arr[i]+" ");
    System.out.println();
    }
    public static void main(String[] args) {
        
        BubbleSort obj= new BubbleSort();

        int arr[]= {64, 34,11, 25,12,90};
        obj.bubbleSort(arr);
        System.out.println("Sorted Arrays");
        obj.printArray();
    }
}