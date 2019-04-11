package Characters;

public class Warrior extends CharCreate {



    public Warrior(int idPlayer) {
        super();
        id = idPlayer;
        System.out.print("Woarg, je suis le Guerrier du Joueur " + idPlayer);
        Intro();
    }

    public void BasicAttack (CharCreate player){
        super.BasicAttack(player);
        System.out.println("Joueur "+id+" utilise Coup d'épée et inflige "+str+ " de dégats.");
        player.setHp(player.getHp()-str);

    }

    public void SpecialAttack (CharCreate player){
        super.SpecialAttack(player);
        System.out.println("Joueur "+id+" utilise Coup de Rage et inflige "+str*2+" de dégats");
        player.setHp(player.getHp()-str*2);
        System.out.println("Joueur "+player.getId()+" a perdu "+str*2+" HP et il lui reste "+player.getHp());
        hp = hp - (str/2);
        System.out.println("Joueur "+id+" s'inflige à lui même "+str/2+" dégats et lui reste "+hp+" HP");
    }
}
