package springidol;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import java.util.List;

public class SpringIdolMain {
    public static void main(String[] args) {

        /**
         * Это для контекста в XML
         */

//        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

//        Performer performer = (Performer) context.getBean("duke");
//        performer.perform();
//
//        ((Contestant) performer).receiveAward();
//
//        Contestant test = (Contestant) performer;
//        test.receiveAward();
////
//        System.out.println("Выступает kenny");
//        Performer performer2 = (Performer) context.getBean("kenny");
//        performer2.perform();

        // Работаем с БД
//        DatabaseImpl.requestDb();
//        Person person = new Person("Nassim", "Taleb", 65);
        PersonDao personDao = (PersonDao) context.getBean("personDao");
//        personDao.createPerson(person);

        System.out.println("------Listing Multiple Records--------" );
        List<Person> persons = personDao.getAllPersons();

        for (Person record : persons) {
            System.out.print("ID : " + record.getId());
            System.out.print(", Name : " + record.getName());
            System.out.print(", Surname : " + record.getSurname());
            System.out.println(", Age : " + record.getAge());
        }

//
//        Performer performer3 = (Performer) context.getBean("hank");
//        performer3.perform();
//
//        System.out.println("Выступает carl - подражатель");
//        Performer performer4 = (Performer) context.getBean("carl");
//        performer4.perform();
//
//        Performer performer5 = (Performer) context.getBean("frank");
//        performer5.perform();
//
//        Performer performer6 = (Performer) context.getBean("lora");
//        performer6.perform();
//
//        Performer performer7 = (Performer) context.getBean("klava");
//        performer7.perform();
//
//        Performer performer8 = (Performer) context.getBean("stevie");
//        performer8.perform();
//
//        Thinker volunteer = (Thinker) context.getBean("volunteer");
//        volunteer.thinkOfSomething("GG HH ZZ");

//        context.close(); // Исключительно ради целей тестирования метода выключения ламп..

        /**
         * Это для контекста в Java-конфигурации
         */
//        AnnotationConfigApplicationContext context =
//                new AnnotationConfigApplicationContext(SpringIdolConfig.class);
//
//        Performer performer = (Performer) context.getBean("duke15");
//        performer.perform();
//
//        System.out.println();
//
//        Performer performer2 = (Performer) context.getBean("poeticDuke");
//        performer2.perform();
//
//        System.out.println();
//
//        Performer performer3 = (Performer) context.getBean("kenny");
//        performer3.perform();
//
//        Thinker volunteer = (Thinker) context.getBean("volunteer");
//        volunteer.thinkOfSomething("YOU ARE NOT PREPARED");
//
//        ((Contestant) performer).receiveAward();
    }

}
