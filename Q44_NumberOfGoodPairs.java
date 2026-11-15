public class Main {
 public static int numIdenticalPairs(int[] a){int c=0;for(int i=0;i<a.length;i++)for(int j=i+1;j<a.length;j++)if(a[i]==a[j])c++;return c;}
 public static void main(String[] x){System.out.println(numIdenticalPairs(new int[]{1,2,3,1,1,3}));}}
