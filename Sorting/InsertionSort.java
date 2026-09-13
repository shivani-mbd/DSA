public class InsertionSort {
    public static void main(String[] args) {
        int[]arr = {18,12,20,15,10,11};
        System.out.print("Before sorting : " );
        for(int n :arr){
            System.out.print(n+" ");
        }
        System.out.println();

        InsertionSort(arr);

        System.out.print("After sorting : " );
        for(int n :arr){
            System.out.print(n+" ");
        }
        
    }
     public static void InsertionSort(int[]arr){
        for(int i =1; i<arr.length;i++){
            int pivot = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>pivot){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = pivot;
        }

     }
    
}
