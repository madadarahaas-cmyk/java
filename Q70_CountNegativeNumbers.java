public class Main {
 public static int countNegatives(int[][] a){int c=0;for(int[] r:a)for(int n:r)if(n<0)c++;return c;}
 public static void main(String[] x){int[][] a={{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};System.out.println(countNegatives(a));}}
