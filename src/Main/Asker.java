package Main;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Asker {
    public static final DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm");
    public static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd.MM.yyyy");


    private static final Scanner scan = new Scanner(System.in);

    static {
        scan.useDelimiter("\n");
    }

    public static String askString(String msg) {
        System.out.println(msg + "> ");
        return scan.next();
    }


    public static LocalDate askDate(String msg) {
        while (true) {
            try {
                System.out.println(msg + "> ");
                String answer = scan.next();
                return LocalDate.parse(answer, DATE_FORMAT);
            } catch (DateTimeParseException e) {
                System.out.println("Required_format: " + DATE_FORMAT);
            }
        }
    }

    public static LocalTime askTime(String msg) {
        while (true) {
            try {
                System.out.println(msg + "> ");
                String answer = scan.next();
                return LocalTime.parse(answer, TIME_FORMAT);
            } catch (DateTimeParseException e) {
                System.out.println("Required_format: " + TIME_FORMAT);
            }
        }
    }

    public static int askInt(String msg) {
        while (true) {
            try {
                System.out.println(msg + "> ");
                String answer = scan.next();
                return Integer.parseInt(answer);
            } catch (NumberFormatException e) {
                System.out.println("Not a number");
            }
        }
    }
}