package springidol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Configurable("pianist")
//@Component("eddie")
public class Instrumentalist implements Performer {
    public Instrumentalist() {
    }

    private String song;

    public String getSong() {
        return song;
    }

    public void setSong(String song) { // Внедрение мелодии
        this.song = song;
    }

//    @Autowired
//    @Autowired(required = false)
//    @Named(value = "instrument")
    private Instrument instrument;

    public Instrument getInstrument() {
        return instrument;
    }

    @Autowired
//    @Qualifier("stringed")
    public void setInstrument(Instrument instrument) { // Внедрение инструмента
        this.instrument = instrument;
    }

    public void perform() {
        System.out.println("Выступает " + this.getClass().getSimpleName());
        System.out.print("Playing " + song + " : ");
        instrument.play();
        System.out.println();
    }
}
