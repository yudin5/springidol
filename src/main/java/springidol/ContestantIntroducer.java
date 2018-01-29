package springidol;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class ContestantIntroducer {

    @DeclareParents(  // Внедрение интерфейса Contestant
            value = "springidol.Performer+",
            defaultImpl = GraciousContestant.class)

    public static Contestant contestant;

}
