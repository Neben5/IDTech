import java.util.Random;

public class Character {


    public String name;
    public int health = 100;
    public int defense;
    public int strength;
    public double multiplier;

    public String[] nameList={"Geoff", "Steve", "Krogar" };

    public Character(){
        this.name=nameList[Arena.generator.nextInt(nameList.length)];
    }
    public Character(int str, int def, int health){
        this();
        this.strength = str;
        this.defense = def;
        this.health = health;
    }

    public int takeDamage(int damage){
        int damageTaken=damage-this.defense;
        this.health-=damageTaken;
        return damageTaken;
    }
    public int attack(Character target){
        if(target.name==this.name){
            return 0;
        }else {
            double temp = this.strength;
            temp = temp * this.multiplier;
            int damage = (int) temp;
            int damageDealt = target.takeDamage(damage);
            return damageDealt;
        }
    }
    public boolean isAlive(){
        return this.health>0;
    }
}
