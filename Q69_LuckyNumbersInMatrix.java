import java.util.*;
public class Main {
 public static List<Integer> luckyNumbers(int[][] a){List<Integer> r=new ArrayList<>();for(int i=0;i<a.length;i++){int min=a[i][0],col=0;for(int j=1;j<a[i].length;j++)if(a[i][j]<min){min=a[i][j];col=j;}boolean ok=true;for(int k=0;k<a.length;k++)if(a[k][col]>min)ok=false;if(ok)r.add(min);}return r;}
 public static void main(String[] x){System.out.println(luckyNumbers(new int[][]{{3,7,8},{9,11,13},{15,16,17}}));}}
