package Arrays;

public class HermonikSayilar {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double sum = 0;
        for (double arr : numbers) {
            sum += (1 / arr);
        }
        System.out.println(sum);
    }
}
