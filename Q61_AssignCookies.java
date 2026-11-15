import java.util.Arrays;
public class Main {
 public static int findContentChildren(int[] g,int[] s){Arrays.sort(g);Arrays.sort(s);int i=0,j=0;while(i<g.length&&j<s.length){if(s[j]>=g[i])i++;j++;}return i;}
 public static void main(String[] x){System.out.println(findContentChildren(new int[]{1,2,3},new int[]{1,1}));}}
