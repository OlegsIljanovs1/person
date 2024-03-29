package Main;

import java.time.LocalTime;

public class Alarm extends Note {
    public LocalTime time;

    @Override
    public void askInfo() {
        super.askInfo();
        time = Asker.askTime("time> ");
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + getId() +
                ", text='" + getText() + '\'' +
                ", time=" + time.format(Asker.TIME_FORMAT) +
                '}';
    }
@Override
    public boolean contains(String str) {
        return super.contains(str)
                || time.format(Asker.TIME_FORMAT).contains(str);
        }

    }