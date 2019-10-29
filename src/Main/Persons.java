package Main;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Iterator;

public class Persons extends Record {
    private static int counter = 0;

    private int id;
    private String name;
    private String surname;
    private String phone;
    private String email;

    public Persons() {
        counter++;
        this.id = counter;
    }


    @Override
    public void askInfo() {
        name = Asker.askString("Name> ");
        surname = Asker.askString("Surname> ");
        phone = Asker.askString("phone> ");
        email = Asker.askString("email> ");


    }

    @Override
   public boolean contains(String str) {
        return super.contains(str)
                ||name.contains(str)
                || surname.contains(str)
                || phone.contains(str)
                || email.contains(str);
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "id=" + getId() +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    String word = toString();

}


