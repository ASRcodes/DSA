package Data_Structures.Arrays;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the number of rows: ");
//        int row = scan.nextInt();
//        System.out.println("Enter the number of column: ");
//        int column = scan.nextInt();
//
//        int[][] matrix = new int[row][column];
//        System.out.println("Enter the matrix : ");
//        for (int i=0;i<row;i++){
//            for (int j=0;j<column;j++){
//                System.out.println("Enter the matrix at position ["+i+"]"+" ["+j+"]");
//                matrix[i][j] = scan.nextInt();
//            }
//        }
//        System.out.println("The matrix you entered : ");
//        for (int i=0;i<row;i++){
//            for (int j=0;j<column;j++){
//                System.out.print(matrix[i][j]+ " ");
//            }
//            System.out.println();
//        }


//        Quetions over itt.....
//  Q1. for NxM matrix print Transpose of it.
//        Transpose of matrix means if we have a matrix of 2X3 it's transpose will be 3X2...
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the number of rows -->");
//        int row = scan.nextInt();
//        System.out.println("Enter the number of columns -->");
//        int column = scan.nextInt();
//
//        int [][]matrix = new int[row][column];
//
//        for (int a=0;a<row;a++){
//            for (int b = 0;b<column;b++){
//                System.out.println("Enter number at ["+a+"]"+"["+b+"]"+ " index");
//                matrix[a][b] = scan.nextInt();
//            }
//        }
//
//        System.out.println("The Matrix you entered -->");
//        for (int i=0;i<row;i++){
//            for (int j=0;j<column;j++){
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//
//        System.out.println("The transpose of the matrix T");
//        for (int i=0;i<column;i++){
//            for (int j=0;j<row;j++){
//                System.out.print(matrix[j][i]+" ");
//            }
//            System.out.println();
//        }

////        Q2. Spiral order matrix.......
//    Scanner scan = new Scanner(System.in);
//        System.out.println("Enter no. of rows : ");
//        int row = scan.nextInt();
//        System.out.println("Enter no. of columns : ");
//        int column = scan.nextInt();
//
//        int[][] spiral = new int[row][column];
//
//        for (int i =0;i<row;i++){
//            for (int j=0;j<column;j++){
//                System.out.println("Enter the element at ["+i+"]"+"["+j+"]"+" Index");
//                spiral[i][j]= scan.nextInt();
//            }
//        }
//
//        System.out.println("The matrix you entered -->");
//        for (int i=0;i<row;i++){
//            for (int j=0;j<column;j++){
//                System.out.print(spiral[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//        int rowStart = 0;
//        int columnStart = 0;
//        int rowEnd = row-1;
//        int columnEnd = column-1;
//
//        while (rowStart<=rowEnd && columnStart<=columnEnd){
////            Traverse right
//            for (int i=columnStart;i<=columnEnd;i++){
//                System.out.print(spiral[rowStart][i]+" ");
//            }
//            rowStart++;
//
////            Traverse down
//            for (int j = rowStart;j<=rowEnd;j++){
//                System.out.print(spiral[j][columnEnd]+" ");
//            }
//            columnEnd--;
//
////            Traverse left
//            if (rowStart<=rowEnd) {
//                for (int a = columnEnd; a >= columnStart; a--) {
//                    System.out.print(spiral[rowEnd][a] + " ");
//                }
//                rowEnd--;
//            }
//
////            Traverse up.
//            if (columnStart<=columnEnd) {
//                for (int m = rowEnd; m >= rowStart; m--) {
//                    System.out.print(spiral[m][columnStart] + " ");
//                }
//                columnStart++;
//                System.out.println();
//            }
//        }














    }
}
