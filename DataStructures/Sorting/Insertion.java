public class Insertion{
    void Sort(int arr[]){
        int n= arr.length;

        for(int i=1;i<n;i++){

            int key =arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j= j-1;
            }

            arr[j+1]= key;
        }
    }
    void printArray(int arr[]){
        int n= arr.length;
        for(int i=0;i<n;++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={22, 34, 56,11, 10,12 , 6, 1};
        Insertion obj= new Insertion();
        obj.Sort(arr);
        System.out.println("Sorted Arrays");
        obj.printArray(arr);
    }
}