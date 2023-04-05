package Arrays;

import java.util.Arrays;

public class RepeatingNumbers {
    public static void main(String[] args) {
        int[] arr = {7, 30, 4, 4, 5, 7, 8, 10, 30, 41, 13, 5, 8, 10, 0, 1, 3};
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i != j) && (arr[i] == arr[j])) {
                    if (arr[i] % 2 == 0) {
                        System.out.println(arr[i]);
                        break;
                    }
                }
            }
        }

    }
}
