import java.util.Arrays;
public class Main {
 public static int[] buildArray(int[] a){int[] r=new int[a.length];for(int i=0;i<a.length;i++)r[i]=a[a[i]];return r;}
 public static void main(String[] x){System.out.println(Arrays.toString(buildArray(new int[]{0,2,1,5,3,4})));}}
