package Characters;

public class Warrior extends CharCreate {


    /**
     * Constructor for the warrior
     * @param idPlayer
     */
    public Warrior(int idPlayer) {
        super();
        id = idPlayer;
        System.out.print("Woarg, je suis le Guerrier du Joueur " + idPlayer);
        Intro();
    }

    /**
     * Constructor for the test
     * @param lvl
     * @param hp
     * @param str
     * @param agi
     * @param intel
     */
    public Warrior(int lvl, int hp, int str, int agi, int intel ){
        super(lvl,hp,str,agi,intel);
    }

    /**
     * Settings all attack of the Warrior
     * @param player
     */
    @Override
    public void BasicAttack (CharCreate player){
        super.BasicAttack(player);
        System.out.println("Joueur "+id+" utilise Coup d'épée et inflige "+str+ " de dégats.");
        player.setHp(player.getHp()-str);
        System.out.println("Joueur "+player.getId()+" a perdu "+str+" point de vie et il lui en reste "+player.getHp()+".");

    }
    @Override
    public void SpecialAttack (CharCreate player){
        super.SpecialAttack(player);
        System.out.println("Joueur "+id+" utilise Coup de Rage et inflige "+str*2+" de dégats");
        player.setHp(player.getHp()-str*2);
        System.out.println("Joueur "+player.getId()+" a perdu "+str*2+" point de vie et il lui en reste "+player.getHp());
        hp = hp - (str/2);
        System.out.println("Joueur "+id+" s'inflige à lui même "+str/2+" dégats et lui reste "+hp+" HP");
    }
}
