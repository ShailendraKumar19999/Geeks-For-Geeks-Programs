/*
Given length l, width b and height h of a cuboid. Find the total surface area and volume of cuboid.


Example 1:

Input: l = 1, b = 2, h = 3
Output: 22 6
Explanation: Surface area = 2 * (2 * 3
+ 3 * 1 + 1 * 2) = 22 and volume =
1 * 2 * 3 = 6
 */

package school.mathematics;

import java.util.Arrays;

public class Surface_Area_and_Volume_of_Cuboid {
    public static void main(String[] args) {
        int l=29077;
        int b=62884;
        int h=99973;
        long[] arr = find(l,b,h);
        System.out.println(Arrays.toString(arr));
    }

    static long[] find(int l, int b, int h)
    {
        // code here
        long L=l;
        long B=b;
        long H = h;
        long[] arr = new long[2];
        long surfaceArea=0,volume=0;
        surfaceArea = 2*(L*B + B*H + H*L);
        volume = L*B*H;
        arr[0]= surfaceArea;
        arr[1]= volume;
        return arr;
    }
}
