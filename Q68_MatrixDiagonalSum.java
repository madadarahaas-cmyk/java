public class Main {
 public static int diagonalSum(int[][] a){int n=a.length,s=0;for(int i=0;i<n;i++)s+=a[i][i]+a[i][n-1-i];if(n%2==1)s-=a[n/2][n/2];return s;}
 public static void main(String[] x){System.out.println(diagonalSum(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));}}
