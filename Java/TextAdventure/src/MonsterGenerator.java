import java.util.Random;
public class MonsterGenerator {
    public static void main(String[] args) {
        Random generator=new Random();
        String[] monsters = { "Ghost", "Goblin", "Ghoul" };
        int monsterindex=generator.nextInt(monsters.length);
        String monster = monsters[monsterindex];
        System.out.println("A "+monster+" appears");
    }
}

