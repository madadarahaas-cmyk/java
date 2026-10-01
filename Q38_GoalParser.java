public class Q38_GoalParser {
    public static void main(String[] args) {
        String command = "G()(al)";
        String result = "";

        command = command.replace("()", "o");
        command = command.replace("(al)", "al");

        result = command;

        System.out.println(result);
    }
}