package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class ArrMaxMin {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int number;
        System.out.print("Sayı giriniz:");
        number = inp.nextInt();
        int min = 0, max = number;
        Arrays.sort(list);

        for (int i = 0; i < list.length; i++) {
            if (number < list[i]) {
                max = list[i];
                min = list[i - 1];
                break;
            }
        }
        System.out.println(number + " sayıdan küçük en yakın sayı: " + min);
        System.out.println(number + " sayıdan büyük en yakın sayı: " + max);

    }
}
