import java.util.Scanner;
public class CharacterCreator {
    public static void main(String[] args) {
Scanner playerInput = new Scanner(System.in);
String playerName;
double playerHealth;
System.out.println("What's your player's name?: ");
playerName=playerInput.nextLine();

System.out.println("How much health does " + playerName + " have?");
playerHealth=playerInput.nextDouble();
        System.out.println("Welcome " + playerName + ", you have " + playerHealth + " health");
    }
}
