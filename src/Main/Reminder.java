package Main;

import Main.Alarm;
import Main.Main;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Reminder extends Alarm {
    public static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd.MM.uuuu");
    private LocalDate date;

    @Override
    public void askInfo() {
        super.askInfo();
        System.out.println("Date> ");
        String  strDate = Main.scan.next();
        date = LocalDate.parse(strDate, DATE_FORMAT);
    }


    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate time) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + getId() +
                ", text='" + getText() + '\'' +
                ", time=" + time.format(TIME_FORMAT) +
                ", date=" + date.format(DATE_FORMAT) +
                '}';
    }
    @Override
    public boolean contains(String str) {
        return super.contains(str)
                || date.format(DATE_FORMAT).contains(str);
    }

}