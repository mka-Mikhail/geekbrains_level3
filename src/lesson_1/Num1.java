package lesson_1;

import java.util.Arrays;

public class Num1 {

    public static void main(String[] args) {

        Integer[] integers = {1, 2, 3, 4, 5};
        Double[] doubles = {2.4, 4.67, 2.8, -12.0};
        String[] strings = {"AAA", "BBB", "CCC", "1A"};
        Float[] floats = {1.3f, -5.8f};

        System.out.println(Arrays.toString(changingPlaces(integers)));
        System.out.println(Arrays.toString(changingPlaces(doubles)));
        System.out.println(Arrays.toString(changingPlaces(strings)));
        System.out.println(Arrays.toString(changingPlaces(floats)));
    }

    public static <T> T[] changingPlaces(T[] array) {
        T hold;

        if (array.length > 1) {
            hold = array[0];
            array[0] = array[1];
            array[1] = hold;
            return array;
        }
        return array;
    }
}
