/*
Given a stream of incoming numbers, find average or mean of the stream at every point.

Example 1:

Input:
n = 5
arr[] = {10, 20, 30, 40, 50}
Output: 10.00 15.00 20.00 25.00 30.00
Explanation:
10 / 1 = 10.00
(10 + 20) / 2 = 15.00
(10 + 20 + 30) / 3 = 20.00
And so on.
 */

package school.mathematics;

import java.util.Arrays;

public class Average_In_Stream {
    public static void main(String[] args) {
        int n=5;
        int[] arr = {10, 20, 30, 40, 50};
        float[] result = streamAvg(arr,n);
        System.out.println(Arrays.toString(result));

    }
    static float[] streamAvg(int[] arr, int n) {
        // code here
        float sum=0;
        float[] array = new float[n];
        for(int i=1; i<=n; i++ ){
            sum +=arr[i-1];
            array[i-1]=sum/i;
        }
        return array;
    }
}
