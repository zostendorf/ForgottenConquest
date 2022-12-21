import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class forgottenConquest {
	public static void main(String[] args) {
		Player player1 = new Player();
		String player1Input = "";
		// create a scanner to read input from the user
		Scanner scanner = new Scanner(System.in);

		buildWorld();
		// gameIntro();

		//creates apple oject
		GameObject apple = new GameObject();
		apple.name = "apple";
		player1.addToinventory(apple);

		
		while(!player1Input.equals("quit")){
			System.out.println("What do you want to do?");
			player1Input = scanner.nextLine();
			if(player1Input.equals("inventory")){
					player1.displayInventory();
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
				world[i][j].displayCoordinates();
			}
		}
	}

	public static void gameIntro() {
		try {
			printWithDelays("1528 A.D.", TimeUnit.MILLISECONDS, 100);
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