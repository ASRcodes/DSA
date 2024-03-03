package Data_Structures.Sorts;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
        for (int i=0;i<arr.length-1;i++){
//            Storing the smallest element for further comparison
            int smallest = i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
//            Swap elements
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}