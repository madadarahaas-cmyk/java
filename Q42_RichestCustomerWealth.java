public class Main {
 public static int maximumWealth(int[][] a){int max=0;for(int[] r:a){int s=0;for(int n:r)s+=n;max=Math.max(max,s);}return max;}
 public static void main(String[] x){System.out.println(maximumWealth(new int[][]{{1,2,3},{3,2,1},{2,8,7}}));}}
