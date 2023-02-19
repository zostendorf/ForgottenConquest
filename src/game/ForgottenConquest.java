package game;
/*
 * Credit to Huw Collingbourne
 * Template Provided
 */


import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class ForgottenConquest {

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

    private static <BufferedImage> void map() {
        // Create a frame
        JFrame mapFrame = new JFrame("Map");
        //Use this for grid layout
        //https://docs.oracle.com/javase/tutorial/uiswing/layout/gridbag.html

        //Creates the map panel
        JPanel mapPanel = new JPanel() {
            //Declares the background image
            java.awt.image.BufferedImage image;
            {
                try {
                    image = ImageIO.read(getClass().getResource("forgottenConquestMap.png"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            //Paints the background image
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);

            }
        };

        //Creates the player's map marker
        JPanel playersMapMarker = new JPanel() {

            //Paints the player's map marker
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.RED);
                g.fillOval(100, 100, 10, 10);
            }
        };


        mapPanel.setPreferredSize(new Dimension(500,500));

        mapPanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 0.9;
        c.gridx = 2;
        c.gridy = 0;
        mapPanel.add(playersMapMarker, c);

        mapFrame.add(mapPanel);
        mapFrame.pack();
        mapFrame.setVisible(true);
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

        game.showStr(game.quest1.getIntro());
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
                    case "help":
                        game.showControls();
                        break;
                    case "map":
                        map();
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
