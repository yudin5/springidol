package springidol;

import java.util.Collection;
import java.util.Map;
import java.util.Properties;

public class OneManBand implements Performer {
    public OneManBand() {
    }

//    private Collection<Instrument> instruments;

//    public void setInstruments(Collection<Instrument> instruments) { // Внедрение коллекции инструментов
//        this.instruments = instruments;
//    }


    //    @Override
//    public void perform() {
//        for (Instrument instrument : instruments) {
//            instrument.play();
//        }
//    }

//    private Map<String, Instrument> instruments;
//
//    public void setInstruments(Map<String, Instrument> instruments) {
//        this.instruments = instruments;
//    }
//
//    @Override
//    public void perform() {
//        for (String key : instruments.keySet()) {
//            System.out.println(key + " : ");
//            Instrument instrument = instruments.get(key);
//            instrument.play();
//        }
//    }
    private Properties instruments;

    public void setInstruments(Properties instruments) {
        this.instruments = instruments;
    }

    public void perform() {
        System.out.println("Выступает " + this.getClass().getSimpleName());
        for (Object key : instruments.keySet()) {
            System.out.print(key + " : ");
            String line = instruments.getProperty((String) key);
            System.out.println(line);
        }
//        System.out.println();
    }
}
