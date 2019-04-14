package Characters;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CharCreate {

    /**
     * Les statistiques du personnage.
     */

   protected int id, lvl, str, agi, intel,hp, skillPoint, attBasic, attSpecial;
   protected String shout="";
   Scanner sc = new Scanner(System.in);



    public CharCreate() {


        /**
         * Getting all the stats for the character.
         *
         * adding lvl to skillPoint since the lvl determine the number of skill points you need for a stat.
         */
        this.lvl = setLvl(lvl);
        this.skillPoint = this.lvl;
        this.hp = this.lvl*5;

        /**
         * adding str / agi / intel with check to be sure they're enough skillpoint to add to the stats.
         */
        this.str = setStr(str, skillPoint, lvl,hp);
        this.skillPoint -= this.str;

        this.agi=setAgi(agi, skillPoint,lvl);
        this.skillPoint -= this.agi;

        this.intel=setIntel(intel, skillPoint, lvl);
        this.skillPoint -= this.intel;
    }

    /**
     * Introduction of the character with the spécifique shout.
     * @param idPlayer
     */
    public CharCreate(int idPlayer){ id = idPlayer;   }

    protected void Intro() {
        System.out.println(
                getShout()+" niveau "
                +getLvl()+" je possède "
                +getHp()+" de vitalité, "
                +getStr()+" de force,  "
                +getAgi()+" d'agilité et "
                +getIntel()+ " d'intelligence");
        System.out.println(" ");
    }

    public void BasicAttack (CharCreate player){
        System.out.println("");
    }

    public void SpecialAttack (CharCreate player){
        System.out.println("");
    }

    /** getter
     *
     * @return
     *
     * @param player2
     */

        public int getAttBasic(Warrior player2) { return attBasic;}

        public int getAttSpecial() {return attSpecial;}

        public int getId() { return id;}

        public int getLvl() {return lvl;}

        public int getStr() {return str;}

        public int getAgi() {return agi;}

        public int getIntel() {return intel;}

        public String getShout() {return shout;}

        public int getHp() {return hp;}


    /**
     * Setter
     */


    protected int setLvl(int lvl) {
        boolean checkInput, check;
            do{
                try{System.out.println("Niveau du personnage ? ");
                    lvl=sc.nextInt();
                    checkInput=true;

                }catch (InputMismatchException e){
                    System.out.println("Le niveau doit être un nombre compris entre 1 et 100");
                    sc.next();
                    checkInput=false;

                }
            }while(!checkInput);


        do {
            if ((lvl >= 1) && (lvl <= 100)) {
                check = false;
            } else {
                System.out.println("Le Niveau doit se trouver entre 1 et 100");
                check = true;
                System.out.println("Niveau du personnage ?");
                lvl=sc.nextInt();

            }
        }while (check);
        this.lvl = lvl;
        return this.lvl;
    }

    protected int setStr(int str, int skillPoint, int lvl, int hp) {
        boolean checkInput,  check=true;

        do{
            try{System.out.println("Force du personnage ? ");
                str=sc.nextInt();
                while(str<0){
                    System.out.println("La force doit être un nombre positif");
                    System.out.println("Force du personnage ?");
                    str=sc.nextInt();
                }
                checkInput=true;

            }catch (InputMismatchException e){
                sc.next();
                checkInput=false;
                System.out.println("La Force doit être un nombre qui se trouver entre 0 et "+skillPoint);
            }
        }while(!checkInput);



        while (check) {
            if (str > skillPoint) {
                System.out.println("La Force : " + str + " ne peut pas être supérieur au niveau du personnage " + this.lvl);
                System.out.println("Veuillez redonner la Force de votre personnage qui doit être inférieur ou égale à "+skillPoint);
                str = sc.nextInt();
                }else check = false;
        }

        this.str = str;
        return this.str;

    }

    protected int setAgi(int agi, int skillPoint, int lvl) {
        boolean checkInput,  check=true;

        do{
            try{System.out.println("Agilité du personnage ? ");
                agi=sc.nextInt();
                while(agi<0){
                    System.out.println("L'agilité doit être un nombre positif");
                    System.out.println("Agilité du personnage ?");
                    agi=sc.nextInt();
                }
                checkInput=true;

            }catch (InputMismatchException e){
                sc.next();
                checkInput=false;
                System.out.println("L'Agilité doit être un nombre qui se trouver entre 0 et "+skillPoint);
            }
        }while(!checkInput);

        while (check == true) {
            if (agi > skillPoint) {
                System.out.println("L'Agilité : " + agi + " ne peut pas être supérieur au niveau du personnage " + this.lvl);
                System.out.println("Veuillez redonner l'Agilité de votre personnage qui doit être inférieur ou égale à "+skillPoint);
                agi = sc.nextInt();
            }else check = false;
        }

        this.agi = agi;
        return this.agi;
    }

    protected int setIntel(int intel, int skillPoint, int lvl) {
        boolean checkInput,  check=true;

        do{
            try{System.out.println("L'Intelligence du personnage ? ");
                intel=sc.nextInt();
                while(intel<0);{
                    System.out.println("L'Intelligence doit être un nombre positif");
                    System.out.println("L'Intelligence du personnage ?");
                    intel=sc.nextInt();
                }
                checkInput=true;

            }catch (InputMismatchException e){
                sc.next();
                checkInput=false;
                System.out.println("L'Intelligence doit être un nombre qui se trouver entre 0 et "+skillPoint);
            }
        }while(!checkInput);

        while (check == true) {
            if (intel > skillPoint) {
                System.out.println("L'intelligence : " + intel + " ne peut pas être supérieur au niveau du personnage " + this.lvl);
                System.out.println("Veuillez redonner l'Intelligence de votre personnage qui doit être inférieur ou égale à "+skillPoint);
                intel = sc.nextInt();
            }else check = false;
        }
        this.intel = intel;
        return this.intel;
    }

    protected void setHp(int hp) {
        this.hp = hp;
    }


}
