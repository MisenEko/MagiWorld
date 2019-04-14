import Characters.CharCreate;
import Characters.Mage;
import Characters.Rogue;
import Characters.Warrior;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    private int job, attack;
    boolean check = true;
    Scanner sc = new Scanner(System.in);

    public Game() {
        CharCreate player1 = new CharCreate(1);
        CharCreate player2 = new CharCreate(2);

        /**
         * initializing the first character.
         */
        do {
            try {
                System.out.println("Joueur 1 Choisissez votre classe : (1. Guerrier, 2. Rôdeur, 3 Mage)");
                job = sc.nextInt();

                if (job == 1) player1 = new Warrior(1, player1.getLvl(), player1.getStr(),player1.getAgi(),player1.getIntel(),player1.getHp());
                else if (job == 2) player1 = new Rogue(1, player1.getLvl(), player1.getStr(),player1.getAgi(),player1.getIntel(),player1.getHp());
                else if (job == 3) player1 = new Mage(1, player1.getLvl(), player1.getStr(),player1.getAgi(),player1.getIntel(),player1.getHp());
            }catch (InputMismatchException e){
                sc.next();
                System.out.println("Vous devez saisir un nombre, correspondant aux classes proposé"+
                        " 1. Guerrier, 2. Rôdeur, 3 Mage");
                System.out.println(" ");
            }
        }while (job <1 || job > 3);

        /**
         * initializing the second character.
         */
        do{
            try {
                System.out.println("Joueur 2 Choisissez votre classe : (1. Guerrier, 2. Rôdeur, 3 mage)");
                job = sc.nextInt();
                if (job == 1) player2 = new Warrior(2, player2.getLvl(), player2.getStr(),player2.getAgi(),player2.getIntel(),player2.getHp());
                else if (job == 2) player2 = new Rogue(2, player2.getLvl(), player2.getStr(),player2.getAgi(),player2.getIntel(),player2.getHp());
                else if (job == 3) player2 = new Mage(2, player2.getLvl(), player2.getStr(),player2.getAgi(),player2.getIntel(),player2.getHp());
            }catch (InputMismatchException e){
                sc.next();
                System.out.println("Vous devez saisir un nombre, correspondant aux classes proposé"+
                        " 1. Guerrier, 2. Rôdeur, 3 Mage");
                System.out.println(" ");
            }
         }while (job <1 || job > 3);


        /**
         * Start of the fight between the 2 players.
         */
        while(check==true) {
            System.out.println("Joueur 1 (" + player1.getHp() + " vitalité) veulliez choisir votre action (1: Attaque Basique," +
                    " 2 : Attaque Spéciale");
            Combat(player1, player2);
            if(player2.getHp()<=0) {
                check=false;
                System.out.println("Le Joueur 2 n'a plus de vitalité, il perd donc la partie et le Joueur 1 gagne.");
                break;
            }


            System.out.println("Joueur 2 (" + player2.getHp() + " vitalité) veulliez choisir votre action (1: Attaque Basique," +
                    " 2 : Attaque Spéciale");
            Combat(player2, player1);
            if(player1.getHp()<=0) {
                check=false;
                System.out.println("Le Joueur 1 n'a plus de vitalité, il perd donc la partie et le Joueur 2 gagne.");
                break;
            }
        }
    }





    /**
     * Method to simulate the fight between 2 players.
     * @param player1
     * @param player2
     */

    public void Combat(CharCreate player1, CharCreate player2){
        do {
            attack=sc.nextByte();
            if (attack == 1) {
                player1.BasicAttack(player2);
            } else if (attack == 2) {
                player1.SpecialAttack(player2);
            } else {
                System.out.println("Veuillez selectionner une des deux attaques. 1 pour l'attaque de basique ou" +
                        "2 pour l'attaque spécial");
            }
        }while ((attack < 1) || (attack > 2));
    }


}
