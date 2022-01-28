package org.example;
import org.example.serves.WorkerServes;
import org.example.serves.WorkerServesImpl;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    private final static Scanner SCANNER=new Scanner(System.in);
    private final static Scanner SCANNER1=new Scanner(System.in);
    private final static Scanner SCANNER2=new Scanner(System.in);
    private final static Scanner SCANNER3=new Scanner(System.in);
    public static void main( String[] args ) throws Exception {
        WorkerServes  worker=new WorkerServesImpl();
        while (true){
            System.out.println("1=таблица туз ");
            System.out.println("2 find name Aza and age>20");
            System.out.println("3 save worker");
            System.out.println("4 update name Aza age 18");
            System.out.println("5 delete name Aza ");
            System.out.println("6 getAllWorker");
            System.out.println("7 drop table Worker");

            int a= SCANNER1.nextInt();
            if(a<=0||a>7){
                throw new Exception("мындай тандоо жок");
            }
            switch (a){
                case 1:
                        worker.saveWorker("Aza","coco",16);
                        worker.saveWorker("Aza","tuku",26);
                        worker.saveWorker("Marat","Abdykalikov",43);
                        worker.saveWorker("Muha","coco",78);
                        worker.saveWorker("Muha","coco",78);
                        worker.saveWorker("Nuri","tiku",4);
                        worker.saveWorker("Aza","gjgj",17);

                   break;
                case 2:
                    System.out.println("name");
                    String name = SCANNER.nextLine();
                    System.out.println("age");
                    int age=SCANNER.nextInt();
                     worker.nameAzaAndAge20(name,age);
                     break;
                case 3:
                    System.out.println("name");
                    String name1=SCANNER3.nextLine();
                    System.out.println("lastName");
                    String lastName=SCANNER3.nextLine();
                    System.out.println("age");
                    int age1=SCANNER1.nextInt();
                    worker.saveWorker(name1,lastName,age1);
                    break;
                case 4:
                    System.out.println("name");
                    String name2=SCANNER2.nextLine();
                    System.out.println("age");
                    int age2=SCANNER2.nextInt();
                    worker.update(name2,age2);
                   break;
                case 5:
                    System.out.println("name");
                    String name3=SCANNER2.nextLine();
                    worker.removerNameAza(name3);
                    break;
                case 6:
                    System.out.println(worker.getAllUser());
                    break;
                case 7:
                    worker.dropTable();
                    break;
                default:
                    System.out.println();
            }
        }

    }


}
