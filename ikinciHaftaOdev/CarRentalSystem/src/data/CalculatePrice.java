package data;

public class CalculatePrice {



    public static int Price(int year, int price1) {
       int dailyprice = 0;
        if(price1 < 30) {
             dailyprice = price1 * 350;
        }else if(price1 >= 30) {
             dailyprice = price1 * 300;
        }
        int total = 0;
        int daily = 0;

        if(2022 - year == 0){
             daily = daily + (day * 40);
            
        } else if (2022 - year > 0) {
           daily = daily - (((2022 - year) * 40) * day);
        }

        total = dailyprice + daily ;


        return total;
    }
}
