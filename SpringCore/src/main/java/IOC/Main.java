package IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
      //  Person person = new Person(); I will ask IOC to create the object and provide the object

        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");

       Person person = applicationContext.getBean("personalias",Person.class);

        System.out.println(person);

//        Person person2 = applicationContext.getBean("personalias",Person.class);
//
//
//        System.out.println(person.hashCode());
//
//        System.out.println(person2.hashCode());
//
//        applicationContext.close(); // it will close the IOC Container

//       Student student = applicationContext.getBean("student",Student.class);
//
//        System.out.println(student);
//
//
//      Human human =  applicationContext.getBean("human",Human.class);
//
//        System.out.println(human);
    }
}
