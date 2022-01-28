package org.example.serves;

import org.example.dao.Worker;
import org.example.dao.WorkerDaoImpl;
import org.example.dao.WorksDao;

import java.util.List;

public class WorkerServesImpl  implements WorkerServes{
  WorksDao works=new WorkerDaoImpl();

  @Override
  public void create() {
    works.create();
  }

  @Override
    public void saveWorker(String name, String lastName, int age) {
        works.saveWorker(name,lastName,age);
    }

    @Override
    public List<Worker> nameAzaAndAge20(String name, int age) {
        return works.nameAzaAndAge20(name,age);
    }


    @Override
    public List<Worker> update(String name, int age) {
      return works.update(name,age);
    }

    @Override
    public List<Worker> removerNameAza(String name) {
     return works.removerNameAza(name);
    }

  @Override
  public List<Worker> getAllUser() {
    return works.getAllUser();
  }

  @Override
    public void dropTable() {
        works.dropTable();
    }
}
