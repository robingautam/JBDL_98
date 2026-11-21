package org.gfg.SpringBoot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value("1")
    int id;
    @Value("Robin")
    String name;
    @Value("robin@gmail.com")
    String email;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
