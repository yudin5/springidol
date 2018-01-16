package springidol;

public class PoemMarshak implements Poem {

    private static String[] LINES = {
            "Тра-та-та, тра-та-та, мы везём с собой кота",
            "Чижика, собаку, петьку - забияку,",
            "Обезьяну, попугая, вот - компания какая!",
            "Вот - компания какая!"
    };

    @Override
    public void recite() {
        for (String line : LINES) {
            System.out.println(line);
        }
    }
}
