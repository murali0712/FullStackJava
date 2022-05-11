/* Diagonal traversal of a matrix
Given a 2D matrix of size NxN, print the sum of the elements of all its diagonals.

Input Format

First line of input contains T - number of test cases. First line of each test case contains N - size of the matrix. Each of the next N lines contains N integers - the elements of the matrix.

Constraints

1 <= T <= 100
1 <= N <= 100
-100 <= ar[i][j] <= 100

Output Format

For each test case, print the sum of the elements of all the diagonals, separated by newline. Refer samples for more clarity.

Sample Input 0

4
3
-5 0 4 
2 8 -6 
3 7 1 
1
-4 
2
5 -2 
-4 1 
6
-2 -3 -6 -5 50 3 
8 7 10 -5 -3 30 
6 3 70 9 -20 -7 
-9 9 -6 7 3 2 
-1 7 7 6 -4 3 
8 5 6 -9 40 8  

Sample Output 0

4 -6 4 9 3 
-4 
-2 6 -4 
3 80 -15 -29 22 86 51 13 4 4 8 
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */ 
         Scanner sc = new Scanner(System.in);   
        int t=sc.nextInt();
        for(int x=0;x<t;x++ ){
     int n= sc.nextInt(); 
     int a[][]= new int[n][n];  
     for(int i=0;i<n;i++) { 
       for(int j=0;j<n;j++) 
         a[i][j]= sc.nextInt(); 
         
       } 
       for(int g=n-1;g>=0;g--) { 
         int sum=0;
         for(int i=0,j=g;j<n;i++,j++){ 
           sum+=a[i][j];
      //   System.out.println(); 
         }       
         System.out.print(sum+" ");
         } 
         
         for(int g=1;g<n;g++) {  
           int add=0;
           for(int i=g,j=0;i<n ;i++,j++) 
           add+= a[i][j]; 
           System.out.print(add+" "); 
           } 
            System.out.println();
        }
   }
 }
