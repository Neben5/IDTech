import java.util.Scanner;

public class TheGuard {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Choose a class:\n1 - Warrior\n2 - Thief\n3 - Mage");
        int playerClass = userInput.nextInt();
        System.out.println("There is a guard here, what do you do?\n1 - Fight him\n2 - Steal his wallet\n3 - Throw a fireball\n4 - Talk the guard into leaving\n5 - Intimidate the guard\n6 - Bond with the guard over your shared disdain for magic");
        int playerChoice = userInput.nextInt();

        /* new code goes here */
        if(playerClass == 1 && playerChoice == 1){
            System.out.println("You use your awesome warrior skills and punch the guard");
        }else if(playerClass == 2 && playerChoice == 2){
            System.out.println("You use your sneaky thief skills to pickpocket the innocent guard");
        }else if(playerClass == 3 && playerChoice == 3) {
            System.out.println("You fireball the guard and eat him like barbeque");
        }else if((playerClass == 2 || playerClass == 3) && playerChoice == 4){
            System.out.println("You use your wit to talk the guard away");
        }else if(playerClass==1 && playerChoice==5) {
            System.out.println("You scare the guard away by flexing your warrior muscles till your shirt buttons fly off and hit him in the eye");
        }else if((playerClass == 1 || playerClass == 3) && playerChoice==6){
            System.out.println("You befriend the guard, and he admits that he doesn't normally stop people at all because he's not paid enough");
        }else{
            System.out.println("You attempt to scare the guard away -- he frowns at you and beheads you immediately");
            System.exit(0);
        }




        userInput.close();
    }

}