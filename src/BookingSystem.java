import java.util.ArrayList;
import java.util.List;

public class BookingSystem {
    static int bookingId=1;
    List<Taxi> taxis;

    BookingSystem(int numOfTaxis)
    {
        taxis = new ArrayList<>();
        for(int i=1;i<=numOfTaxis;i++)
        {
            taxis.add(new Taxi(i));
        }
    }

    public  void bookTaxi(int custId,char pickUp, char drop, int pickTime)
    {
        Taxi selected = null;
        for(Taxi taxi:taxis)
        {
            if(taxi.isFree(pickTime))
            {
                if(selected==null){
                    selected=taxi;
                    continue;
                }
                int distance = Math.abs(pickUp-taxi.getCurrPos());
                int selectedDistance = Math.abs(pickUp-selected.getCurrPos());

                if(distance==selectedDistance)
                {
                    if(taxi.getEarnings()<selected.getEarnings())
                    {
                        selected=taxi;
                    }
                }
                else if(distance<selectedDistance)
                {
                    selected=taxi;
                }

            }
        }
        if(selected==null)
        {
            System.out.println("No taxi allotted booking cancelled ");
        }
        else
        {
            selected.setFreeTime(pickTime+(Math.abs(pickUp-drop)));
            selected.setCurrPos(drop);
            selected.setEarnings(calculateAmount(Math.abs(drop-pickUp)*15));
            System.out.println("Taxi can be allotted");
            System.out.println("Taxi-"+selected.getId()+" is allotted");
            selected.addBookings(new Booking(bookingId++,custId,pickUp,drop,pickTime,(pickTime+(Math.abs(pickUp-drop))),calculateAmount(Math.abs(drop-pickUp)*15)));
        }
    }

    public int calculateAmount(int dist)
    {
        int amt=0;
        if(dist>=5)
        {
            amt+=100;
            dist-=5;

        }

        amt+=dist*10;
        return amt;
    }

}
