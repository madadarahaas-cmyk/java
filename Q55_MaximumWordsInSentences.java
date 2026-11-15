public class Main {
 public static int mostWordsFound(String[] a){int m=0;for(String s:a)m=Math.max(m,s.split(" ").length);return m;}
 public static void main(String[] x){System.out.println(mostWordsFound(new String[]{"alice and bob love leetcode","i think so too","this is great thanks very much"}));}}
