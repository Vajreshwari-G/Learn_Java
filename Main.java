//Largest Element
// import java.util.Scanner;

// public class Largest
// {
//     public static void main(String[] args)
//     {
        // int n[] = new int[6];
        // n[0] = 3;
        // n[1] = 2;
        // n[2] = 1;
        // n[3] = 3;
        // n[4] = 5;
        // n[5] = 2;
//         int largest = n[0];
//         for(int i=0;i<n.length;i++)
//         {
//             if(n[i]>largest)
//             {
//                 largest = n[i];
//             }
//         }
//             System.out.println( "The Largest number"+largest);


//     }
// }

//Second Largest Element
// public class Main
// {
//         public static void main(String[] args)
//         {
//                 int[] numbers = {11,12,15,17,17,14};
//                 int largest = Integer.MIN_VALUE;
//                 int slargest = Integer.MIN_VALUE;
//                 for(int num : numbers)
//                 {
//                         if(num>largest)
//                         {
//                                 slargest = largest;
//                                 largest = num;
//                         }
//                         else if(num > slargest && num != largest )
//                         {
//                                 slargest = num;
//                         }
//                 }
//                         if(slargest == Integer.MIN_VALUE)
//                         {
//                                 System.out.println("No Second largest element");
//                         }
//                         else{
//                         System.out.println("The Second Largest element is:"+slargest);
//                         }
//         }
// }

//Check if the array is Sorted
// public class Main
// {
//         public static void main(String[] args)
//         {
//                 int[] arr1 = {1,2,5,8,12,12,20};
//                 int[] arr2 = {5,9,3,14,8,22};
//                 System.out.println("Is arr1 sorted? " + isSorted(arr1));
//                 System.out.println("Is arr2 sorted " + isSorted(arr2));
//         }
//                 public static boolean isSorted(int[] arr)
//                 {
//                         if(arr == null || arr.length<=1)
//                         {
//                                 return true;
//                         }
//                         for(int i=0;i<arr.length-1;i++)
//                         {
//                                 if(arr[i]>arr[i+1])
//                                 {
//                                         return false;
//                                 }
//                         }
//                         return true;
//                 }
//        }
 
//Remove Duplicates from sorted Array
// import java.util.Arrays;

// public class Main {
//     public static void main(String[] args) {
//         int[] nums = {1, 1, 2, 2, 3, 4, 4, 5, 5, 5};
//         System.out.println("Original array: " + Arrays.toString(nums));

//         int len = removeDuplicates(nums);

//         // Uses Arrays.copyOf range to print only the unique portion easily
//         System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(nums, len)));
//         System.out.println("New length: " + len);
//     }

//     public static int removeDuplicates(int[] nums) {
//         if (nums == null || nums.length == 0) return 0;
        
//         int i = 0;
//         for (int j = 1; j < nums.length; j++) {
//             if (nums[j] != nums[i]) {
//                 nums[++i] = nums[j]; // Pre-increment shortens pointer advancement and assignment
//             }
//         }
//         return i + 1;
//     }
// }

//Left Rotate Array by One Place
// import java.util.Arrays;

// public class Main {
//     public static void main(String[] args) {
//         int[] nums = {1, 2, 3, 4, 5};
//         System.out.println("Original: " + Arrays.toString(nums));

//          leftRotateByOne(nums);
//         System.out.println("Rotated:  " + Arrays.toString(nums));
//     }

//     public static void leftRotateByOne(int[] nums) {
//         if (nums == null || nums.length <= 1) return;

//         int first = nums[0];
//         for (int i = 1; i < nums.length; i++) {
//             nums[i - 1] = nums[i]; // Shift left
//         }
//         nums[nums.length - 1] = first; // Move first to last
//     }
// }

//Left Rotate Array by k Places
// import java.util.Arrays;

// public class Main {
//     public static void main(String[] args) {
//         int[] nums = {1, 2, 3, 4, 5};
//         int k = 2;

//         leftRotate(nums, k);
//         System.out.println(Arrays.toString(nums)); // Output: [3, 4, 5, 1, 2]
//     }

//     public static void leftRotate(int[] nums, int k) {
//         if (nums == null || nums.length <= 1) return;

//         int n = nums.length;
//         k = k % n; // Handles cases where k is greater than array length
//         if (k == 0) return;

//         reverse(nums, 0, k - 1); // Step 1: Reverse first k elements
//         reverse(nums, k, n - 1); // Step 2: Reverse remaining elements
//         reverse(nums, 0, n - 1); // Step 3: Reverse entire array
//     }

//     // Helper method to reverse array elements in-place
//     private static void reverse(int[] nums, int start, int end) {
//         while (start < end) {
//             int temp = nums[start];
//             nums[start] = nums[end];
//             nums[end] = temp;
//             start++;
//             end--;
//         }
//     }
// }

//Move Zeros to END
// import java.util.Arrays;

// public class Main {
//     public static void main(String[] args) {
//         int[] nums = {0, 1, 0, 3, 12};
        
//         moveZeroes(nums);
//         System.out.println(Arrays.toString(nums)); // Output: [1, 3, 12, 0, 0]
//     }

//     public static void moveZeroes(int[] nums) {
//         if (nums == null || nums.length <= 1) return;

//         int idx = 0; // Pointer to place the next non-zero element

//         // Step 1: Shift all non-zero elements forward
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] != 0) {
//                 nums[idx++] = nums[i];
//             }
//         }

//         // Step 2: Fill the rest of the array with zeros
//         while (idx < nums.length) {
//             nums[idx++] = 0;
//         }
//     }
// }

//Linear Search
// public class Main {
//     public static void main(String[] args) {
//         int[] nums = {4, 2, 9, 1, 7, 5};
//         int target = 7;

//         int index = linearSearch(nums, target);
//         System.out.println("Element found at index: " + index); // Output: 4
//     }

//     public static int linearSearch(int[] nums, int target) {
//         if (nums == null) return -1;

//         // Loop through every element sequentially
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] == target) {
//                 return i; // Target found, return index immediately
//             }
//         }
//         return -1; // Target not found in the array
//     }
// }

