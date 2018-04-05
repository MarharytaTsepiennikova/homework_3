/*
 Задать массив целых чисел длинной N эл.
 Поменять 1-й и последний элемент местами.
 Вывести массив на экран.

 */


import java.util.Arrays;

public class Homework3_2 {
    public static void main(String[] args) {

        int[] list = {56, -87, 125, 98};
        int count = list[0];
        list[0] = list[list.length - 1];
        list[list.length - 1] = count;
        System.out.println(Arrays.toString(list));

    }
}
