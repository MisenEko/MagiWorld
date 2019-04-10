import Characters.CharCreate;
import Characters.Mage;
import Characters.Rogue;
import Characters.Warrior;

import java.util.Scanner;

public class Game {

    int job;
    Scanner sc = new Scanner(System.in);



    public Game() {
        CharCreate player1 = new CharCreate(1);
        CharCreate player2 = new CharCreate(2);


        /**
         * initializing the first character.
         */
        System.out.println("Choisissez votre classe : (1. Guerrier, 2. Rodêur, 3 mage)");
        job=sc.nextInt();
        if (job==1){
            player1 = new Warrior(1);
        } else if(job==2) {
            player1 = new Rogue(1);
        } else if (job==3){
            player1 = new Mage(1);
        }

        /**
         * initializing the second character.
         */
        System.out.println("Choisissez votre classe : (1. Guerrier, 2. Rodêur, 3 mage)");
        job=sc.nextInt();
        if (job==1){
            player2 = new Warrior(2);
        } else if(job==2) {
            player2 = new Rogue(2);
        } else if (job==3){
            player2 = new Mage(2);
        }


        player1.SpecialAttack(player2);

        System.out.println("HP player 1 après un spécial :"+player1.getHp());

        player2.SpecialAttack(player1);

        System.out.println("HP player 2 après son soin "+player2.getHp());

    }


}
