package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static final Scanner scan = new Scanner(System.in);
    static ArrayList<Record> personRecord = new ArrayList<>();


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
                case "create":
                    createRecord();
                    break;
                case "list":
                    List();
                    break;
                case "note":
                    Note();
                    break;
                default:
                    System.out.println("Error: Unknown command");
            }
        }
    }

    private static void createRecord() {
        System.out.println("type> ");
        String type = scan.next();
        switch (type) {
            case "person":
                createPerson();
                break;
            default:
                System.out.println("Unknown record type");
        }
    }

    private static void createPerson() {


        Persons p = new Persons();
        p.askInfo();



        personRecord.add(p);


    }

    private static void Note(){
        Note n = new Note();
        n.Asktext();
        personRecord.add(n);


    }

    private static void List() {
        for (Record p : personRecord) {
            //          System.out.printf("%d %s %s %s\n",
            //                  p.getId(),
            //                  p.getName(),
            //                 p.getSurname(),
            //           p.getPhone());
            System.out.println(p);



        }


    }

    private static void showHelp() {
        System.out.println("Hello world");


    }




        }
