import Characters.CharCreate;
import Characters.Mage;
import Characters.Rogue;
import Characters.Warrior;

import java.util.Scanner;

public class Game {

    int job;
    Scanner sc = new Scanner(System.in);



    public Game() {


        /**
         * Initializing the first character.
         */
        CharCreate player1 = new CharCreate(1);
        CharCreate player2 = new CharCreate(2);

        System.out.println("Choisissez votre classe : (1. Guerrier, 2. Rodêur, 3 mage)");
        job=sc.nextInt();
        if (job==1){
            player1 = new Warrior();
        } else if(job==2) {
            player1 = new Mage();
        } else if (job==3){
            player1 = new Rogue();
        }





        /**Warrior P1 = new Warrior();
        System.out.println(P1.getShout()+" Joueur 1 niveau "+P1.getLvl()+" je possède "+P1.getHp()+" de vitalité, "
                            +P1.getStr()+" de force,  "+P1.getAgi()+" d'agilité et "+P1.getIntel()+ " d'intelligence");
        System.out.println(" ");
        CharCreate P2 = new CharCreate(2);
        System.out.println(P2.getShout()+" Joueur 2 niveau "+P2.getLvl()+" je possède "+P2.getHp()+" de vitalité, "
                +P2.getStr()+" de force,  "+P2.getAgi()+" d'agilité et "+P2.getIntel()+ " d'intelligence");
         */
    }


}
