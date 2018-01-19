package springidol;

public class Vocalist implements Performer {

    private String song;

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    @Override
    public void perform() {
        System.out.println(this.getClass().getSimpleName() + " is singing : " + song);
        System.out.println();
    }
}
