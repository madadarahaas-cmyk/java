import java.util.Arrays;
public class Main {
 public static int[] plusOne(int[] a){for(int i=a.length-1;i>=0;i--){if(a[i]<9){a[i]++;return a;}a[i]=0;}int[] r=new int[a.length+1];r[0]=1;return r;}
 public static void main(String[] x){System.out.println(Arrays.toString(plusOne(new int[]{9,9,9})));}}
