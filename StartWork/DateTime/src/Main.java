import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
// C:\"Program Files"\Java\jdk-22\bin\java -jar out/DateTime.jar
// чтобы запустить в терминале
public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss MM/dd/yyyy");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(formatter));
    }
}