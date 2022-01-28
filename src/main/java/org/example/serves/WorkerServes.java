package org.example.serves;

import org.example.dao.Worker;

import java.util.List;

public interface WorkerServes {
    public void create();
    public void saveWorker(String name,String lastName,int age);
    List<Worker> nameAzaAndAge20(String name, int age);
    public List<Worker> update(String name,int age);
    public List<Worker>removerNameAza(String name);
    public List<Worker>getAllUser();
    public void dropTable();

}
