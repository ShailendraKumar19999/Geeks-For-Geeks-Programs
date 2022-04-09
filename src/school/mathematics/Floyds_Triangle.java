/*
Given a number N. The task is to print Floyd's triangle with N lines.

Example 1:

Input:
N = 4

Output:
1
2 3
4 5 6
7 8 9 10

Explanation:
For N = 4 there are 4 rows in the output
and the number of elements increases
with an increase in the row.

 */


package school.mathematics;

public class Floyds_Triangle {
    public static void main(String[] args) {
        int N = 5;
        printFloydTriangle(N);
    }

    static void printFloydTriangle(int N){
        int p=1;
        for(int i=0; i<N; i++){
            for(int j=0; j<=i; j++){
                System.out.print(p++ + " ");
            }
            System.out.println();
        }
    }
}
