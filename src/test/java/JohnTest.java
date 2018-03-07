import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JohnTest {
    
    John john;
    Joseph joseph;
    Elizabeth elizabeth;
    
    @Before
    public void before(){
        john = new John("gemmell","8 Brenfield Drive", 5, "Trains");
        
    }
    

    @Test
    public void getSurname() {
        assertEquals("gemmell", john.getSurname());
    }

    @Test
    public void getAddress() {
        assertEquals("8 Brenfield Drive", john.getAddress());
    }

    @Test
    public void getPocketMoney() {
        assertEquals(5, john.getPocketMoney(), 0.01);
    }
    
    @Test
    public void getFavouriteToy(){
        assertEquals("Trains", john.getFavouriteToy() );
    }

}
