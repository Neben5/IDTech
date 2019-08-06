import java.util.Random;
public class Arena {
    public static Random generator = new Random();
    public static void main(String[] args) {
        Character player1 = new Character(10, 2, 100);
        Character player2=new Rogue();

        player1.strength = 2;
        player1.health = 50;
        player1.defense = 1;
        player1.multiplier=2;
        player2.strength = 1;
        player2.health = 50;
        player2.defense = 2;
        player2.multiplier=2;


        while (player1.isAlive()&&player2.isAlive()){
            int damage;

            System.out.println(player1.name + " vs. " + player2.name);
            System.out.println(player1.health + " vs. "  + player2.health);
            damage=player1.attack(player2);
            System.out.println(player1.name + " hits " + player2.name + " for " + damage);
            damage=player2.attack(player1);
            System.out.println(player2.name + " hits " + player1.name + " for " + damage);
        }
        if(player1.isAlive()){
            System.out.println(player1.name + " wins!");
        }else if(player2.isAlive()){
            System.out.println(player2.name + " wins!");
        }else{
            System.out.println("It's a draw!");
        }
    }
}
