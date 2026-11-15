import java.util.Arrays;
public class Main {
 public static int[] shuffle(int[] a,int n){int[] r=new int[2*n];for(int i=0;i<n;i++){r[2*i]=a[i];r[2*i+1]=a[i+n];}return r;}
 public static void main(String[] x){System.out.println(Arrays.toString(shuffle(new int[]{2,5,1,3,4,7},3)));}}
