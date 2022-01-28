package org.example.dao;

import org.example.Util.HibernateUtil;
import org.hibernate.Session;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="workers")
public class Worker  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String lastName;
    private int age;


    public Worker( String name, String lastName, int age) {

        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
    public Worker() {
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "\nid         | " + id +'\n'+
                "name       | " + name + '\n' +
                "lastName   | " + lastName + '\n' +
                "age        | " + age+"\n";
    }




}


