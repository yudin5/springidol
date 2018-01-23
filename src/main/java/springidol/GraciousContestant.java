package springidol;

public class GraciousContestant implements Contestant {
    @Override
    public void receiveAward() {
        System.out.println("Award is earned! <<<======== Внедрённый функционал");
        System.out.println();
    }
}
