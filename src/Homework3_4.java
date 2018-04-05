/*
Среднее арифметическое элементов массива.
 */

public class Homework3_4 {
    public static void main(String[] args) {

        int[] list = {5, -49, 8, 306, -71};
        long sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        long rez = sum / list.length;
        System.out.println(rez);

    }
}
