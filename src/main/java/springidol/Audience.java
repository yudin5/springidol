package springidol;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {

    @Pointcut("execution(* *.perform(..))") // Определение среза
    public void performance() { // Имя. Создаем, придумываем сами. Тело метода должно быть пустым.
    }

//    @Before("performance()")
    public void takeSeats() { // Перед выступлением
        System.out.println("The audience is taking their seats.");
    }

//    @Before("performance()")
    public void turnOffCellPhones() { // Перед выступлением
        System.out.println("The audience is turning off their cellphones");
    }

//    @AfterReturning("performance()")
    public void applaud() { // После выступления
        System.out.println("CLAP CLAP CLAP CLAP CLAP");
        System.out.println();
    }

//    @AfterThrowing("performance()")
    public void demandRefund() { // После неудачного выступления
        System.out.println("Boo! We want our money back!");
    }

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("The audience is taking their seats.");
            System.out.println("The audience is turning off their cellphones");
            long start = System.currentTimeMillis(); // Перед выступлением

            joinPoint.proceed(); // Вызов целевого метода

            long end = System.currentTimeMillis(); // После выступления
            System.out.println("CLAP CLAP CLAP CLAP CLAP");
            System.out.println("The performance took " + (end - start) + " ms.");
            System.out.println();
        } catch (Throwable throwable) {
            System.out.println("Boo! We want our money back!");
        }
    }
}
