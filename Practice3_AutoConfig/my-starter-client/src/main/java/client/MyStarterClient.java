package client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import lib.MyLibClass;

@SpringBootApplication
public class MyStarterClient {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(MyStarterClient.class, args);
        MyLibClass myLibraryClassByClass = applicationContext.getClass(MyLibClass.class.getName());
        myLibraryClassByClass.print();
        MyLibClass myLibraryClass = (MyLibClass)applicationContext.getBean("lib.MyLibClass");
        myLibraryClass.print();
    }
}
