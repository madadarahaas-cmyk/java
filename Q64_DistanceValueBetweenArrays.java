public class Main {
 public static int findTheDistanceValue(int[] a,int[] b,int d){int c=0;for(int x:a){boolean ok=true;for(int y:b)if(Math.abs(x-y)<=d){ok=false;break;}if(ok)c++;}return c;}
 public static void main(String[] x){System.out.println(findTheDistanceValue(new int[]{4,5,8},new int[]{10,9,1,8},2));}}
