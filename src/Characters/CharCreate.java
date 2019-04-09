package Characters;

import java.util.Scanner;

public class CharCreate {

    /**
     * Les statistiques du personnage.
     */

   protected int choix=0, lvl, str, agi, intel, job,hp, skillPoint;
   protected String shout="";


    Scanner sc = new Scanner(System.in);

    public CharCreate() {

        this.lvl = lvl;
        this.str = str;
        this.agi = agi;
        this.intel = intel;



        /**
         * Asking the choice of the player, checking his choice and get the right shout for the job.
         */

        System.out.println("Choisissez votre classe : (1. Guerrier, 2. Rodêur, 3 mage)");
        do {
            this.choix = sc.nextInt();

            if (choix > 3) System.out.println("Veuillez choisir une classe entre 1 et 3");
        }while (choix>3);

        /**
         * Getting all the stats for the character.
         */
        System.out.println("Niveau du personnage ?");
        this.lvl=sc.nextInt();

        /**
         * adding lvl to skillPoint since the lvl determine the number of skill points you need for a stats.
         */
        this.skillPoint = this.lvl;


        this.lvl = setLvl(lvl);
        this.hp = this.lvl*5;

        /**
         * adding str / agi / intel witch check to be sure they're enough skillpoint to add the stats.
         */

        System.out.println("Force du personnage ? ");
        this.str=sc.nextInt();
        this.str = setStr(str, skillPoint, lvl);
        this.skillPoint -= this.str;

        System.out.println("Agiltié du personnage ?");
        this.agi=sc.nextInt();
        this.agi=setAgi(agi, skillPoint,lvl);
        this.skillPoint -= this.agi;

        System.out.println("Intelligence du personnage ?");
        this.intel=sc.nextInt();
        this.intel=setIntel(intel, skillPoint, lvl);
        this.skillPoint -= this.intel;

    }


    /** getter
     *
     * @return
     */
         public int getJob() {
            return job;
         }


         public int getChoix() {
            return choix;
        }

        public int getLvl() {
            return lvl;
        }

        public int getStr() {
            return str;
        }

        public int getAgi() {
            return agi;
        }

        public int getIntel() {
            return intel;
        }

        public String getShout(int choix) {
            return shout;
        }

         public int getHp() {
             return hp;
         }

    /**
     * Setter
     */

    public void setChoix(int choix) {

             this.choix = choix;
        }

        public int setLvl(int lvl) {

        boolean check=true;

        while (check == true) {
            if ((lvl >= 1) && (lvl <= 100)) {
                check = false;
            } else {
                System.out.println("Le level doit se trouver entre 1 et 100");
                check = true;
                System.out.println("Niveau du personnage ?");
                lvl=sc.nextInt();

            }
        }
        this.lvl = lvl;
        return this.lvl;
    }

    public int setStr(int str, int skillPoint, int lvl) {

        boolean check=true;

        while (check == true) {
            if (str > skillPoint) {
                System.out.println("La force : " + str + " ne peut pas être supérieur au niveau du personnage " + this.lvl);
                System.out.println("Veuillez redonner la force de votre personnage qui doit être inférieur ou égale à "+skillPoint);
                str = sc.nextInt();
                }else check = false;
        }

        this.str = str;
        return this.str;

    }

    public int setAgi(int agi, int skillPoint, int lvl) {
        boolean check=true;

        while (check == true) {
            if (agi > skillPoint) {
                System.out.println("L'agilité : " + agi + " ne peut pas être supérieur au niveau du personnage " + this.lvl);
                System.out.println("Veuillez redonner l'agilité de votre personnage qui doit être inférieur ou égale à "+skillPoint);
                agi = sc.nextInt();
            }else check = false;
        }

        this.agi = agi;
        return this.agi;
    }

    public int setIntel(int intel, int skillPoint, int lvl) {
        boolean check=true;

        while (check == true) {
            if (intel > skillPoint) {
                System.out.println("L'intelligence : " + intel + " ne peut pas être supérieur au niveau du personnage " + this.lvl);
                System.out.println("Veuillez redonner l'intelligence de votre personnage qui doit être inférieur ou égale à "+skillPoint);
                intel = sc.nextInt();
            }else check = false;
        }
        this.intel = intel;
        return this.intel;
    }

    public void setShout(String shout, int Choix) {
        if (choix == 1){
            shout="warrrg";
        } else if (choix == 2){
            shout="Je suis le rôdeur";
        } else shout = "Abracadabra je suis le mage";


        this.shout = shout;
    }

    public void setClasse(int job) {
        this.job = job;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
