package lesson_1.Num3;

public class Fruit {

    private float weight;
    private String name;

    public Fruit(float weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name + " " + weight;
    }
}
