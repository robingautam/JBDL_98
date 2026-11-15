package annotation;

import annotation.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // marks as a config file for IOC container, similar to xml file
//@ComponentScan(basePackages = "annotation.model")
public class Config {


    @Bean("student")
    public Student createStudentObject(){
        Student student = new Student();
        student.setEmail("aakash@gmail.com");
        student.setId(2);
        student.setName("Aakash");
        return student;
    }

}
