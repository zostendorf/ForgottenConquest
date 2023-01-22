package game;
/*
 * Sample Java file by Huw Collingbourne
 *
 * This code (and other sample code) accompanies the book 
 *    "The Little Book of Adventure Game Programming In Java"
 * Source code can be downloaded from:
 *    http://www.bitwisebooks.com
 * 
 */


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class AdventureGame {

    static Game game;

    private static void saveGame() {
        try {
            FileOutputStream fos = new FileOutputStream("Adv.sav");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(game); // game
            oos.flush(); // write out any buffered bytes
            oos.close();
            System.out.print("Game saved\n");
        } catch (Exception e) {
            System.out.print("Serialization Error! Can't save data.\n"
                    + e.getClass() + ": " + e.getMessage() + "\n");
        }
    }

    private static void loadGame() {
        try {
            FileInputStream fis = new FileInputStream("Adv.sav");
            ObjectInputStream ois = new ObjectInputStream(fis);
            game = (Game) ois.readObject();
            ois.close();
            System.out.print("\n---Game loaded---\n");
        } catch (Exception e) {
            System.out.print("Serialization Error! Can't load data.\n");
            System.out.print(e.getClass() + ": " + e.getMessage() + "\n");
        }
    }
    

    public static void main(String[] args) throws IOException {
        BufferedReader in;
        String input;
        String output = "";
        String currentQuest;
        game = new Game();
        
        in = new BufferedReader(new InputStreamReader(System.in));
        
        game.showTitle();
        game.showControls();

        //game.showStr(game.quest1.getIntro());
        game.quest1.begin();
        currentQuest = game.quest1.getName();
        
        do {
            System.out.print("> ");
            input = in.readLine();
            if(!input.equals("")){
                switch (input) {
                    case "save":
                        saveGame();
                        break;
                    case "load":
                        loadGame();
                        break;
                    default:
                        output = game.runCommand(input);
                        break;
                }
                if (!output.trim().isEmpty()) {
                    game.showStr(output);
                }
                game.questCheck(currentQuest);
            }
        } while (!"q".equals(input));
        
    }
    

}
