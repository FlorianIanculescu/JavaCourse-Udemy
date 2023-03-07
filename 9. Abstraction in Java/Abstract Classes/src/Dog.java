public class Dog extends Mammal {


    public Dog(String type, String size, double weigth) {
        super(type, size, weigth);
    }

    @Override
    public void move(String speed) {

        System.out.println(getExplicitType() + (speed == "slow" ? " walking" : " running"));
    }

    @Override
    public void ShedHair() {
        System.out.println(getExplicitType() + " shed hair all the time");
    }

    @Override
    public void makeNoise() {

        if(type == "Wolf") {
            System.out.println("Howling!");
        } else {
            System.out.println("Woof!");
        }
    }
}
