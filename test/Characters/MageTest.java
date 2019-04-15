package Characters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MageTest {

    @Test
    void basicAttack() {
        Mage joueur1 = new Mage( 10, 50 ,0,0, 10);
        Mage joueur2 = new Mage( 10, 50 ,0,0, 10);
        joueur1.BasicAttack(joueur2);
        assertEquals(50 - 10, joueur2.getHp());
    }

    @Test
    void specialAttack() {
        Mage joueur1 = new Mage( 10, 50 ,0,0, 10);
        Mage joueur2 = new Mage( 10, 50 ,0,0, 10);
        joueur1.BasicAttack(joueur1);
        joueur1.BasicAttack(joueur1);
        joueur1.SpecialAttack(joueur2);
        assertEquals(50 - 20 + 20, joueur1.hp);
    }
}