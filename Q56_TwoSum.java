import java.util.Arrays;
public class Main {
 public static int[] twoSum(int[] a,int t){for(int i=0;i<a.length;i++)for(int j=i+1;j<a.length;j++)if(a[i]+a[j]==t)return new int[]{i,j};return new int[]{};}
 public static void main(String[] x){System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15},9)));}}
