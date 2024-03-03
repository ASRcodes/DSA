package Data_Structures.Recursion;

import java.util.Scanner;

public class R1 {
//        public static void printNumb(int n){
////            Base case....
//            if (n==0){
//                return;
//            }
//            System.out.println(n);
////            Recursion........
//            printNumb(n-1);
//        }
//    public static void main(String[] args) {
//// You have to print 5,4,3,2,1..... using recursion.
//    printNumb(5);
//    }

//    Print sum of n natural number....
//    public static void printSum(int i,int n,int sum){
////        Base case;
//        if (i==n){
//            sum += i;
//            System.out.println(sum);
//            return;
//        }
////        recursion
//        sum += i;
//        printSum(i+1,n,sum);
////        This code show how recursion works in stack
//        System.out.println(i);
//    }
//public static void main(String[] args) {
//    printSum(1,10,0);
//}

//    Factorial
//    public static int printFact(int n){
////        Base case
//        if (n==0 || n==1){
//            return 1;
//        }
////        Recursion
//        int fact1 = printFact(n-1);
//        int fact = n*fact1;
//
//        return fact;
//    }
//public static void main(String[] args) {
//    int fact = printFact(5);
//    System.out.println(fact);
//}

//    Fibonacci series......
//    public static void printFib(int a,int b,int n){
////        Base case
//        if (n==0){
//            return;
//        }
////        first we have to calculate the sum of previous two terms then we'll recall it in recursion
//        int c = a+b;
////        And we'll keep on printing this c's value for series
//        System.out.println(c);
//
////        Here we'll pass the previous two terms for every Function call
////        Recursion
//        printFib(b,c,n-1);
//    }
//public static void main(String[] args) {
//    int a = 0;
//    int b=1;
//    System.out.println(a);
//    System.out.println(b);
////    no. of terms
//    int n=8;
//
//    printFib(0,1,n-2);
//}

//                  Calculate height of stack as x^n

//    public static int calculatePower(int x,int n){
////        Base cases
//        if (x==0){
//            return 0;
//        }
//        if (n==0){
//            return 1;
//        }
////        Recursion
////        We'll calculate (n-1) first
//        int powerNm1 = calculatePower(x,n-1);
//        int powerX = x*powerNm1;
//
//        return powerX;
//    }
//public static void main(String[] args) {
//
//        int x = 9;
//        int n = 5;
//
//        int answer = calculatePower(x,n);
//    System.out.println(answer);
//}

    //                  Calculate height of stack as x^n (Stack height = logN)
//    public static int calculatePower(int x,int n){
////        Base cases
//        if (x==0){
//            return 0;
//        }
//        if (n==0){
//            return 1;
//        }
////        Recursion
////        We'll check if n is odd or even
//        if(n%2==0){
//          return calculatePower(x,n/2)*calculatePower(x,n/2);
//        }
//        else {
////            If the n is Odd
//            return calculatePower(x,n/2)*calculatePower(x,n/2)*x;
//        }
//    }
//public static void main(String[] args) {
//
//        int x = 4;
//        int n = 2;
//
//        int answer = calculatePower(x,n);
//    System.out.println(answer);
//}

//                        Common recursion questions

//    public static void printNum(int n){
//        if (n==0){
//            return;
//        }
//        System.out.println(n);
//        printNum(n-1);
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the nth term up-to which you want to print the reverse number");
//        int a = scanner.nextInt();
//        printNum(a);
//    }

//public static void printNum(int n){
//    if (n==0){
//        return;
//    }
//    printNum(n-1);
//    System.out.println(n);
//}
//
//    public static void main(String[] args) {
//        printNum(10);
//    }

//public static int sumNatural(int n){
//    if (n==1)
//        return n;
//    return n + sumNatural(n-1);
//}
//    public static void main(String[] args) {
//        System.out.println( sumNatural(10));
//    }

















}


















