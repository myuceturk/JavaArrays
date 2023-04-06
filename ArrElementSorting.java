package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrElementSorting {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number, e;
        System.out.print("Dizinin boyutunu giriniz: ");
        number = inp.nextInt();
        int[] list = new int[number];

        for (int i = 0; i < list.length; ++i) {
            System.out.print(i + 1 + ". Elamanı Giriniz:");
            e = inp.nextInt();
            list[i] = e;
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
