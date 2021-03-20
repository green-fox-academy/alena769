package Pirates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PirateTest {


    @Test
    void drinkSomeRum() {
        Pirate pirate1 = new Pirate("Jimmy", true);
        pirate1.drinkSomeRum();
        pirate1.drinkSomeRum();
        pirate1.drinkSomeRum();
        pirate1.drinkSomeRum();
        assertEquals(4, pirate1.getRumLevel());
    }

    @Test
    void howsItGoingMate() {
        Pirate pirate1 = new Pirate("Jimmy", true);
        pirate1.drinkSomeRum();
        pirate1.drinkSomeRum();
        pirate1.drinkSomeRum();
        pirate1.drinkSomeRum();
        pirate1.howsItGoingMate();
        assertEquals(0,pirate1.getRumLevel());
    }

}