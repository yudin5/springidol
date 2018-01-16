package springidol;

public class Juggler implements Performer {

    private int beanBags;

    public Juggler() {
    }

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    @Override
    public void perform() {
        System.out.println("Выступает " + this.getClass().getSimpleName());
        System.out.println("JUGGLING " + beanBags + " BEANBAGS");
    }
}
