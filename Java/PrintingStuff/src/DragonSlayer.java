public class DragonSlayer {
    public static void main(String[] args) {
        int playerStrength = 30;
        int dragonsHP = 35;
        boolean hasSword=true;
        if(playerStrength>dragonsHP){
            System.out.println("You have defeated the Dragon!");
        }
        else if(hasSword){
            System.out.println("You're not strong enough to defeat the dragon. However, you remember your magic sword and use it to slay the beast.");
        }
        else{
            System.out.println("The Dragon defeated you!");
        }
    }
}
