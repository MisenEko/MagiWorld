package Characters;

public class Mage extends CharCreate {



    public Mage(int idPlayer, int lvl, int str, int agi, int intel,int hp) {
        super();
        id = idPlayer;
        System.out.print("Abracadabra, je suis le Mage du Joueur " + idPlayer);
        Intro();
    }
    /**
     * Settings all attacks of the Mage
     * @param player
     */
    public void BasicAttack (CharCreate player){
        super.BasicAttack(player);
        System.out.println("Joueur "+id+" utilise Boule de feu et inflige "+intel+ " de dégats.");
        player.setHp(player.getHp()-intel);
        System.out.println("Joueur "+player.getId()+" a perdu "+intel+" point de vie et il lui en reste "+player.getHp()+".");

    }

    public void SpecialAttack (CharCreate player){
        System.out.println("Joueur "+id+" utilise Soin et se réstitue "+intel*2+" point de vie!");
        hp = intel*2;
        if (hp>lvl) hp=lvl*5;
    }
}