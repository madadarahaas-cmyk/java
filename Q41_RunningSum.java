import java.util.Arrays;
public class Main {
 public static int[] runningSum(int[] a){for(int i=1;i<a.length;i++)a[i]+=a[i-1];return a;}
 public static void main(String[] x){System.out.println(Arrays.toString(runningSum(new int[]{3,1,2,10,1})));}}
