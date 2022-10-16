package Flight;

import java.util.ArrayList;
import java.util.List;

public class SeatService extends FlightC{

    public void seatService(){
        seatS();
    }

    public void seatS(){
        List<String> seats= new ArrayList<>();
        String[] seatLetter={"A","B","C","D","E","F"};
        for(int i=0;i<seatLetter.length;i++){
            seats.add("1"+seatLetter[i]);
            seats.add("1"+seatLetter[i]);

        }
        for(int i=1;i<=30;i++){
            for(int j=0;j<seatLetter.length;j++){
                seats.add(seatLetter[j]+""+i);
            }
        }
        setSeats(seats);

    }

}
