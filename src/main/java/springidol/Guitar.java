package springidol;

import org.springframework.stereotype.Component;
import springidol.qualifiers.StringedInstrument;
import springidol.qualifiers.Strummed;

//@StringedInstrument
//@Strummed
//@Component
public class Guitar implements Instrument {

    public void play() {
        System.out.println("STRUM STRUM STRUM (guitar)");
    }
}
