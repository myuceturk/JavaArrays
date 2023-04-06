package Arrays;

import java.util.Arrays;

public class FrequencyofElements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        Arrays.sort(arr);
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    ++count;
                }
            }

            if (i != 0 && arr[i - 1] != arr[i]) {
                System.out.println(arr[i] + " sayısı " + count + " kere tekrar etmiş");
            } else if (i == 0 && arr[i + 1] != arr[i]) {
                System.out.println(arr[i] + " sayısı " + count + " kere tekrar etmiş");
            }
        }
    }
}
