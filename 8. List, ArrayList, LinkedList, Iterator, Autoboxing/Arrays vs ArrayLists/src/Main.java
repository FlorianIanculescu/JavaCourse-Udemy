import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("-".repeat(30));

        String[] orifinalArray = new String[] {"Frist", "Second", "Third"};
        var originalList = Arrays.asList(orifinalArray);

        originalList.set(0, "one");
        System.out.println("list: " + originalList);
        System.out.println("array: " + Arrays.toString(orifinalArray));
        System.out.println("-".repeat(30));

        originalList.sort(Comparator.naturalOrder());
        System.out.println("list: " + originalList);
        System.out.println("array: " + Arrays.toString(orifinalArray));
        System.out.println("-".repeat(30));

        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");
        System.out.println(newList);
        System.out.println("-".repeat(30));

    }
}