public class CheckInventory {
    public static void main(String[] args) {
        String[] inventory=new String[5];
        inventory[0] = "HP Potion";
        inventory[1] = "Magic Sword";
        inventory[2] = "Wooden Shield";
        inventory[3] = "Massive dildo mallet";
        inventory[4] = "Magic key";
        printInventory((inventory));
        if(checkInventory(inventory,"Magic key")){
            System.out.println("Using your magic key, you open the locked door.");
        }
    }
    public static void printInventory(String[] inventory){
        for(int i=0;i<inventory.length;i++){
            System.out.println(inventory[i]);
        }
    }
    public static boolean checkInventory(String[] inventory, String toCheck){
        for(int i=0;i<inventory.length;i++){
            String item=inventory[i];
            if(item != null && item.equals(toCheck)){
                return true;
            }

        }
        return false;
    }
}
