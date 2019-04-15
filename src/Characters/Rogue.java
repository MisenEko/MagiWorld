package Characters;

public class Rogue extends CharCreate {



    public Rogue(int idPlayer) {
        super();
        id = idPlayer;
        System.out.print("Chuuuut, je suis le Rôgue du Joueur " + idPlayer);
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
    public Rogue(int lvl, int hp, int str, int agi, int intel ){
        super(lvl,hp,str,agi,intel);
    }

    /**
     * Settings all attacks of the Rogue
     * @param player
     */
    @Override
    public void BasicAttack (CharCreate player){
        super.BasicAttack(player);
        System.out.println("Joueur "+id+" utilise Tir à l'Arc et inflige "+agi+ " de dégats.");
        player.setHp(player.getHp()-agi);
        System.out.println("Joueur "+player.getId()+" a perdu "+agi+" point de vie et il lui en reste "+player.getHp()+".");

    }
    @Override
    public void SpecialAttack (CharCreate player){
        super.SpecialAttack(player);
        System.out.println("Joueur "+id+" utilise Concentration et gagne "+(lvl/2)+" en agilité");
        agi+=lvl/2;

    }
}