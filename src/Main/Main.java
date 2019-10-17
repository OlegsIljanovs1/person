package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Persons> personRecord = new ArrayList<>();


    public static void main(String[] args) {
        System.out.println("Enter a command. Type help for help");
        for (; ; ) {
            System.out.println("> ");

            String cmd = scan.next();

            switch (cmd) {
                case "exit":
                    System.out.println("Goodbye");
                    return;
                case "help":
                    showHelp();
                    break;
                case"create":
                    createRecord();
                    break;
                case"list":
                    List();
                    break;
                default:
                    System.out.println("Error: Unknown command");
            }
        }
    }

    private static void createRecord() {
        System.out.println("type> ");
        String type = scan.next();
        switch(type){
            case "person":
                createPerson();
                break;
            default:
                System.out.println("Unknown record type");
        }
    }

    private static void createPerson() {
        System.out.print("Name> ");
        String name = scan.next();
        System.out.print("Surname> ");
        String surname = scan.next();
        System.out.println("Phone> ");
        String phone = scan.next();

        Persons p = new Persons();
        p.setName(name);
        p.setSurname(surname);
        p.setPhone(phone);


        personRecord.add(p);



    }

    private static void List(){
        for(Persons p : personRecord){
            System.out.printf("%d %s %s %s\n",
                    p.getId(),
                    p.getName(),
                    p.getSurname(),
                    p.getPhone());
        }

    }

    private static void showHelp() {
        System.out.println("Hello world");


    }

}