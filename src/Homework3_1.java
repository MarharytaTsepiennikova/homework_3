/*
Задать массив целых чисел длинной 10 элементов.
Отсортировать числа в массиве.
Вывести на экран результат.
Сделать возможность наполнения массива с клавиатуры.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Homework3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] list = new int[10];
        System.out.println("Enter array of 10 numbers: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        Arrays.sort(list);
        String s = Arrays.toString(list);
        System.out.println(s);
    }
}
