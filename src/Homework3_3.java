/*
Ввести с клавиатуры массив из 10 чисел.
Разбить его на два массива равной длинны.
Отсортировать каждую из половинок и вывести их содержимое на экран.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Homework3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] list = new int[10];
        System.out.println("Enter array of 10 numbers: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        int[] rez1 = new int[5];
        int[] rez2 = new int[5];

        System.arraycopy(list, 0, rez1, 0, 5);
        System.arraycopy(list,5, rez2, 0, 5);

        Arrays.sort(rez1);
        Arrays.sort(rez2);

        System.out.println(Arrays.toString(rez1));
        System.out.println(Arrays.toString(rez2));
    }
}
