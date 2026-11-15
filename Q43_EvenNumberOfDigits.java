public class Main {
 public static int findNumbers(int[] a){int c=0;for(int n:a)if(String.valueOf(n).length()%2==0)c++;return c;}
 public static void main(String[] x){System.out.println(findNumbers(new int[]{12,345,2,6,7896}));}}
