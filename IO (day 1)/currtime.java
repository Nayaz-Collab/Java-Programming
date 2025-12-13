//print current time in the format HH:MM:SS
import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class currtime 
{
    public static void main(String[] args)
    {
        //getting current time
        LocalTime currenTime=LocalTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("hh:mm:ss");
        String formatted=currenTime.format(formatter);
        System.out.println(formatted);
    }
}
