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
}
