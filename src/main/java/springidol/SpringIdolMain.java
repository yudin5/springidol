package springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIdolMain {
    public static void main(String[] args) {
        //ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        Performer performer = (Performer) context.getBean("duke");
        performer.perform();

        Performer performer2 = (Performer) context.getBean("kenny");
        performer2.perform();

        Performer performer3 = (Performer) context.getBean("hank");
        performer3.perform();

        Performer performer4 = (Performer) context.getBean("carl");
        performer4.perform();

        Performer performer5 = (Performer) context.getBean("frank");
        performer5.perform();

        Performer performer6 = (Performer) context.getBean("lora");
        performer6.perform();

        context.close(); // Исключительно ради целей тестирования метода выключения ламп..
    }
}
