package Data_Structures.Sorts;

public class MergeSort {
    public static void conquer( int arr[],int si,int ei,int mid){

//        First we'll create an array in which we'll save the sorted elements of size ei-si+1
        int merged[] = new int[ei-si+1];
//        Now we'll define indexes to perform the further operation
//        These two we'll track the arr1 and arr2
        int indx1 = si;
        int indx2 = mid+1;
//        This will track merged array
        int x = 0;

        while(indx1<=mid && indx2<=ei){
            if (arr[indx1]<=arr[indx2]){
                merged[x++]=arr[indx1++];
            }
            else {
                merged[x++]=arr[indx2++];
            }
        }

        while (indx1<=mid){
            merged[x++]=arr[indx1++];
        }
        while (indx2<=ei){
            merged[x++]=arr[indx2++];
        }

        for (int i=0,j=si;i< merged.length;i++,j++){
//            Adding the merged array element from merged in original array.....
            arr[j]=merged[i];
        }
    }
    public static void divide(int arr[],int si,int ei){
//        Here we have to return if we have reached the last element
        if (si>=ei){
            return;
        }
//        At first we'll divide the array
        int mid = si+(ei-si)/2;
//        Then we'll divide the two arrays
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr,si,ei,mid);
    }
    public static void main(String[] args) {
        int arr[]= {6,3,9,5,2,8};
        int n = arr.length;

        divide(arr,0,n-1);

        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
