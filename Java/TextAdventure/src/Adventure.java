import java.util.Scanner;
import java.util.Random;
public class Adventure {
    public static void main(String[] args) {
        int playerLevel=1;
        String playerName="Horacio";
        double playerHealth=10.0;
        Scanner userInput=new Scanner(System.in);
        int playerChoice;
        Random randomGenerator=new Random();
        boolean hasSword = false;
        boolean hasMagicKey = false;
        double sirenHealth=10;
        double dragonHealth=100;
        double fistDamage=1;
        double swordDamage=5;



        System.out.println("What is your character's name?");
        playerName=userInput.nextLine();

        System.out.println("Welcome "+ playerName+ "!");

        System.out.println("Before you is a large cave mouth. Darkness is before you. Dare you enter the Cave of Wonders?");

        System.out.println("1. Enter the Cave of Wonders");
        System.out.println("2. Run away to the safety of your warm bed");
        playerChoice=userInput.nextInt();
        if(playerChoice==1){
            //enter
            System.out.println("You made it to the entrance of the cave.");

            playerLevel++;
            System.out.println("Your bravery has rewarded you! Congratulations, you are now level " + playerLevel);

            System.out.println("You travel forward into the dark cave. You feel something press against your leg...");
            System.out.println("It's a trap! Suddenly, you're being bombarded by rocks from above.");
            int rockDamage = randomGenerator.nextInt(5);
            playerHealth-=rockDamage;
            System.out.println("The rock slide hits you for " + rockDamage + "!");
            System.out.println("You have " + playerHealth + " health remaining.");

            System.out.println("You pick yourself up from the cave floor and brush a cloud of dust from your clothes.");
            System.out.println("The cave narrows as you press on until you manage to squeeze through an opening into a large natural cavern.");
            System.out.println("Before you is a treasure chest.");

            System.out.println("1. Open the chest.");
            System.out.println("2. Ignore the chest. Obvious trap is obvious.");
            playerChoice = userInput.nextInt();
            if(playerChoice==1){
                System.out.println("Uneasy after your brush with death, you slowly open the chest to reveal a magical sword!");
                hasSword=true;

            }

            System.out.println("You leave the cavern with the chest and continue your journey");
            System.out.println("Up ahead the air grows warm and wet. You hear snoring.");
            System.out.println("Peeking around a corner you see a monstrous shape! A dragon sleeps in the room ahead.");
            System.out.println("You swallow hard and decide it is time to leave.");
            System.out.println("As you turn, your foot finds a rock. It thuds loudly against the cave wall. The dragon wakes up!");

            System.out.println("1. Fight the Dragon.");
            System.out.println("2. Run for your life.");
            playerChoice = userInput.nextInt();
            if(playerChoice==1){
                //fight
                System.out.println("You feel courage surge through your body as you charge the dragon!");
                if(hasSword) {
                    if (swordDamage < dragonHealth) {
                        dragonHealth-=swordDamage;
                        System.out.println("You deal " + swordDamage + " to the dragon, reducing it's health to " + dragonHealth);
                        System.out.println("You pummel the dragon to no avail. The dragon snarls and swallows you whole. Game Over!");
                        System.exit(0);
                    }
                    else if(swordDamage>=dragonHealth){
                        dragonHealth-=swordDamage;
                        System.out.println("You deal " + swordDamage + " to the dragon, reducing it's health to " + dragonHealth);
                        System.out.println("You defeat the dragon and take it's head back home");
                        System.exit(0);
                    }
                }
            }else{
                //run
                System.out.println("As you run away to hide in the safety of your warm bed, the dragon yawns and returns to its slumber.");
                System.out.println("You come across a fork, which path do you chose? \n 1: Right \n 2: Left");
                playerChoice=userInput.nextInt();
                if(playerChoice==1){
                    System.out.println("You go right and find a glowing key");
                    hasMagicKey=true;

                    System.out.println("In front of you you see a lake with an eerie shine");
                    System.out.println("You can hear the enchanting call of a siren... it calls you forth");
                    System.out.println("You enter the water, and find yourself drowning");
                    System.out.println("The siren approaches you, her beautiful figure contrasted by her horrifying fangs");

                    System.out.println("1. Fight her");
                    System.out.println("2. Submit unto death, and be undone");
                    playerChoice=userInput.nextInt();
                    if (playerChoice == 1) {
                        if(hasSword){
                            System.out.println("You swing at her with your sword, barely scratching her, however the magic glow of the sword wraps itself around her and turns her to dust");
                            System.out.println("You have discovered your sword is effective against aquatic creatures");
                            System.out.println("In the midst of the dust, a small shadow flies towards your sword, binding itself to it");
                            System.out.println("Sword damage increased to 100");
                        }else{
                            System.out.println("The siren eats you alive as you beat at her with your sword");
                            System.exit(0);

                        }


                    }else {
                        System.out.println("You get eaten");
                    }

                }else {
                    System.out.println("You go right and exit the cave, to return to your cozy lil home");
                    System.exit(0);
                }

            }

        }else{
            //leave
            System.exit(0);
        }

    }
}
