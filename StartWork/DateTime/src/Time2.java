import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time2 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm dd:MM:yy");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(formatter.format(now));
    }
}