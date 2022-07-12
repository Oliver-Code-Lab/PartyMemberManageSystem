import java.text.SimpleDateFormat;
import java.util.Date;

public class test1 {

    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd");
        Date date = new Date();
        String format = simpleDateFormat.format(date);
        System.out.println(format);
    }
}
