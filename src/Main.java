import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
//                   TWO SUM
//        int num[] ={1,2,3,5,7,9};
//        int target = 8;
//        for (int i=0;i<num.length;i++){
//            for (int j=i+1;j<num.length;j++){
//                if (num[i]+num[j]==target){
//                    int ans[] ={i,j};
//                    System.out.println(Arrays.toString(ans));
//                }
//            }
//        }
//                                     OR
//        int num[] ={1,2,3,4,5,6,8};
//        int target =9;
//        for (int i=0;i<num.length;i++){
////            here we'll do length-1 to get last index
//            for (int j=num.length-1;j>i;j--){
//                if (num[i]+num[j]==target){
//                    int ans[] = {i,j};
//                    System.out.println(Arrays.toString(ans));
//                }
//            }
//        }


//        int num[] = {3,2,7,2,3};
//        int val = 2;
//        int count =0;
//        for(int i=0;i<num.length;i++){
//            if (num[i]!=val){
//                num[count]=num[i];
//                count++;
//            }
//
//        }
//        System.out.println(count);

//                     NUMBER OF ELEMENTS IN AN ARRAY REMOVING THE VAL ELEMENT...
//        int nums[] ={0,1,2,2,3,0,4,2};
//        int val = 0;
//        System.out.println(RemoveArray(nums,val));
//    }
//    static int RemoveArray(int[] nums,int val){
//        int count =0;
//        for (int i=0;i<nums.length;i++){
//            if (nums[i]!=val){
//                nums[count]=nums[i];
//                count++;
//            }
//        }
//        return count;
//    }

//                  PALINDROME

//        class Solution {
//            public boolean isPalindrome(int x) {
//                String a = String.valueOf(x);
//                int n = a.length();
//
//                for(int i =0;i<n/2;i++){
//                    if(a.charAt(i)!=a.charAt(n-i-1))
//                        return false;
//                }
//                return true;
//            }
//        }

//                           3SUM problem
// Here we'll Apply Two sum approach by fixing one value
//int arr[] = {-1,0,1,2,-1,-4};
////        int arr[] = {0,0};
////first check if the given should not be null and it's length must be greater than 3
//if (arr != null || arr.length >3) {
//    Arrays.sort(arr);
////here we are defining a Hash set to remove the duplicate values
//    Set<List<Integer>> result = new HashSet<>();
////now  we'll  take one element out of three to compare with and we'll take upto the second last element
//    for (int i = 0; i < arr.length - 2; i++) {
////    Now we'll set pointer for the next two elements
//        int left = i + 1;
//        int right = arr.length - 1;
//
//        while (left < right) {
////        finding the sum of the elements......
//            int sum = arr[i] + arr[left] + arr[right];
//
//            if (sum == 0) {
//////            Add the resultant array to arrResult
//                result.add(Arrays.asList(arr[i],arr[left],arr[right]));
////                List<Integer> arrResult = Arrays.asList(arr[i], arr[left], arr[right]);
////            adding arrResult to result array...
////                result.add(arrResult);
//                left++;
//                right--;
//            } else if (sum < 0) {
//                left++;
//            } else {
//                right--;
//            }
//            System.out.println();
//
//        }
//    }
//    for (List<Integer> TripletResult : result) {
////    fetching the value out
//        System.out.println(TripletResult);
//    }
//  }else {
//    System.out.println("Empty Array");
//  }

        //                          16. 3Sum Closest

        int arr[] = {-1,2,1,-4};
        int target = 1;
//        We first have to sort our array before going to perform further operations
        Arrays.sort(arr);
//        Now we'll calculate the resultSum for the given array
        int resultSum = arr[0]+arr[1]+arr[2];
//      we'll take this min_Diff to compare it further......
        int minDiff = Integer.MAX_VALUE;

        for (int i=0;i< arr.length-2;i++){
            int left = i+1;
            int right = arr.length-1;
            while (left<right){
                int sum = arr[i]+arr[left]+arr[right];

                if (sum==target)
                    System.out.println(target);
                else if (sum<target) {
                    left++;
                }
                else {
                    right--;
                }
                int diffToTarget = Math.abs(sum-target);
                if (diffToTarget<minDiff){
                    resultSum = sum;
                    minDiff = diffToTarget;
                }
            }
        }
        System.out.println(resultSum);



























//                            REMOVE DUPLICATES FROM A SORTED ARRAY...........
//        int[] D = {1,2,3,4,5,6,6,6,6};
//        RemoveDuplicate(D);
//        System.out.println(RemoveDuplicate(D));
//    }
//    public static int RemoveDuplicate(int[] nums){
//        int count=0;
//        for (int i=0;i< nums.length;i++){
//            if (i<nums.length-1 && nums[i]==nums[i+1]){
//                continue;
//            }
//            else {
//                nums[count]=nums[i];
//                count++;
//            }
//        }
//
//return count;
//    }

//                                    JUMP GAME ................
//        int c[] = {2,3,1,0,4};
//
////        setting up the final position where we have to reach........
//        int finalposition = c.length-1;
//
////        Through for loop we are setting our pointer just after the final position and checking
////        if we can reach final position or not if yes changing the pointer to next position
//        for (int i=c.length-2;i>=0;i--){
//            if (i+c[i]>=finalposition){
//                finalposition=i;
//            }
//        }
////        if we have reached to the 1st index then true otherwise false
//        if (finalposition==0){
//            System.out.println("true");
//        }
//        else {
//            System.out.println("false");
//        }

