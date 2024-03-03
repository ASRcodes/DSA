package Data_Structures.Recursion;

import java.util.HashSet;

public class R2 {
//    public static void TowerOfHanoi(int n,String src,String helper,String destination){
////        If n is 1
//        if (n==1){
//            System.out.println("Transfer " + n + " from " + src + " to " + destination);
//            return;
//        }
//
////        Recursion
//        TowerOfHanoi(n - 1, src, destination, helper);
//        System.out.println("Transfer " + n + " from " + src + " to " + destination);
//        TowerOfHanoi(n - 1, helper, src, destination);
//
//    }


//    Reversing a string using recursion.......
//    public static void printStr(int idx,String str){
//        if (idx==0){
//            System.out.print(str.charAt(idx));
//            return;
//        }
//        System.out.print(str.charAt(idx));
//        printStr(idx-1,str);
//    }

//                       Find the index of first and last occurrence of the given element....
//    public static int first = -1;
//    public static int last = -1;
//    public static void occurrence(String str,int idx,int element){
////        If we reached the last element
//        if (idx==str.length()){
//            System.out.println(first);
//            System.out.println(last);
//            return;
//        }
////        Finding the element which is at the given idx
//        char currChar = str.charAt(idx);
//        if (currChar==element){
//            if (first==-1){
//                first = idx;
//            }
//            else {
//                last = idx;
//            }
//        }
//        occurrence(str,idx+1,element);
//    }

//                    Check if the array is sorted or not....
//    public static boolean isSorted(int arr[],int idx){
////        Base case..
//        if (idx==arr.length-1){
//            return true;
//        }
//
//        if (arr[idx]<arr[idx+1]){
//            return isSorted(arr,idx+1);
//        }
//        else {
//            return false;
//        }
//    }
//                                                OR
//public static boolean isSorted(int arr[],int idx){
////        Base case..
//    if (idx==arr.length-1){
//        return true;
//    }
//
//    if (arr[idx]>=arr[idx+1]){
////        Unsorted
//        return false;
//    }
//
//    return isSorted(arr,idx+1);
//}

//    Move all 'x' to the last....................
//    public static void moveAllx(String str,String newString,int idx,int count){
////        BaseCase
//        if (idx==str.length()){
//            for (int i=0;i<count;i++){
//                newString += 'x';
//            }
//            System.out.println(newString);
//            return;
//        }
//
//        char currChar = str.charAt(idx);
//        if (currChar=='x'){
//            count++;
//            moveAllx(str,newString,idx+1,count);
//        }
//        else {
//            newString += currChar;
//            moveAllx(str,newString,idx+1,count);
//        }
//    }

//                                 Remove duplicates..................
//    We'll create a map array to track the current character's index and using that index will remove the duplicates
//    public static boolean[] map = new boolean[26];
////    Recursive fun^n
//    public static void removeDuplicates(String str,String newString,int idx){
////        Base case
//        if (idx==str.length()){
//            System.out.println(newString);
//            return;
//        }
////        We'll get our current character first
//        char currChar = str.charAt(idx);
//        if (map[currChar-'a']){
////            i.e, the character is already present
//            removeDuplicates(str,newString,idx+1);
//        }
//        else {
//            newString += currChar;
//            map[currChar-'a']=true;
//            removeDuplicates(str,newString,idx+1);
//        }
//    }

//                                         IMPORTANT Q..
//    Subsequences.....
//    public static void subsequences(int idx,String newString,String str){
////        Base case
//        if (idx==str.length()){
//            System.out.println(newString);
//            return;
//        }
////        Finding the character at the present index
//        char currChar = str.charAt(idx);
////        now if the character wanna to add in String we'll add it in newString
//        subsequences(idx+1,newString+currChar,str);
////        If it don't wanna to be added we'll simply just increase the index only..
//        subsequences(idx+1,newString,str);
//    }

//    Print  all unique subsequences of the string..........
//    public static void uniqueSubsequences(int idx, String newString, String str, HashSet<String> set){
////        Base case
//        if (idx==str.length()){
//            if (set.contains(newString)){
//                return;
//            }
//            else {
//                System.out.println(newString);
//                set.add(newString);
//                return;
//            }
//        }
//        char currChar = str.charAt(idx);
////        To be
//        uniqueSubsequences(idx+1,newString+currChar,str,set);
////        Not to be
//        uniqueSubsequences(idx+1,newString,str,set);
//    }

    public static void main(String[] args) {
//                                 Intermediate Questions......
//        TowerOfHanoi.
//        int n = 3;
//        TowerOfHanoi(n,"S","H","D");

//        Reverse a string using looping
//        String arr[] = {"A","B","C","D"};
//        for (int i= arr.length-1;i>=0;i--){
//            System.out.print(arr[i]+" ");
//        }
//
//        String use = "abcd";
//        printStr(use.length()-1,use);

//        String use = "abaacdaefaah";
//        occurrence(use,0,'a');

//        int arr[] = {1,2,3,5};
//        System.out.println(isSorted(arr,0));

//        MoveAll x to the last............
//        String str = "axbxcdxx";
//        String ne = "";
//        moveAllx(str,ne,0,0);

//        Remove Duplicates.........
//        String str = "aabbccddffrf";
//        removeDuplicates(str,"",0);

//        Subsequence....
//        String str = "abc";
//        subsequences(0,"",str);

//        Printing unique subsequences
//        String str = "aaa";
//        String empty = "";
//        HashSet<String> set = new HashSet<>();
//        uniqueSubsequences(0,empty,str,set);






















    }
}
