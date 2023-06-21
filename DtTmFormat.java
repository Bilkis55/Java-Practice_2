import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DtTmFormat {
    public static void main(String[]args)
    {
        LocalDateTime myDateobj=LocalDateTime.now();
        System.out.println("Before formatting :" +myDateobj);
        DateTimeFormatter myFormatobj=DateTimeFormatter.ofPattern("dd-mm-yyyy hh:mm:ss");
        String formattedDate=myDateobj.format(myFormatobj);
        System.out.println("After formatting :" + formattedDate);
    }
    
}
