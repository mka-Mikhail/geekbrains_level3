package lesson_1.Num3;

public class Main {

    public static void main(String[] args) {

        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        for (int i = 0; i < 3; i++) {
            appleBox1.addInBox(new Apple());
            appleBox2.addInBox(new Apple());
            orangeBox.addInBox(new Orange());
        }

        System.out.println("Коробка с яблоками 1: " + appleBox1.getFruits());
        System.out.println("Коробка с яблоками 2: " + appleBox2.getFruits());
        System.out.println("Коробка с апельсинами: " + orangeBox.getFruits());
        System.out.println("-------------------------------\n");

        System.out.println("Сравнение коробок");
        System.out.println("Коробка яблок 1 с Коробкой апельсинов: " + appleBox1.compare(orangeBox));
        System.out.println("Коробка яблок 1 с Коробкой яблок 2: " + appleBox2.compare(appleBox1));
        System.out.println("-------------------------------\n");

        System.out.println("Добавление фрукта в коробку");
        System.out.println("Вес коробки с апельсинами ДО: " + orangeBox.getWeight());
        orangeBox.addInBox(new Orange());
        System.out.println("Вес коробки с апельсинами ПОСЛЕ: " + orangeBox.getWeight());
        System.out.println("-------------------------------\n");

        System.out.println("Яблоки из коробки 1 пересыпаем в коробку 2");
        System.out.println("Вес коробки 1 ДО: " + appleBox1.getWeight());
        System.out.println("Вес коробки 2 ДО: " + appleBox2.getWeight());
        appleBox1.putInBox(appleBox2);
        System.out.println("Вес коробки 1 ПОСЛЕ: " + appleBox1.getWeight());
        System.out.println("Вес коробки 2 ПОСЛЕ: " + appleBox2.getWeight());
        System.out.println("-------------------------------\n");
    }
}
