package question04;

import java.util.Random;

public class soru4 {
    public static void main(String[] args) {
        Random random = new Random();
        int guess = 0;
        while (true) {
            int number = random.nextInt(500);
            guess++;
            if (number >= 50 && number <= 100) {
                System.out.println(number + " sayısı " + guess + ". Tahminde bulundu.");
                break;
            }
        }
    }
}