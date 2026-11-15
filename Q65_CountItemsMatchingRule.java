import java.util.*;
public class Main {
 public static int countMatches(List<List<String>> a,String k,String v){int i=k.equals("type")?0:k.equals("color")?1:2,c=0;for(List<String> item:a)if(item.get(i).equals(v))c++;return c;}
 public static void main(String[] x){List<List<String>> a=new ArrayList<>();a.add(Arrays.asList("phone","blue","pixel"));a.add(Arrays.asList("computer","silver","lenovo"));a.add(Arrays.asList("phone","gold","iphone"));System.out.println(countMatches(a,"color","silver"));}}
