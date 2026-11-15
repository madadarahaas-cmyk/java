public class Main {
 public static char nextGreatestLetter(char[] a,char t){int l=0,r=a.length-1;while(l<=r){int m=l+(r-l)/2;if(a[m]<=t)l=m+1;else r=m-1;}return a[l%a.length];}
 public static void main(String[] x){System.out.println(nextGreatestLetter(new char[]{'c','f','j'},'a'));}}
