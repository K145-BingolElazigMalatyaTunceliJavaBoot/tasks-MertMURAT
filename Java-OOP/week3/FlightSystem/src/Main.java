import Flight.Pegasus;
import Flight.Thy;
import Flight.SeatControl;
import Flight.SeatService;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Thy thy = new Thy();
        Pegasus pegasus = new Pegasus();
        SeatService seatService = new SeatService();
        List<String> seats = seatService.getSeats();


        System.out.println("Pegasus or Thy: ");
        System.out.println("If you choose Thy press 1");
        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();


        if (sayi == 1) {
            thy.setName("THY");
            System.out.println(thy.getName());
            thy.abroadCatering();
            for (String seat : seats) {
                System.out.println(seat + " ");
            }

            int tPrice = 10;
            System.out.println(thy.ticketPrice(true));


        } else {
            pegasus.setName("Pegasus");
            pegasus.domesticCatering();
            for (String seat : seats) {
                System.out.println(seat + " ");
            }
            int price = 0;
            System.out.println(thy.ticketPrice(false));

        }
    }
}