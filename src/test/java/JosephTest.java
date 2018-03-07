import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JosephTest {

    Joseph joseph;
    Football footballGame;
    Swim swim;
    Basketball basketball;


    @Before
    public void before(){
        footballGame = new Football();
        swim = new Swim();
        basketball = new Basketball();
        joseph = new Joseph("gemmell","8 Brenfield Drive", 5, "Ibrahim");

    }

    @Test
    public void getFavouriteFriend(){
        assertEquals("Ibrahim", joseph.getFavouriteFriend() );
    }

    @Test
    public void canCountActivities(){
        joseph.addSport(footballGame);
        joseph.addSport(swim);
        assertEquals(2, joseph.activityCount());
    }

    @Test
    public void canAddAnActivity(){
        joseph.addSport(basketball);
        assertEquals(1, joseph.activityCount());
    }




}
