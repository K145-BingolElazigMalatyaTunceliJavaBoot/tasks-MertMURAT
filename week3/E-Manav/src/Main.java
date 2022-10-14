import entities.Apple;
import entities.Cherry;
import entities.Fruit;
import entities.Pear;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double kg;

        Fruit apple = new Apple();
        Fruit pear = new Pear();
        Fruit cherry = new Cherry();


        int appleRoom = apple.kilogram(), pearRoom = pear.kilogram(), cherryRoom = cherry.kilogram(), fruitNumber, totalPrice;

        while (true) {

            System.out.println("************************************");
            System.out.println("DEPODA BULUNAN MEYVELER ve MİKTARI");
            System.out.println("************************************");
            System.out.println("1 - " + apple.fruitName() + "  : " + appleRoom + " Kg");
            System.out.println("2 - " + pear.fruitName() + " : " + pearRoom + " Kg");
            System.out.println("3 - " + cherry.fruitName() + " : " + cherryRoom + " Kg");
            System.out.println("************************************");

            System.out.print("Lütfen satın alacağınız meyveyi seçiniz : ");
            fruitNumber = scanner.nextInt();

            switch (fruitNumber) {

                case 1:
                    System.out.print("Lütfen miktar giriniz(Kg) : ");
                    kg = scanner.nextInt();

                    if (kg <= apple.kilogram()) {
                        totalPrice = (int) (kg * apple.price());
                        System.out.println("Toplam tutar : " + totalPrice + " TL\n");
                        appleRoom -= kg;

                    if (appleRoom < 0) {
                        System.out.println("Tükendi.");
                    }
                    } else {
                        System.out.println("Girilen miktar depoda bulunmamaktadır.");
                    }

                    break;

                case 2:

                    System.out.print("Lütfen miktar giriniz(Kg) : ");
                    kg = scanner.nextInt();

                    if (kg <= pear.kilogram()) {
                        totalPrice = (int) (kg * pear.price());
                        System.out.println("Toplam tutar : " + totalPrice + " TL\n");
                        pearRoom -= kg;

                        if (pearRoom < 0) {
                            System.out.println("Tükendi.");
                        }
                    } else {
                        System.out.println("Girilen miktar depoda bulunmamaktadır.");
                    }

                    break;

                case 3:

                    System.out.print("Lütfen miktar giriniz(Kg) : ");
                    kg = scanner.nextInt();

                    if (kg <= cherry.kilogram()) {
                        totalPrice = (int) (kg * cherry.price());
                        System.out.print("Toplam tutar : " + totalPrice + " TL\n");
                        cherryRoom -= kg;

                        if (cherryRoom < 0) {
                            System.out.println("Tükendi.");
                        }
                    } else {
                        System.out.println("Girilen miktar depoda bulunmamaktadır.");
                    }

                    break;
            }

            System.out.print("İşlemi sonlandırmak için -E- tuşa basınız.\nAlışverişe devam etmek için -C- tuşuna basınız.");
            String exit = scanner.next();

            if (exit.equalsIgnoreCase("E")) {
                break;
            } else if (exit.equalsIgnoreCase("C")) {
            }
        }
        System.out.println("İyi günler.");
    }
}