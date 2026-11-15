import java.util.*;

public class Q45_CountItemsMatchingRule {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone", "gold", "iphone"));
        System.out.println(countMatches(items, "color", "silver"));
    }

    static int countMatches(List<List<String>> items, String key, String value) {
        int index = key.equals("type") ? 0 : key.equals("color") ? 1 : 2;
        int count = 0;
        for (List<String> item : items)
            if (item.get(index).equals(value)) count++;
        return count;
    }
}
