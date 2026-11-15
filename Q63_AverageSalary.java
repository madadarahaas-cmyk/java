public class Main {
 public static double average(int[] a){int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,sum=0;for(int n:a){sum+=n;min=Math.min(min,n);max=Math.max(max,n);}return (double)(sum-min-max)/(a.length-2);}
 public static void main(String[] x){System.out.println(average(new int[]{4000,3000,1000,2000}));}}
