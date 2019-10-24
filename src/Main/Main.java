package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static final Scanner scan = new Scanner(System.in);
    static ArrayList<Record> personRecord = new ArrayList<>();


    public static void main(String[] args) {
        scan.useDelimiter("\n");
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
                case "search":
                    findRecords();
                    break;
                case"delete":
                    deleteRecord();
                    break;
                default:
                    System.out.println("Error: Unknown command");
            }
        }
    }

    private static void deleteRecord() {
        List();
        System.out.print("\nEnter id to delete> ");
        int removeID = scan.nextInt();

        for(int i=0; i < personRecord.size(); i++){

            Record r = personRecord.get(i);

            if(removeID == r.getId()){
                personRecord.remove(i);

                break;

            }
        }

    }

    private static void findRecords() {
        System.out.print("substring> ");
        String str = scan.next();
        for (Record r : personRecord) {
            if (r.contains(str)){
                System.out.println(r);
            }
        }


    }


    private static void createRecord() {
        System.out.println("type> ");
        String type = scan.next();
        switch (type) {
            case "person":
                createRecord1(new Persons());
                break;
            case "note":
                createRecord1(new Note());
                break;
            case "alarm":
                createRecord1(new Alarm());
                break;


            default:
                System.out.println("Unknown record type");
        }
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
    private static void createRecord1(Record r){
        r.askInfo();
        personRecord.add(r);


    }



        }
