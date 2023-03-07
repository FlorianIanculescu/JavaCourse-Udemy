import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Integer boxedInt = Integer.valueOf(15);             // preferred but unnecessary
        Integer deprecatedBoxing = new Integer(15);      // deprecated since JDK 9
        int unboxedInt = boxedInt.intValue();                 // unnecessary

        // Automatic
        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());
//        System.out.println(autoUnboxed.getClass().getName());

        Double resultBoxed = getLiteralDoublePrimitive();
        double resultUnboxed = getDoubleObject();

        System.out.println("Double Object = " + resultBoxed);
        System.out.println("Double Primitive = " + resultUnboxed);
        System.out.println("-".repeat(40));

        Integer[] wrappetArray = new Integer[5];
        wrappetArray[0] = 50;
        System.out.println(Arrays.toString(wrappetArray));

        System.out.println(wrappetArray[0].getClass().getName());
        System.out.println("-".repeat(40));

        Character[] characterArray = {'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(characterArray));

        System.out.println(characterArray[2].getClass().getName());
        System.out.println("-".repeat(40));

        var ourList = getList(1, 2, 3, 4, 5);
        System.out.println(ourList);
        System.out.println("-".repeat(40));

        var otherList = List.of(6, 7, 8, 9, 10);
        System.out.println(otherList);
        System.out.println("-".repeat(40));
    }


    private static Double getDoubleObject() {

        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitive() {

        return 100.00;
    }

    private static Integer returnAnInteger(int i) {
        return i;
    }

    private static int returnAnInt(Integer i) {

        return i;
    }

    private static ArrayList<Integer> getList(int... varargs) {
        ArrayList<Integer> aList = new ArrayList<>();
        for(int i : varargs) {
            aList.add(i);
        }
        return aList;
    }
}