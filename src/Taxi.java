import java.util.ArrayList;
import java.util.List;

public class Taxi {

    private int id;
    private int earnings;
    private char currPos;
    private int freeTime;
    List<Booking> bookingList;

    public Taxi(int i){
        id=i;
        earnings=0;
        currPos='A';
        freeTime=0;
        bookingList=new ArrayList<>();
    }
    public int getId() { return id; }
    public int getCurrPos() { return (int) currPos; }
    public int getEarnings() {return earnings;}

    public void setFreeTime(int freeTime)
    {
        this.freeTime=freeTime;
    }
    public  void setCurrPos(char newPos)
    {
        currPos=newPos;
    }
    public void  setEarnings(int newEarnings)
    {
        earnings+=newEarnings;
    }

    public boolean isFree(int pickTime)
    {
        return pickTime >= freeTime;
    }

    public void addBookings(Booking booking)
    {
        bookingList.add(booking);
    }

    public int totalEarnings(Taxi taxi)
    {
        int sum=0;
        for(Booking booking:taxi.bookingList)
        {
            sum+=booking.getAmount();
        }
        return sum;
    }
}
