package ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JungleMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotationconfig.xml");

       Jungle jungle = applicationContext.getBean("jungle",Jungle.class);

        System.out.println(jungle);


    }
}
