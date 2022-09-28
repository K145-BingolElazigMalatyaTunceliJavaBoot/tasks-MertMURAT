import data.CalculatePrice;
import vehicle.type.HatchBack;
import vehicle.type.Sedan;
import vehicle.type.Suv;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

        System.out.print("Company or Person? : " );
        String auth = scanner.next();

        if (auth.equalsIgnoreCase("Person")) {

            System.out.println("----------------------------------------");
            System.out.println("Kiralanabilecek araç listesi aşağıdadır.");
            System.out.println("----------------------------------------");
            String hbCarName = HatchBack.hbCarName();
            String hbCarType = HatchBack.hbCarType();
            String hbModel = HatchBack.hbModel();
            String hbYear = HatchBack.hbYear();
            String hbEngineType = HatchBack.hbEngineType();
            String hbFuelType = HatchBack.hbFuelType();

            System.out.println("Araç adı: " + hbCarName);
            System.out.println("Araç adı: " + hbCarType);
            System.out.println("Araç adı: " + hbModel);
            System.out.println("Araç adı: " + hbYear);
            System.out.println("Araç adı: " + hbEngineType);
            System.out.println("Araç adı: " + hbFuelType);
            System.out.println("----------------------------------------");


            System.out.print("Kaç günlüğüne kiralamak istiyorsunuz? : ");
            int day = Integer.parseInt(scanner.next());

            String hb = HatchBack.hbYear();
            int year = Integer.valueOf(hb);
            int calculate = CalculatePrice.Price(year,day);
            System.out.println("Toplam Tutar: " + calculate);

        }else if(auth.equalsIgnoreCase("Company") ) {

            System.out.println("----------------------------------------");
            System.out.println("Kiralanabilecek araç listesi aşağıdadır.");
            System.out.println("----------------------------------------");

            String seCarName = Sedan.seCarName();
            String seCarType = Sedan.seCarType();
            String seModel = Sedan.seModel();
            String seYear = Sedan.seYear();
            String seEngineType = Sedan.seEngineType();
            String seFuelType = Sedan.seFuelType();

            String suCarName = Suv.suCarName();
            String suCarType = Suv.suCarType();
            String suModel = Suv.suModel();
            String suYear = Suv.suYear();
            String suEngineType = Suv.suEngineType();
            String suFuelType = Suv.suFuelType();

            System.out.println("----------------------------------------");
            System.out.println("Araç adı: " + seCarName);
            System.out.println("Araç adı: " + seCarType);
            System.out.println("Araç adı: " + seModel);
            System.out.println("Araç adı: " + seYear);
            System.out.println("Araç adı: " + seEngineType);
            System.out.println("Araç adı: " + seFuelType);
            System.out.println("----------------------------------------");
            System.out.println("Araç adı: " + suCarName);
            System.out.println("Araç adı: " + suCarType);
            System.out.println("Araç adı: " + suModel);
            System.out.println("Araç adı: " + suYear);
            System.out.println("Araç adı: " + suEngineType);
            System.out.println("Araç adı: " + suFuelType);
            System.out.println("----------------------------------------");
            System.out.print("Hangi aracı kiralamak istiyorsunuz?: (Fıat/Citroen) : ");
            String vehiclechoose = scanner.next();
            if(vehiclechoose.equalsIgnoreCase("Fıat")) {

                System.out.print("Kaç günlüğüne kiralamak istiyorsunuz? : ");
                int day = Integer.parseInt(scanner.next());

                String se = Sedan.seYear();
                int year = Integer.valueOf(se);
                int calculate = CalculatePrice.Price(year, day);
                System.out.println("Toplam Tutar: " + calculate);
            } else if (vehiclechoose.equalsIgnoreCase("Citroen")){

                System.out.print("Kaç günlüğüne kiralamak istiyorsunuz? : ");
                int day = Integer.parseInt(scanner.next());

                String su = Suv.suYear();
                int year = Integer.valueOf(su);
                int calculate = CalculatePrice.Price(year, day);
                System.out.println("Toplam Tutar: " + calculate);


            }


        }else{
            System.out.println("Hatalı giriş yaptınız!");
        }

        System.out.print("Kiralama işlemini onaylıyor musunuz?(Evet/Hayır) : ");
        String accept = scanner.next();

        if (accept.equalsIgnoreCase("Evet")) {
            System.out.printf("İşlem tamamlanmıştır." + "%n" + "İyi yolculuklar." + "%n");
        } else if (accept.equalsIgnoreCase("Hayır")) {
            System.out.print("Lütfen tekrar giriş yapın."+ "%n" + "İyi Günler dileriz.");
        }

    }
}
