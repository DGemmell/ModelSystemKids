import org.junit.Before;

public class ElizabethTest {

    Elizabeth elizabeth;
    Dance dance;

    @Before
    public void before(){
        dance = new Dance();
        elizabeth = new Elizabeth("gemmell","8 Brenfield Drive", 2, "Let it Go");

    }
}
