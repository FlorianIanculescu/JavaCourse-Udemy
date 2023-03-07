public abstract class Animal {

    protected String type;
    private String size;
    private double weigth;

    public Animal(String type, String size, double weigth) {
        this.type = type;
        this.size = size;
        this.weigth = weigth;
    }

    public abstract void move(String speed);

    public abstract void makeNoise();

    public final String getExplicitType() {
        return getClass().getSimpleName() + " (" + type + ")";
    }
}

abstract class Mammal extends Animal {

    public Mammal(String type, String size, double weigth) {
        super(type, size, weigth);
    }

    @Override
    public void move(String speed) {
        System.out.println(getExplicitType() + " " + (speed.equals("slow") ? "walks" : "runs"));
    }

    public abstract void ShedHair();
}
