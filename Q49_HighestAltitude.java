public class Main {
 public static int largestAltitude(int[] a){int s=0,m=0;for(int n:a){s+=n;m=Math.max(m,s);}return m;}
 public static void main(String[] x){System.out.println(largestAltitude(new int[]{-5,1,5,0,-7}));}}