////                                        SINGLE NUMBER.....
////        using XOR operator i.e, 2 xor 2 =0 and 0 xor 2 = 2
//        int num[] = {4,1,2,1,2};
////        making a xor variable assigning it the first index of array The variable will store the XOR result...
//        int xor = num[0];
////        Here now we are traversing all the elements from index one and making xor of the with this (XOR)'^' operator
//        for (int i=1;i< num.length;i++){
////            Storing the xor value in variable xor started with 0th index and upto the last one..
//            xor = xor ^ num[i];
//        }
////              returning the xor variable's value.......
//        System.out.println(xor);

////                                  CONTAINER WITH MOST WATER.....
//        int container[] ={1,8,6,2,5,4,8,3,7};
////        Making two pointers one which will start from first and another which will start from the end of the array
//        int left = 0;
//        int right = container.length-1;
////        making a variable which keep the record of the maximum area and will be returned at last.....
//        int MaxArea = 0;
//        while(left<right){
//            //        First we'll calculate area and keep it in our variable and at last we'll compare them
////        Taking the minimum len because nhi to paani niche aajayega its container problem
//            int area = Math.min(container[left],container[right])
////             Finding Breadth this way.........
//                    *(right-left);
//            MaxArea = Math.max(area,MaxArea);
//
//            if (container[left]<container[right]){
//                left++;
//            }
//            else {
//                right--;
//            }
//
//        }
//        System.out.println(MaxArea);

////                            MERGE SORTED ARRAY Q88
//        int num1[] = {1,2,3,0,0,0};
//        int m = 3;
//        int i = m-1;
//        int num2[] = {2,5,14};
//        int n = 3;
//        int j = n-1;
////        We'll initialize a variable k which will indicate the last index of num1
//        int k = m+n-1;
//
////        Here we have to run loop until all the elements of num2 are traversed and compared.......
//       while (j>=0) {
//
//           if (i>=0 && num1[i] > num2[j]) {
//               num1[k] = num1[i];
//               k--;
//               i--;
//           } else {
//               num1[k] = num2[j];
//               k--;
//               j--;
//           }
//       }
//        System.out.println(Arrays.toString(num1));

////                           Q977. Squares of a Sorted Array
//
//        int nums[] = {-4,-1,0,3,10};
//        for (int i =0; i< nums.length; i++){
//                nums[i] = nums[i]*nums[i];
//        }
//        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));


////                            Q45. Jump Game II
//
//    int nums[] = {2,4,1,2,3,1,1,2};
////    Variable to store the number of jumps taken
//    int totalJumps = 0;
////    Variable which will store upto how much the array is covered
//    int coverage = 0;
////    Variable representing our destination.
//    int destination = nums.length - 1;
////    Variable which store our last jumped from index
//    int lastJumpIndex = 0;
//
////    If the size of the array is =1 then we'll return 0
//    if (nums.length == 1) {
//        System.out.println(0);
//    }
//    for (int i = 0; i < nums.length; i++) {
////        Updating the coverage to the maximum array covered
//        coverage = Math.max(coverage, i + nums[i]);
//
//
//        if (i == lastJumpIndex) {
////            initialising the jumping index to the last covered index
//            lastJumpIndex = coverage;
//            totalJumps++;
//
////            if we have reached the last index while covering the break the loop
//            if (coverage >= destination) {
//                break;
//            }
//        }
//    }
//        System.out.println(totalJumps);

//                               35. Search Insert Position
////        return the index of target element if found and If not return where it should be if inserting it
//        int a[] = {1,2,4,6,8,7};
//        int target = 9;
////        We'll apply Binary search here
//        int first = 0;
//        int last = a.length-1;
//        int mid ;
//
//        while (first<=last){
//            mid = (first+last)/2;
//            if (a[mid]>target){
//                last = mid-1;
//            }
//            else if (a[mid]==target){
//                System.out.println("Element fount at "+mid+" index");
//                break;
//            }
//            else {
//                first = mid+1;
//            }
//        }
//        if (first>last){
////            If we have reached here that means we don't have find the target element
//            System.out.println(target+" Element not found");
//            System.out.println("If it was there in array it will be at "+first+" index");
//        }

//                                  Q46.Permutation













//                                  Q4. Median of two sorted array

////        Needed solution in o(log(m+n))
//int a[] = {1,2};
//int b[] = {3,4};
////We'll be using binary search here........
//


//      20. VALID parentheses

//        String s = "[{}()]";
//        Stack<Character> stack = new Stack<>();
//        boolean isValid = true;
//
//        for (char c : s.toCharArray()){
//            if (c=='('){
//                stack.push(')');
//            } else if (c=='{') {
//                stack.push('}');
//            } else if (c=='[') {
//                stack.push(']');
//            } else if (stack.isEmpty() || stack.pop() != c) {
////                System.out.println("False");
//                isValid = false;
//                System.exit(0);
//            }
//        }
//        if (isValid && stack.isEmpty()){
//            System.out.println("True");
//        }
//        else {
//            System.out.println("False");
//        }
////        System.out.println("True");
//
////        if (stack.isEmpty()){
////            System.out.println("True");
////        }
////        else {
////            System.out.println("False");
////        }

//        if (args.length > 0) {
//            System.out.println("Command-line arguments:");
//            // Loop through the arguments and print them
//            for (String arg : args) {
//                System.out.println(arg);
//            }
//        } else {
//            System.out.println("No command-line arguments provided.");
//        }





















    }
}