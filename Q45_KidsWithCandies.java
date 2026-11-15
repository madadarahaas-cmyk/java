import java.util.*;
public class Main {
 public static List<Boolean> kidsWithCandies(int[] a,int e){int m=0;for(int n:a)m=Math.max(m,n);List<Boolean> r=new ArrayList<>();for(int n:a)r.add(n+e>=m);return r;}
 public static void main(String[] x){System.out.println(kidsWithCandies(new int[]{2,3,5,1,3},3));}}
