public class Main {
 public static int pivotIndex(int[] a){int t=0,l=0;for(int n:a)t+=n;for(int i=0;i<a.length;i++){if(l==t-l-a[i])return i;l+=a[i];}return -1;}
 public static void main(String[] x){System.out.println(pivotIndex(new int[]{1,7,3,6,5,6}));}}
