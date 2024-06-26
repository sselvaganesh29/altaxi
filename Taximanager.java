import java.util.ArrayList;

public class Taximanager
{
    private ArrayList<Taxi> taxilist;


    public void add_taxi(Taxi taxi)
    {
        taxilist.add(taxi);
    }

    public void update_taxi(int taxi_no, String newtaxi_name, boolean newavailable)
    {
        for (Taxi taxi : taxilist)
        {
            if (taxi.getTaxi_no() == taxi_no)
            {
                taxi.setTaxi_name(newtaxi_name);
                taxi.setAvailable(newavailable);
            }
        }
    }

    public void delete_taxi(int taxi_no)
    {
        taxilist.removeIf(taxi -> taxi.getTaxi_no() == taxi_no);
    }

    public Taxi taxi_detail(int taxi_no)
    {
        for (Taxi taxi : taxilist)
        {
            if (taxi.getTaxi_no() == taxi_no)
            {
                return taxi;
            }
        }
                return null;
    }


}
