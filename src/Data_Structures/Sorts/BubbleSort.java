package Data_Structures.Sorts;

public class BubbleSort {
    public static void main(String[] args) {
//        T.C = O(n^2)
        int sort[] = {7,8,3,1,2};

//        Bubble sort Algo^n
        for (int i=0;i<sort.length-1;i++){
//            i is just a counter element..
            for (int j=0;j<sort.length-i-1;j++){
//                Actual index is defined though j...
                if (sort[j]>sort[j+1]){
//                    Swap the elements
                    int temp = sort[j];
                    sort[j] = sort[j+1];
                    sort[j+1] = temp;
                }
            }
        }

//        Printing the array......
        for (int i =0;i<sort.length;i++){
            System.out.print(sort[i]+" ");
        }
        System.out.println();
    }
}
