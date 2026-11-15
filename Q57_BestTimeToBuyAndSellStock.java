public class Main {
 public static int maxProfit(int[] a){int min=Integer.MAX_VALUE,p=0;for(int n:a){min=Math.min(min,n);p=Math.max(p,n-min);}return p;}
 public static void main(String[] x){System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));}}
