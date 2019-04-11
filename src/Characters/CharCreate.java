package Characters;

import java.util.Scanner;

public class CharCreate {

    /**
     * Les statistiques du personnage.
     */

   protected int id, lvl, str, agi, intel, job,hp, skillPoint, attBasic, attSpecial;
   protected String shout="";
   Scanner sc = new Scanner(System.in);



    public CharCreate() {

        this.lvl = lvl;
        this.str = str;
        this.agi = agi;
        this.intel = intel;


        /**
         * Getting all the stats for the character.
         */

        System.out.println("Niveau du personnage ?");
        this.lvl=sc.nextInt();

        /**
         * adding lvl to skillPoint since the lvl determine the number of skill points you need for a stat.
         */
        this.lvl = setLvl(lvl);
        this.skillPoint = this.lvl;
        this.hp = this.lvl*5;

        /**
         * adding str / agi / intel with check to be sure they're enough skillpoint to add to the stats.
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
     */

        public int getAttBasic() { return attBasic;}

        public int getAttSpecial() {return attSpecial;}

        public int getId() { return id;}

        public int getJob() {
            return job;
         }

        public int getLvl() {return lvl;}

        public int getStr() {return str;}

        public int getAgi() {return agi;}

        public int getIntel() {
            return intel;
        }

        public String getShout() {
            return shout;
        }

        public int getHp() {
             return hp;
         }


    /**
     * Setter
     */
    public void setAttBasic(int ttBasic) {
        this.attBasic = ttBasic;
    }

    public void setAttSpecial(int attSpecial) {
        this.attSpecial = attSpecial;
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

    public void setHp(int hp) {
        this.hp = hp;
    }
}
