
public class MergeTwoSortedArray {
    public static void main(String[]args){
        int[] a = {10,30,32,40};
        int[] b = {6,18,25};

        int[] merge = MergeSortedArray(a,b);

        System.out.print("After sorting : " );
        for(int n :merge){
            System.out.print(n+" ");
        }
    }
    public static int[] MergeSortedArray(int[]a, int[]b){
        int[] merged = new int[a.length+ b.length];
        int indx1 = 0, indx2 = 0, indx3 = 0;
        while(indx1 < a.length && indx2 < b.length){
            if(a[indx1]< b[indx2])
                merged[indx3++] = a[indx1++];
            else
                merged[indx3++] = b[indx2++];
        }
        while(indx1 < a.length)
             merged[indx3++] = a[indx1++];
        while(indx2 < b.length)
             merged[indx3++] = b[indx2++];
        return merged;

    }
}
