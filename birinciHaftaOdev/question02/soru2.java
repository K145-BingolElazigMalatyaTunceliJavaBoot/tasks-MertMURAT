
/**
 * 3 ile 100 arasında asal sayıların toplamını bulan program.
 */

package question02;

public class soru2 {
    public static void main(String[] args) {

                int toplam = 0;
                for (int i = 3; i <= 100; i++) {
                    boolean Kontrol = true;
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0) {
                            Kontrol = false;
                            break;
                        }
                    }
                    if (Kontrol) {
                        toplam += i;
                    }
            }
                System.out.println(toplam);
            }
        }



