package Characters;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CharCreate {

    /**
     * Les statistiques du personnage.
     */

   protected int choix=0, lvl, str, agi, intel;
    Scanner sc = new Scanner(System.in);

    public CharCreate() {

        this.lvl = lvl;
        this.str = str;
        this.agi = agi;
        this.intel = intel;

        System.out.println("Choisissez votre classe : (1. Guerrier, 2. Rodêur, 3 mage)");
        this.choix = sc.nextInt();

        switch (choix){
            case 1 :
                Warrior war = new Warrior();
                break;
            case 2 :
                Rogue rog = new Rogue();
                break;
            case 3 :
                Mage mag = new Mage();
                break;
            default :
                System.out.println("Veuillez selectionner une des 3 classes avec 1 2 ou 3");
                break;
        }




    }
}
