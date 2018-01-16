package springidol;

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

    private Instrument instrument;

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) { // Внедрение инструмента
        this.instrument = instrument;
    }

    public void turnOffLights() {
        System.out.println("Я устал, я ухожу! " + this.getClass().getSimpleName() + " уходит..");
    }

    @Override
    public void perform() {
        System.out.println("Выступает " + this.getClass().getSimpleName());
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }
}
