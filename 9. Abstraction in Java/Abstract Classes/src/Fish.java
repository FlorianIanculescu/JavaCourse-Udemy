public class Fish extends Animal {


    public Fish(String type, String size, double weigth) {
        super(type, size, weigth);
    }

    @Override
    public void move(String speed) {

        System.out.println(getExplicitType() + (speed == "slow" ? " lazily swimming" : " darting frantically"));
    }

    @Override
    public void makeNoise() {

        if(type == "Goldfish") {
            System.out.println("swish!!");
        } else {
            System.out.println("splash!!");
        }
    }
}
