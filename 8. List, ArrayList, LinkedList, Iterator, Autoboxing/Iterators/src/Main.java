import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

//        LinkedList<String> placesToVisit = new LinkedList<>();
        System.out.println("-".repeat(40));
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");
        System.out.println(placesToVisit);
        System.out.println("-".repeat(40));

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);
        System.out.println("-".repeat(40));

//        removeElements(placesToVisit);
//        System.out.println(placesToVisit);
//        System.out.println("-".repeat(25));

        gettingElements(placesToVisit);
        System.out.println("-".repeat(40));

        System.out.println(placesToVisit);
        System.out.println("-".repeat(40));

        printItinerary(placesToVisit);
        System.out.println("-".repeat(40));

        printItinerary2(placesToVisit);
        System.out.println("-".repeat(40));

        printItinerary3(placesToVisit);
        System.out.println("-".repeat(40));

        testIterator(placesToVisit);
        System.out.println("-".repeat(40));
    }

    private static void addMoreElements(LinkedList<String> list) {

        list.addFirst("Darwin");
        list.addLast("Hobart");

        // Queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");

        // Stack methods
        list.push("Alice Springs");
    }

    private static void removeElements(LinkedList<String> list) {

        list.remove(4);
        System.out.println("-".repeat(25));

        list.remove("Brisbane");
        System.out.println("-".repeat(25));

        System.out.println(list);
        String s1 = list.remove();  // removes first element
        System.out.println(s1 + " was removed");
        System.out.println("-".repeat(25));

        System.out.println(list);
        String s2 = list.removeFirst(); // removes first element
        System.out.println(s2 + " was removed");
        System.out.println("-".repeat(25));

        System.out.println(list);
        String s3 = list.removeLast(); // removes last element
        System.out.println(s3 + " was removed");
        System.out.println("-".repeat(25));

        // Queue/Dequeue poll methods
        System.out.println(list);
        String p1 = list.poll(); // removes first element
        System.out.println(p1 + " was removed");
        System.out.println("-".repeat(25));

        System.out.println(list);
        String p2 = list.pollFirst(); // removes first element
        System.out.println(p2 + " was removed");
        System.out.println("-".repeat(25));

        System.out.println(list);
        String p3 = list.pollLast(); // removes last element
        System.out.println(p3 + " was removed");
        System.out.println("-".repeat(25));

        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);
        System.out.println("-".repeat(25));

        String p4 = list.poll(); // removes first element
        System.out.println(p4 + " was removed");
        System.out.println(list);
        System.out.println("-".repeat(25));
    }

    private static void gettingElements(LinkedList<String> list) {

        System.out.println("Retrieved Element = " + list.get(4));

        System.out.println("First Element = " + list.getFirst());
        System.out.println("Last Element = " + list.getLast());

        System.out.println("Darwin is at position: " + list.indexOf("Darwin"));
        System.out.println("Melbourne is at position: " + list.lastIndexOf("Melbourne"));

        // Queue retrieval method
        System.out.println("Element from element() = " + list.element());

        //Stack retrieval methods
        System.out.println("Element from peek() = " + list.peek());
        System.out.println("Element from peekFrist() = " + list.peekFirst());
        System.out.println("Element from peekLast() = " + list.peekLast());
    }

    private static void printItinerary(LinkedList<String> list) {

        System.out.println("Trip starts at " + list.getFirst());
        for(int i = 1; i < list.size(); i++) {
            System.out.println("--> From: " + list.get(i - 1) + " to " + list.get(i));
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    private static void printItinerary2(LinkedList<String> list) {

        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        for(String town : list) {
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    private static void printItinerary3(LinkedList<String> list) {

        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();

        ListIterator<String> iterator = list.listIterator(1);
        while(iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    private static void testIterator(LinkedList<String> list) {

        var iterator = list.listIterator();
        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
            if(iterator.next().equals("Brisbane")) {
                iterator.add("Lake Wivenhoe");
            }
        }
        while(iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
        System.out.println(list);

        var iterator2 = list.listIterator(3);
        System.out.println(iterator2.previous());
    }
}