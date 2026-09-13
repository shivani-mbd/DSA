
public class MergeSort {
    public static void main(String[] args) {
        int[] a = {20,8,15,18,6};
        

        System.out.print("Before sorting : " );
        for(int n :a){
            System.out.print(n+" ");
        }
        System.out.println();

        divide(a,0, a.length-1);

        System.out.print("After sorting : " );
        for(int n :a){
            System.out.print(n+" ");
        }
        
    }
    public static void divide(int[]a ,int start, int end){
        if(start<end){
            int mid = (start+end)/2;
            divide(a,start, mid);
            divide(a, mid+1, end);
            merge(a, start, mid, end);
        }
    }

    public static void merge(int[]a, int start, int mid , int end){
        int[] merged = new int[end - start+1];
        int indx1 = start, indx2 = mid+1, indx3 = 0;
        while(indx1 <= mid && indx2 <= end){
            if(a[indx1] < a[indx2])
                merged[indx3 ++] = a[indx1++];
            else
                merged[indx3++] = a[indx2++];
        }
        while(indx1 <= mid)
            merged[indx3++] = a[indx1++];
        while(indx2 <= end)
            merged[indx3++] = a[indx2++];

        for(int i = start, j=0; j<merged.length; i++, j++)
            a[i] =  merged[j];
    }
    
}
