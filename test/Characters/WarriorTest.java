package Characters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {

    @Test
    void basicAttack() {

        Warrior joueur1 = new Warrior( 10, 50 ,10,0, 0);
        Warrior joueur2 = new Warrior( 10, 50 ,10,0, 0);
        joueur1.BasicAttack(joueur2);
        assertEquals(50 - 10, joueur2.getHp());
    }

    @Test
    void specialAttack() {
        Warrior joueur1 = new Warrior( 10, 50 ,10,0, 0);
        Warrior joueur2 = new Warrior( 10, 50 ,10,0, 0);
        joueur1.SpecialAttack(joueur2);
        assertEquals(50 - 20, joueur2.getHp());
        assertEquals(50 - 5, joueur1.getHp());
    }
}