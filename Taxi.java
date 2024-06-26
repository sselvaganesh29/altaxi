public class Taxi
{
    private int taxi_no;
    private String taxi_name;
    private boolean available;

    public Taxi(int taxi_no,String taxi_name,boolean available)
    {
        this.taxi_no = taxi_no;
        this.taxi_name = taxi_name;
        this.available = available;
    }

    public int getTaxi_no()
    {
        return taxi_no;
    }


    public String getTaxi_name()
    {
        return taxi_name;
    }

    public boolean isAvailable()
    {
        return available;
    }

    public void setTaxi_no(int taxi_no)
    {
        this.taxi_no = taxi_no;
    }

    public void setTaxi_name(String taxi_name)
    {
        this.taxi_name = taxi_name;
    }

    public void setAvailable(boolean available)
    {
        this.available = available;
    }

}
