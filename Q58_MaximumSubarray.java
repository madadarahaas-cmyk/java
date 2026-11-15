public class Main {
 public static int maxSubArray(int[] a){int sum=a[0],max=a[0];for(int i=1;i<a.length;i++){sum=Math.max(a[i],sum+a[i]);max=Math.max(max,sum);}return max;}
 public static void main(String[] x){System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));}}
