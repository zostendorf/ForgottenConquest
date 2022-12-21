public class Player {
    public GameObject[] inventory = new GameObject[0];
    public boolean hasMap = false;

    public void addToinventory(GameObject inventoryObject){

        inventory = new GameObject[inventory.length + 1];
        inventory[inventory.length-1] = inventoryObject;
        if(inventoryObject.name.equals("map"))
            hasMap = true;
    }

    public void removeFromInventory(GameObject inventoryObject){
        for(int i=0; i<inventory.length; i++){
            if(inventory[i].name.equals(inventoryObject.name)){
                //TODO Remove Object
            }
        }
    }

    public void displayInventory(){
        for(int i=0; i< inventory.length; i++){
            System.out.println(inventory[i].name);
        }
    }
}
