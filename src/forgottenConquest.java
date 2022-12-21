import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class forgottenConquest {
	public static void main(String[] args) {
		Player player1 = new Player();
		String player1Input = "";
		Map map = new Map();
		map.name = "map";
		map.currentLocation.setCoordinates(6,9);
		// create a scanner to read input from the user
		Scanner scanner = new Scanner(System.in);

		buildWorld();
		// gameIntro();

		//creates apple oject
		GameObject apple = new GameObject();
		apple.name = "apple";
		player1.addToinventory(apple);
		player1.addToinventory(map);


		
		while(!player1Input.equals("quit")){
			System.out.println("What do you want to do?");
			player1Input = scanner.nextLine();
			if(player1Input.equals("inventory")){
				player1.displayInventory();
			}
			else if(player1Input.equals("map")){
				if(player1.hasMap){
					map.display();
				}
				else{
					try{
						printWithDelays("You don't have a map.", TimeUnit.MILLISECONDS, 100);
					} catch(InterruptedException e) {
						System.out.println("got interrupted");
					}
				}

			}
		}
    
		// close the scanner to prevent resource leaks
		scanner.close();
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
			printWithDelays("1519 A.D.", TimeUnit.MILLISECONDS, 100);
			printWithDelays("You've arrived.", TimeUnit.MILLISECONDS, 100);
			printWithDelays("Land Ho!", TimeUnit.MILLISECONDS, 100);
			printWithDelays("You hear some call this part of the new world \"La Florida\"...", TimeUnit.MILLISECONDS, 100);
			printWithDelays("but others on the ship say we sailed past that land days ago.", TimeUnit.MILLISECONDS, 100);
			printWithDelays("We've never seen a land like this before.", TimeUnit.MILLISECONDS, 100);
			printWithDelays("The myth of jungles and endless beaches is myth no more.", TimeUnit.MILLISECONDS, 100);
			printWithDelays("Could savages be true too?", TimeUnit.MILLISECONDS, 100);
			printWithDelays("The water is beaming blue", TimeUnit.MILLISECONDS, 100);
			printWithDelays("The sand is a pearl white", TimeUnit.MILLISECONDS, 100);
			printWithDelays("It eats your boot as you step off the boat.", TimeUnit.MILLISECONDS, 100);
			printWithDelays("Welcome", TimeUnit.MILLISECONDS, 100);
			System.out.println();
			TimeUnit.SECONDS.sleep(1);
			printWithDelays("to", TimeUnit.MILLISECONDS, 100);
			System.out.println();
			TimeUnit.SECONDS.sleep(1);
			printWithDelays("FORGOTTEN CONQUEST", TimeUnit.MILLISECONDS, 100);
			System.out.println();
			TimeUnit.SECONDS.sleep(1);
		} catch(InterruptedException e) {
			System.out.println("got interrupted");
		}
	}
}