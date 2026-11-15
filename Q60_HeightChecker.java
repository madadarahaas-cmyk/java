import java.util.Arrays;
public class Main {
 public static int heightChecker(int[] a){int[] b=a.clone();Arrays.sort(b);int c=0;for(int i=0;i<a.length;i++)if(a[i]!=b[i])c++;return c;}
 public static void main(String[] x){System.out.println(heightChecker(new int[]{1,1,4,2,1,3}));}}
