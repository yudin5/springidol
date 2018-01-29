package springidol;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Magician implements MindReader {

    private String thoughts;

    // Объявление параметризованного среза множества точек сопряжения
    @Pointcut("execution(* springidol."
    + "Thinker.thinkOfSomething(String)) && args(thoughts)")
    public void thinking(String thoughts) {
    }

    @Override
    @Before("thinking(thoughts)") // Передача параметров в совет
    public void interceptThoughts(String thoughts) {
        System.out.println("Intercepting volunteers's thoughts...");
        System.out.println("The volunteer is thinking about: " + thoughts);
        this.thoughts = thoughts;
    }

    @Override
    public String getThoughts() {
        return thoughts;
    }
}
