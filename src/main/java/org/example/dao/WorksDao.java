package org.example.dao;

import java.util.List;

public interface WorksDao {
        public void create();
        public void saveWorker(String name,String lastName,int age);
        public List<Worker> nameAzaAndAge20(String name, int age);
        public List<Worker> update(String name,int age);
        public List<Worker> removerNameAza(String name);
        public void dropTable();
        public List<Worker>getAllUser();

}
