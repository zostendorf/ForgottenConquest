import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class forgottenConquest {
	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		Player player1 = new Player();
		String player1Input = "";
		Map map = new Map();

		player1.map.currentLocation.setCoordinates(6,9);
		buildWorld();
		gameIntro();

		// create a scanner to read input from the user
		Scanner scanner = new Scanner(System.in);

		// runQuest("quest1");
		GameObject apple = new GameObject();
		apple.setName("apple");
		player1.addToinventory(apple);
		do {
			player1Input = scanner.nextLine();
			runPlayerCommand(player1, player1Input);
		} while (!player1Input.equals("quit"));

		// close the scanner to prevent resource leaks
		scanner.close();
    }
  
	public static void runPlayerCommand(Player player, String playerCommand){
		ArrayList<String> commands = new ArrayList<String>();
		commands.add("map");
		commands.add("inventory");
		commands.add("north");
		commands.add("south");
		commands.add("east");
		commands.add("west");
		commands.add("n");
		commands.add("s");
		commands.add("e");
		commands.add("w");
		commands.add("quit");
		commands.add("help");
		//commands.add("");
		
		if(!commands.contains(playerCommand)){
			System.out.println(playerCommand + " is not a command. Type 'help' if you want to see a list of commands.");
		}
		else {
			switch (playerCommand) {
				case "help":
					System.out.println(commands);
					break;
				case "north":
					movePlayer(player, "north");
					break;
				case "south":
					movePlayer(player, "south");
					break;
				case "east":
					movePlayer(player, "east");
					break;
				case "west":
					movePlayer(player, "west");
					break;
				case "n":
					movePlayer(player, "north");
					break;
				case "s":
					movePlayer(player, "south");
					break;
				case "e":
					movePlayer(player, "east");
					break;
				case "w":
					movePlayer(player, "west");
					break;
				case "i":
					player.displayInventory();
					break;
				case "inventory":
					player.displayInventory();
					break;
				case "map":
					if(player.hasMap){
						player.map.display();
						System.out.println("You are at coordinate: [" + player.map.currentLocation.coordinateX + "," + player.map.currentLocation.coordinateY + "]");
					}
					else{
						try{
							printWithDelays("You don't have a map.", TimeUnit.MILLISECONDS, 100);
						} catch(InterruptedException e) {
							System.out.println("got interrupted");
						}
					}
					break;			
			}
		}
	}

	public static void movePlayer(Player player, String direction){
		if(direction.equals("north"))
			player.map.currentLocation.setCoordinates(player.map.currentLocation.coordinateX+1,player.map.currentLocation.coordinateY);
		if(direction.equals("south"))
			player.map.currentLocation.setCoordinates(player.map.currentLocation.coordinateX-1,player.map.currentLocation.coordinateY);
		if(direction.equals("east"))
			player.map.currentLocation.setCoordinates(player.map.currentLocation.coordinateX,player.map.currentLocation.coordinateY+1);
		if(direction.equals("west"))
			player.map.currentLocation.setCoordinates(player.map.currentLocation.coordinateX,player.map.currentLocation.coordinateY-1);
	}
	
	public static void runQuest(String questFileName) throws FileNotFoundException, InterruptedException{
		Quest quest = new Quest(questFileName);
		System.out.println("running quest: " + quest.title);
		printWithDelays(quest.script, TimeUnit.MILLISECONDS, 50);
		for(int i=0; i<quest.questObjects.length; i++){
			//player.addToinventory(quest.questObjects[i]);
		}
	}	

	public static void printWithDelays(String data, TimeUnit unit, long delay)
	        throws InterruptedException {
	    for (char ch:data.toCharArray()) {
	        System.out.print(ch);
	        unit.sleep(delay);
	    }
	    System.out.println();
	}
	
	public static void buildWorld() {
		Location[][] world = new Location[10][10];
		for(int i=0; i < world.length; i++){
			for(int j=0; j < world.length; j++){
				world[i][j] = new Location();
				world[i][j].setCoordinates(i,j);
				if(i==7 && j==9){
					world[i][j].setName("Ship");
				}
				else if(i==7 && j==8){
					world[i][j].setName("base camp");
				}
				else if(i==3 && j==9){
					world[i][j].setName("Tulum");
				}
				else if(i==3 && j==1){
					world[i][j].setName("Launa de Kaan Luum NE");
				}
				else if(i==3 && j==0){
					world[i][j].setName("Launa de Kaan Luum NW");
				}
				else if(i==4 && j==0){
					world[i][j].setName("Launa de Kaan Luum SW");
				}
				else if(i==4 && j==1){
					world[i][j].setName("Launa de Kaan Luum SE");
				}
				else if(i<=4 && j==9){
					world[i][j].setName("Open sea");
				}
			}
		}
	}

	public static void gameIntro() {
		try {

			printWithDelays("FORGOTTEN CONQUEST", TimeUnit.MILLISECONDS, 5);
			System.out.println();
			TimeUnit.SECONDS.sleep(1);
		} catch(InterruptedException e) {
			System.out.println("got interrupted");
		}
	}
}