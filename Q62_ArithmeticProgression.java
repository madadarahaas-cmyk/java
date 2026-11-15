import java.util.Arrays;
public class Main {
 public static boolean canMakeArithmeticProgression(int[] a){Arrays.sort(a);int d=a[1]-a[0];for(int i=2;i<a.length;i++)if(a[i]-a[i-1]!=d)return false;return true;}
 public static void main(String[] x){System.out.println(canMakeArithmeticProgression(new int[]{3,5,1}));}}
