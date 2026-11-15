import java.util.Arrays;
public class Main {
 public static void moveZeroes(int[] a){int k=0;for(int n:a)if(n!=0)a[k++]=n;while(k<a.length)a[k++]=0;}
 public static void main(String[] x){int[] a={0,1,0,3,12};moveZeroes(a);System.out.println(Arrays.toString(a));}}
