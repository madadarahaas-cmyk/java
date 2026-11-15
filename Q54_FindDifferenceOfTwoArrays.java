import java.util.*;
public class Main {
 public static List<List<Integer>> findDifference(int[] a,int[] b){Set<Integer>x=new HashSet<>(),y=new HashSet<>();for(int n:a)x.add(n);for(int n:b)y.add(n);List<Integer>p=new ArrayList<>(),q=new ArrayList<>();for(int n:x)if(!y.contains(n))p.add(n);for(int n:y)if(!x.contains(n))q.add(n);return Arrays.asList(p,q);}
 public static void main(String[] z){System.out.println(findDifference(new int[]{1,2,3},new int[]{2,4,6}));}}
