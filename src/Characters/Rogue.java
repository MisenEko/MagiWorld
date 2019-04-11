package Characters;

public class Rogue extends CharCreate {



    public Rogue(int idPlayer) {
        super();
        id = idPlayer;
        System.out.print("Chuuuut, je suis le Rôgue du Joueur " + idPlayer);
        Intro();
    }

    public void BasicAttack (CharCreate player){
        super.BasicAttack(player);
        System.out.println("Joueur "+id+" utilise Tir à l'Arc et inflige "+agi+ " de dégats.");
        player.setHp(player.getHp()-agi);

    }

    public void SpecialAttack (CharCreate player){
        super.SpecialAttack(player);
        System.out.println("Joueur "+id+" utilise Concentration et gagne "+(lvl/2)+" en agilité");
        agi+=lvl/2;

    }
}