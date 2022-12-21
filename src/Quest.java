import java.io.*;
import java.util.Properties;

public class Quest {
    String title;
    String startLocation;
    String objective;
    GameObject[] questObjects = new GameObject[5];
    GameObject[] questRewards = new GameObject[5];
    String script;

    //QuestConstructor
    Quest(String questFileName){
        try{
            File questFile = new File("quests/" + questFileName + ".cfg");
            FileReader reader = new FileReader(questFile);
            Properties questProps = new Properties();
            questProps.load(reader);
            reader.close();
            title = questProps.getProperty("Title");
            script = questProps.getProperty("Script");
            startLocation = questProps.getProperty("Start-Location");
            objective = questProps.getProperty("Objective");
            //questObjects = valueOf(questProps.getProperty("objects"));
    } catch (FileNotFoundException ex) {
        System.out.println("Quest file not found");
    } catch (IOException ex) {
        System.out.println("Bad IO while creating quest");
    } catch (Exception ex){
        System.out.println("Bad ex while creating quest");
    }
    }
}
