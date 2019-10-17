package Main;

public class Note extends Record{
    private String text;


    public void Asktext(){
        System.out.println("Text> ");
        text = Main.scan.next();
    }



    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
