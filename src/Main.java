// імпортування класу Date зі стандартного пакету java.util
import java.time.LocalDate;

public class Main {
    public static void main(String[] S) {
        System.out.println("Hello, Java!");
        LocalDate d = LocalDate.now();
        System.out.println("Date: "+d);
    }
}