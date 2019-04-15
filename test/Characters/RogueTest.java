package Characters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RogueTest {

    @Test
    void basicAttack() {
        Rogue joueur1 = new Rogue( 10, 50 ,0,10, 0);
        Rogue joueur2 = new Rogue( 10, 50 ,0,10, 0);
        joueur1.BasicAttack(joueur2);
        assertEquals(50 - 10, joueur2.getHp());
    }

    @Test
    void specialAttack() {
        Rogue joueur1 = new Rogue( 10, 50 ,0,10, 0);
        Rogue joueur2 = new Rogue( 10, 50 ,0,10, 0);
        joueur1.SpecialAttack(joueur2);
        assertEquals(10+(10/2), joueur1.getAgi());
    }
}