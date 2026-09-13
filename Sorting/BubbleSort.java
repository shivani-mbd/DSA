
public class BubbleSort {
    public static void main(String[] args) {
        int[]arr = {18,12,20,15,10,11};
        System.out.print("Before sorting : " );
        for(int n :arr){
            System.out.print(n+" ");
        }

        System.out.println();

        BubbleSort(arr);

        System.out.print("After sorting : " );
        for(int n :arr){
            System.out.print(n+" ");
        }
        
    }
    public static void BubbleSort(int[]arr){
        for(int i =0; i<arr.length-1-i; i++){                     //outer loop for how many steps
            boolean flag = true;      
            for(int j =0; j<arr.length-1; j++){                  //for comparing element
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if(flag)
                return;                            
        }

    }
    
}
