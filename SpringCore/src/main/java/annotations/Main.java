package annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotationconfig.xml");

        Chef chef = applicationContext.getBean("chef", Chef.class);

        System.out.println(chef);

    }
}
