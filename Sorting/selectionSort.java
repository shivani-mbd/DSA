
public class selectionSort {
    public static void main(String[]args){
        int[]arr = {18,12,20,15,10,11};
        System.out.print("Before sorting : " );
        for(int n :arr){
            System.out.print(n+" ");
        }
        System.out.println();

        selectionSort(arr);

        System.out.print("After sorting : " );
        for(int n :arr){
            System.out.print(n+" ");
        }
    }   

    public static void selectionSort(int[]arr){
        for(int i=0; i<arr.length-1; i++){
            int min = arr[i];
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            arr[minIndex] = arr[i];
            arr[i] = min;

        }

    }
}
