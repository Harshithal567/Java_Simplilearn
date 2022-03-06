package com.project.lis;

public class lis {

    public static int LIS(int[] arr, int i, int n, int prev)
    {
       
        if (i == n) {
            return 0;
        }
 
       // CASE 1 : exclude the current element and process the
       // remaining elements
        int excl = LIS(arr, i + 1, n, prev);
 
        // CASE 2 : include the current element if it is greater
        // than the previous element in LIS
        int incl = 0;
        if (arr[i] > prev) {
            incl = 1 + LIS(arr, i + 1, n, arr[i]);
        }
 
       
        return Integer.max(incl, excl);
    }
     //Initiate main method
    public static void main(String[] args)
    {
        int[] arr = { 0, 15, 19, 20, 17, 1, 3, 9, 11, 2, 8, 7, 12, 4, 10, 6, 22 };
 
        System.out.println("The longest increasing sequence is "
                        + LIS(arr, 0, arr.length, Integer.MIN_VALUE));
    }
	
	
	
}
