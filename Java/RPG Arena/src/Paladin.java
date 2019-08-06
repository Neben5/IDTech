public class Paladin extends Character {
    public int hallow = 5;
    public Paladin(){
        super();
        this.strength=10;
        this.defense=4;
        this.health=80;
    }
    public int takeDamage(int damage){
        int damageTaken=damage-this.defense;
        if(Arena.generator.nextInt(100)<hallow){
            damageTaken=0;
        }
        this.health-=damageTaken;
        return damageTaken;
    }
}
