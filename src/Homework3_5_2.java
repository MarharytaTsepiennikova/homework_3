/*
Написать программу, которая позволит задать длину массива с клавиатуры,
наполнить его элементами, а затем выводить нужный элемент по его индексу на консоль.
 */
import  java.util.Scanner;

public class Homework3_5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n = scanner.nextInt();
        int[] list = new int[n];
        System.out.println("Enter numbers: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("Enter index of element to find a value: ");
        int index = scanner.nextInt();
        System.out.println(list[index]);
    }
}
