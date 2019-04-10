package Characters;

public class Mage extends CharCreate {



    public Mage(int idPlayer) {
        super();
        id = idPlayer;
        System.out.print("Abracadabra, je suis le Mage du Joueur " + idPlayer);
        Intro();
    }

    public void BasicAttack (CharCreate player){
        super.BasicAttack(player);
        System.out.println("Joueur "+id+" utilise Boule de feu et inflige "+intel+ " de dégats.");
        player.setHp(player.getHp()-intel);

    }

    public void SpecialAttack (CharCreate player){
        System.out.println("Joueur "+id+" utilise Soin et se réstitue "+intel*2+" point de vie!");
        hp = intel*2;
        if (hp>lvl) hp=lvl*5;
    }
}