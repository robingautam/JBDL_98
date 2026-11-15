package annotation;

import annotation.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

       Student student = applicationContext.getBean("student", Student.class);

        System.out.println(student);
    }
}
