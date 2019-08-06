public class Rogue extends Character {
    public int dexterity=20;
    public Rogue(){
        super();
        this.strength=8;
        this.defense=4;
        this.health=100;
    }
    public int attack(Character target){
        boolean criticalHit=Arena.generator.nextInt(100)<dexterity;
        if(target.name==this.name){
            return 0;
        }else {
            double temp = this.strength;
            temp = temp * this.multiplier;
            int damage = (int) temp;
            if(criticalHit){
                damage*=2;
                System.out.println("***CRIT***");
            }
            int damageDealt = target.takeDamage(damage);
            return damageDealt;
        }
    }
}
