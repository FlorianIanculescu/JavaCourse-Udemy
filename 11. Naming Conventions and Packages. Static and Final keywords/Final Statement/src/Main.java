public class Main {


    public static void main(String[] args) {

        System.out.println("-".repeat(40));
        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println("-".repeat(40));
        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

//        one.instanceNumber = 4;
        System.out.println("-".repeat(40));
        System.out.println(Math.PI);
//        Math m = new Math();

        System.out.println("-".repeat(40));
        int pw = 674312;
        Password password = new ExtendedPassword(pw);
        password.storePassword();

        System.out.println("-".repeat(40));
        password.letMeIn(1);
        password.letMeIn(523266);
        password.letMeIn(9773);
        password.letMeIn(0);
        password.letMeIn(-1);
        password.letMeIn(674312);

        System.out.println("*".repeat(40));
        System.out.println("*".repeat(40));

        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);
    }
}