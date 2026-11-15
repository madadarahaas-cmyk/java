import java.util.Arrays;
public class Main {
 public static int[][] transpose(int[][] a){int[][] r=new int[a[0].length][a.length];for(int i=0;i<a.length;i++)for(int j=0;j<a[0].length;j++)r[j][i]=a[i][j];return r;}
 public static void main(String[] x){for(int[] r:transpose(new int[][]{{1,2,3},{4,5,6}}))System.out.println(Arrays.toString(r));}}
