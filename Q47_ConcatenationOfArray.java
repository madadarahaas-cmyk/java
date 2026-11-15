import java.util.Arrays;
public class Main {
 public static int[] getConcatenation(int[] a){int[] r=new int[2*a.length];for(int i=0;i<a.length;i++){r[i]=a[i];r[i+a.length]=a[i];}return r;}
 public static void main(String[] x){System.out.println(Arrays.toString(getConcatenation(new int[]{1,2,1})));}}
