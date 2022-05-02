package lesson_1.Num3;

import java.util.ArrayList;

public class Box <T extends Fruit> {

    private ArrayList<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }

    public void addInBox(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        float totalWeight = 0.0f;

        for (T fruit :
                fruits) {
            totalWeight += fruit.getWeight();
        }

        return totalWeight;
    }

    public boolean compare(Box<? extends Fruit> box) {
        return Float.compare(this.getWeight(), box.getWeight()) == 0;
    }

    public void addFruits(ArrayList<T> fruits) {
        this.fruits.addAll(fruits);
    }

    public void putInBox(Box<T> box) {
        box.addFruits(this.getFruits());
        fruits.clear();
    }
}