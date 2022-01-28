package org.example.dao;

import org.example.Util.HibernateUtil;
import org.hibernate.Session;
import org.postgresql.core.Query;

import javax.xml.namespace.QName;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WorkerDaoImpl implements WorksDao{
    @Override
    public void create() {
        try {
            Session session = HibernateUtil.getSession().openSession();
            session.beginTransaction();
            session.createSQLQuery("CREATE TABLE IF NOT EXISTS users " +
                    "(id serial Primary key," +
                    "name VARCHAR not null," +
                    "lastName VARCHAR NOT NULL, " +
                    "age int not null );").addEntity(Worker.class).executeUpdate();
            session.getTransaction().commit();
            session.close();
            System.out.println("ok");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void saveWorker(String name,String lastName,int age) {
        try {
            Session session = HibernateUtil.getSession().openSession();
            session.beginTransaction();
            Worker worker = new Worker();
            worker.setName(name);
            worker.setLastName(lastName);
            worker.setAge(age);
            session.save(worker);
            System.out.println("ok" + worker);
            session.getTransaction().commit();
            session.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    @Override
    public List<Worker> nameAzaAndAge20(String name, int age1) {

        Session session = HibernateUtil.getSession().openSession();
        session.beginTransaction();
        List<Worker>workerList=session.createQuery("from Worker").list();
        workerList.stream().filter(worker -> worker.getName()
                .equals(name)&&worker.getAge()>age1).forEach(System.out::println);
        session.getTransaction().commit();
        session.close();
        System.out.println("find name Aza and age>20");
        return workerList;
    }

    @Override
    public List<Worker> update(String name, int age) {
            Session session = HibernateUtil.getSession().openSession();
            session.beginTransaction();
            List<Worker>list=session.createQuery("from Worker").list();
             List<Worker>list1=list.stream().filter(worker -> worker.getName().equals(name)).collect(Collectors.toList());
             list1.stream().forEach(worker -> worker.setAge(age));
            session.getTransaction().commit();
            session.close();
        System.out.println(list1);
            System.out.println("update");
      return list1;
    }

    @Override
    public List<Worker>  removerNameAza(String name) {


            Session session = HibernateUtil.getSession().openSession();
            session.beginTransaction();
        List<Worker>workerList=session.createQuery("from Worker").list();
             workerList.removeIf(worker -> worker.getName().equals(name));
        System.out.println(workerList);
        System.out.println( name+ "очурулду ");
            session.getTransaction().commit();
            session.close();
return   workerList;
    }

    @Override
    public void dropTable() {
        try {
            Session session =HibernateUtil.getSession().openSession();
            session.beginTransaction();
            session.createSQLQuery("  drop table workers");
            session.getTransaction().commit();
            session.close();

            System.out.println("drop table successfully");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    @Override
    public List<Worker> getAllUser() {
        Session session=HibernateUtil.getSession().openSession();
        session.beginTransaction();
        List<Worker>list=session.createQuery("from Worker").list();
        session.getTransaction().commit();
        session.close();
        return list;
    }


}

