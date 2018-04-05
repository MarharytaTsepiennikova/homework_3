/*
Написать код для зеркального переворота массива(1, 2, 3, 4) -> (4, 3, 2, 1).
 */
import java.util.Arrays;

public class Homework3_5_1 {
    public static void main(String[] args) {

        int[] list1 = {1, 2, 3, 4};
        int[] list2 = new int[4];

        list2[0] = list1[3];
        list2[1] = list1[2];
        list2[2] = list1[1];
        list2[3] = list1[0];

        System.out.println(Arrays.toString(list1));
        System.out.println(Arrays.toString(list2));

    }
}
