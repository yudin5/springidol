package springidol;

public class Magician implements MindReader {

    private String thoughts;

    @Override
    public void interceptThoughts(String thoughts) {
        System.out.println("Intercepting volunteers's thoughts...");
        System.out.println("The volunteer is thinking about: " + thoughts);
        this.thoughts = thoughts;
    }

    @Override
    public String getThoughts() {
        return thoughts;
    }
}
