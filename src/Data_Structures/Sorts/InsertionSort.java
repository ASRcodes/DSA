package Data_Structures.Sorts;

public class InsertionSort {
    public static void insertionSort(int arr[],int n){
        n = arr.length;
        for (int i=1;i<n;i++){
            int current = arr[i];
            int j = i-1;

            while (j>=0 && current<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }
    public static void printArray(int arr[],int n){
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,3,6,8,9,2};
        int n = arr.length;
        insertionSort(arr,n);
        printArray(arr,n);
    }
}
