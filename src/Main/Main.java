package Main;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    static ArrayList<Record> personRecord = new ArrayList<>();


    public static void main(String[] args) {

        System.out.println("Enter a command. Type help for help");
        for (; ; ) {
            System.out.println("> ");

            String cmd = Asker.askString("cmd");

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
                case"remove":
                    removeRecord();
                    break;
                default:
                    System.out.println("Error: Unknown command");
            }
        }
    }

    private static void removeRecord() {
        String remove = Asker.askString("remove> ");

        Iterator<Record> removeIterator = personRecord.iterator();
        while(removeIterator.hasNext()) {
            Record nextRecord = removeIterator.next();
            if(nextRecord.contains(remove));
            personRecord.remove(nextRecord);
        }

        }





    private static void deleteRecord() {
        List();
        int removeID = Asker.askInt("enter id to delete> ");

        for(int i=0; i < personRecord.size(); i++){

            Record r = personRecord.get(i);

            if(removeID == r.getId()){
                personRecord.remove(i);

                break;

            }
        }

    }

    private static void findRecords() {
        String str = Asker.askString("Substring> ");
        for (Record r : personRecord) {
            if (r.contains(str)){
                System.out.println(r);
            }
        }


    }


    private static void createRecord() {
        String type = Asker.askString("type> ");
        switch (type) {
            case "person":
                createRecord1(new Persons());
                break;
            case "note":
                createRecord1(new Note());
                break;
            case "alarm":
                createRecord1(new Alarm());
            case "reminder":
                createRecord1(new Reminder());
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
