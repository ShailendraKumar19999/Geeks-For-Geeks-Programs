/*
Find the focal length of the spherical mirror with the given radius-of-curvature R.


Example 1:

Input: type = "concave", R = 5.4
Output: 2
Example 2:

Input: type = "convex", R = 10
Output: -5

 */



package school.mathematics;

public class Determine_focal_length_of_spherical_mirror {
    public static void main(String[] args) {
       int result = findFocalLength(26.01f,"convex");
        System.out.println(result);
    }
    public static int findFocalLength(float R, String type)
    {
        // for comparison string use .equals("string") method
        if(type.equals("concave")){
            return (int)(R/2);
        }
        else{
            return -(int)Math.ceil(R/2);
        }
    }
}
