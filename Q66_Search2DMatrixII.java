public class Main {
 public static boolean searchMatrix(int[][] a,int t){if(a==null||a.length==0)return false;for(int[] r:a)for(int n:r)if(n==t)return true;return false;}
 public static void main(String[] x){int[][] a={{1,4,7},{2,5,8},{3,6,9}};System.out.println(searchMatrix(a,5));}}
