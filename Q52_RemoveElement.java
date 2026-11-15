import java.util.Arrays;
public class Main {
 public static int removeElement(int[] a,int v){int k=0;for(int n:a)if(n!=v)a[k++]=n;return k;}
 public static void main(String[] x){int[] a={3,2,2,3};int k=removeElement(a,3);System.out.println(k+" "+Arrays.toString(Arrays.copyOf(a,k)));}}
