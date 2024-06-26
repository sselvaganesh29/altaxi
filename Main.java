//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Taximanager taximanager = new Taximanager();

        Taxi taxi_1 = new Taxi(365, "veghar", false);
        Taxi taxi_2 = new Taxi(370, "caraxes", true);
        Taxi taxi_3 = new Taxi(380, "vermithor", true);

        taximanager.add_taxi(taxi_1);
        taximanager.add_taxi(taxi_2);
        taximanager.add_taxi(taxi_3);

        taximanager.update_taxi(370,"caraxes",false);

        taximanager.delete_taxi(365);

        Taxi taxidetail = taximanager.taxi_detail(380);
        System.out.println("Taxi details for this taxi no:"+ taxidetail);

    }

}