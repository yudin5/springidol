package springidol;

public class Volunteer implements Thinker {

    private String thoughts;

    @Override
    public void thinkOfSomething(String thoughts) {
        this.thoughts = thoughts;
        System.out.println("Thinker is thinking about: " + thoughts);
    }

    public String getThoughts() {
        return thoughts;
    }
}
