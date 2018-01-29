package springidol;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
@EnableAspectJAutoProxy
//@ComponentScan(basePackages = "springidol")
//@ImportResource(value = "context.xml")
public class SpringIdolConfig {

    @Bean
    public Performer duke() {
        return new Juggler();
    }

    @Bean
    public Performer duke15() {
        return new Juggler(15);
    }

    @Bean
    public Performer kenny() {
        Instrumentalist kenny = new Instrumentalist();
        kenny.setSong("Money Money");
        return kenny;
    }

    @Bean
    public Instrument instrument() {
        return new Saxophone();
    }

    @Bean
    public Poem poemMarshak() {
        return new PoemMarshak();
    }

    @Bean
    public Performer poeticDuke() {
        return new PoeticJuggler(poemMarshak());
    }

    @Bean
    public Audience audience() {
        return new Audience();
    }

    @Bean
    public Thinker volunteer() {
        return new Volunteer();
    }

    @Bean
    public Magician magician() {
        return new Magician();
    }

    @Bean
    public ContestantIntroducer contestantIntroducer() {
        return new ContestantIntroducer();
    }

    @Bean
    public CriticismEngineImpl criticismEngineImpl() {
        CriticismEngineImpl criticismEngineImpl = new CriticismEngineImpl();
        criticismEngineImpl.setCriticismPool(new String[] {
                "I’m not being rude, but that was appalling.",
                "You may be the least talented person in this show.",
                "Do everyone a favor and keep your day job."});
        return  criticismEngineImpl;
    }

//    @Bean
//    public JudgeAspect judgeAspect() { // Как получить аспект из AspectJ?
//        return JudgeAspect.aspectOf();
//    }

}
