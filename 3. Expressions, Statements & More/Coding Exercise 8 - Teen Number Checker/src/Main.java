public class Main {
    public static void main(String[] args) {

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
    }

    public static boolean hasTeen(int first, int second, int third) {
        return (isTeen(first) || isTeen(second) || isTeen(third));
    }

    public static boolean isTeen(int number) {
        if((number >= 13 && number <= 19)) {
            return true;
        } else {
            return false;
        }
    }
}