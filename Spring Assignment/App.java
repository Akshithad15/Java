package spring.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        GreetingService ser = (GreetingService) context.getBean("greetservice");
//        ser.printGreeting();
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        GreetingService service = context.getBean(GreetingService.class);
        service.printGreeting();
    }
}
