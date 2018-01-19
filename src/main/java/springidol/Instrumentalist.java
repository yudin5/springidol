package springidol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import springidol.qualifiers.StringedInstrument;
import springidol.qualifiers.Strummed;

//import javax.inject.Inject;
//import javax.inject.Named;

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
//    @StringedInstrument
//    @Strummed
//    @Autowired(required = false)
//    @Named(value = "instrument")
    private Instrument instrument;

    public Instrument getInstrument() {
        return instrument;
    }

//    @Autowired
//    @Qualifier("stringed")
    public void setInstrument(Instrument instrument) { // Внедрение инструмента
        this.instrument = instrument;
    }

//    public void turnOffLights() {
//        System.out.println("Я устал, я ухожу! " + this.getClass().getSimpleName() + " уходит..");
//    }

    public void perform() {
        System.out.println("Выступает " + this.getClass().getSimpleName());
        System.out.print("Playing " + song + " : ");
        instrument.play();
        System.out.println();
    }
}
