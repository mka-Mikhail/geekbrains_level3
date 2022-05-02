package lesson_1;

import java.util.ArrayList;

public class Num2 {

    public static void main(String[] args) {

        Integer[] integers = {1, 2, 3, 4, 5};
        String[] strings = {"AAA", "BBB", "CCC", "1A"};

        ArrayList arrayList1 = convertToArrayList(integers);
        ArrayList arrayList2 = convertToArrayList(strings);
    }

    public static <T> ArrayList<T> convertToArrayList(T[] array) {
        ArrayList<T> arrayList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }

        return arrayList;
    }
}
