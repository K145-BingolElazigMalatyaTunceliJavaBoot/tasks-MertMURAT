
/*
 * Okul puanlarının harf karşılığını yazan program.
 * Random alınabilir değerler.
 * 0 - 35 arası FF
 * 35 - 50 arası DC
 * 50 - 70 arası BB
 * 70 - 100 arası AA
 */
package question01;

import java.util.Random;

public class soru1 {
    public static void main(String[] args) {

        //int puan = (int) (Math.random() * 100 + 1); //Bu metod da random sayı üretmek için kullanılabilir.
        Random random = new Random();
        int puan = random.nextInt(100);


        if (puan > 0 && puan < 35) {

            System.out.println(puan + " " + "Puanın harf karşılığı: FF");

        } else if (puan >= 35 && puan <= 50) {

            System.out.println(puan + " " + "Puanın harf karşılığı: DC");

        } else if (puan >= 50 && puan <= 70) {

            System.out.println(puan + " " + "Puanın harf karşılığı: BB");

        } else if (puan >= 70 && puan <= 100) {

            System.out.println(puan + " " + "Puanın harf karşılığı: AA");

        }
    }
}
