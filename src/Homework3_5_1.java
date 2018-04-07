/*
Написать код для зеркального переворота массива(1, 2, 3, 4) -> (4, 3, 2, 1).
 */
import java.util.Arrays;

public class Homework3_5_1 {
    public static void main(String[] args) {

        int[] list = {1, 2, 3, 4};
        int var = list[0];
        int n = list.length;
        for (int i = 0; i < list.length; i++) {
            list[i] = list[--n];
        }
        list[list.length-1] = var;

        System.out.println(Arrays.toString(list));

    }
}
