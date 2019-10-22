package Main;

public class Alarm extends Note {
    private String time;

    @Override
    public void askInfo() {
        super.askInfo();
        System.out.println("Time> ");
        time = Main.scan.next();
    }


    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + getId() +
                ", text='" + getText() + '\'' +
                ", time=" + getTime() +
                '}';
    }

    boolean contains(String str) {
        return super.contains(str);
        }

    }