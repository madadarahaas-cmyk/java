public class Q14_LongestWordInSentence {
    public static void main(String[] args) {
        String sentence = "Java programming is interesting";
        String[] words = sentence.split(" ");
        String longest = words[0];

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Longest word: " + longest);
    }
}