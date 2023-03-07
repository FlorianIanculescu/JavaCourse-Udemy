public class Horse extends Mammal {

    public Horse(String type, String size, double weigth) {
        super(type, size, weigth);
    }

    @Override
    public void makeNoise() {

    }

    @Override
    public void ShedHair() {
        System.out.println(getExplicitType() + " seds in the spring");
    }
}
