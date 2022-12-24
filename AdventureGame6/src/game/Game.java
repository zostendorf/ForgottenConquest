/*
 * Bitwise Books & Courses - sample Java code
 * http://www.bitwisebooks
 * http://www.bitwisecourses.com
 */
package game;

import java.util.*;     // required for ArrayList

import javax.lang.model.util.ElementScanner6;

import gameobjects.Actor;
import gameobjects.ContainerThing;
import gameobjects.Room;
import gameobjects.Thing;
import gameobjects.ThingList;
import gameobjects.Treasure;
import globals.Dir;

public class Game implements java.io.Serializable {

    //private ArrayList<Room> map; // the map - an ArrayList of Rooms
    private Room[][] map = new Room[10][10];
    private Actor player;  // the player - provides 'first person perspective'  

    public Game() {
        Parser.initVocab();
        initGame();
    }

    private void initGame() {
        //this.map = new ArrayList<Room>();
        // --- construct a new adventure ---

        ThingList trollRoomList = new ThingList("trollRoomList");
        ThingList forestList = new ThingList("forestList");
        ThingList caveList = new ThingList("caveList");
        ThingList dungeonList = new ThingList("dungeonList");
        ThingList playerlist = new ThingList("playerlist");


        Room trollRoom = new Room();
        Room forest = new Room();
        Room cave = new Room();
        Room shed = new Room();
        Room dungeon = new Room();


        for(int i=0; i<10;i++){
            for(int j=0; j<10;j++){
                map[i][j] = new Room();
                //all room list
                //    Room( name,           description,                                                                         N,           S,        W,        E,        [Up],       [Down],      thinglist)
                System.out.println("[" + i + "][" + j +"]");
                if(i==0 && j==0)
                    map[i][j].init("Jungle", "a thick patch of jungle flora. The north and west are blocked from here.", null, map[i][j+1], null, map[i+1][j], null, null, trollRoomList);
                else if(i==0)
                    if(j<9)
                        map[i][j].init("Jungle", "a thick patch of jungle flora. The west is blocked from here.", map[i][j-1], map[i][j+1], null, map[i+1][j], null, null, null);
                    else 
                        map[i][j].init("Jungle", "a thick patch of jungle flora. The south and west are blocked from here.", map[i][j-1], null, null, map[i+1][j], null, null, null);
                else if(j==0)
                    if(i==9)
                        map[i][j].init("Jungle", "a thick patch of jungle flora The north and east are blocked from here.", null, map[i][j+1], map[i-1][j], null, null, null, null);
                    else
                        map[i][j].init("Jungle", "a thick patch of jungle flora. The north is blocked from here.", null, map[i][j+1], map[i-1][j], map[i+1][j], null, null, null);
                else if(i==9 && j==9)
                    map[i][j].init("Jungle", "a thick patch of jungle flora. The south and east is blocked from here.", map[i][j-1], null, map[i-1][j], null, null, null, null);
                else if(i==9)
                    map[i][j].init("Jungle", "a thick patch of jungle flora The south is blocked from here.", map[i][j-1], map[i][j+1], map[i-1][j], null, null, null, null);
                else if(j==9)
                    map[i][j].init("Jungle", "a thick patch of jungle flora. The east is blocked from here.", map[i][j-1], null, map[i-1][j], map[i+1][j], null, null, null);
                else
                    map[i][j].init("Jungle", "a thick patch of jungle flora", map[i][j-1], map[i][j+1], map[i+1][j], map[i-1][j], null, null, caveList);
            }
        }

        trollRoomList.add(new Treasure("carrot", "It is a very crunchy carrot", 1, trollRoom));
        trollRoomList.add(new Thing("tree", "It is a very big tree", false, false, trollRoom));
        trollRoomList.add(new ContainerThing("sack", "a smelly old sack", true, true, true, true, new ThingList("sackList"), trollRoom));
        trollRoomList.add(new ContainerThing("bowl", "a brass bowl", true, true, false, true, new ThingList("bowlList"), trollRoom));
        trollRoomList.add(new ContainerThing("box", "a cardboard box", true, true, true, true, new ThingList("boxList"), trollRoom));

        forestList.add(new Treasure("sausage", "It is a plump pork sausage", 10, forest));

        caveList.add(new Treasure("paper", "Someone has written a message on the scrap of paper using a blunt pencil. It says 'This space is intentionally left blank'", 1, cave));
        caveList.add(new Treasure("pencil", "This pencil is so blunt that it can no longer be used to write.", 1, cave));

        dungeonList.add(new Treasure("ring", "It is a ring of great power.", 500, dungeon));
        dungeonList.add(new Treasure("wombat", "It's a cuddly little wombat. It is squeaking gently to itself.", 700, dungeon));
        
        // Map:
        //
        // Troll Room --- Forest 
        //   | 
        // Cave --------- Shed 
        //  | 
        //  V 
        // Dungeon
        //                 Room( name,   description,              N,        S,      W,      E,  [Up], [Down])
        trollRoom.init("Troll Room", "A dank room that smells of troll", null, cave, null, forest, null, null, trollRoomList);
        forest.init("Forest", "A leafy woodland", null, null, trollRoom, null, null, null, forestList);
        cave.init("Cave", "A dismal cave with walls covered in luminous moss", trollRoom, null, null, shed, null, dungeon, caveList);
        shed.init("Shed", "An old, wooden shed", null, null, cave, null, null, null, new ThingList("shedList"));
        dungeon.init("Dungeon", "A nasty, dark cell", null, null, null, null, cave, null, new ThingList("dungeonList"));

        // map.add(trollRoom);
        // map.add(forest);
        // map.add(cave);
        // map.add(shed);
        // map.add(dungeon);

        // for(/*locations on map */){
        //     trollRoom.init("Troll Room", "A dank room that smells of troll", null, cave, null, forest, null, null, trollRoomList);
        // }

        // create player and set location
        player = new Actor("player", "a loveable game-player", playerlist, map[5][5]);
    }

    // access methods     

    public String putObInContainer(String obname, String containername) {
        return player.putInto(obname, containername);
    }

    public String openOb(String obname) {
        return player.openOb(obname);
    }

    public String closeOb(String obname) {
        return player.closeOb(obname);
    }

    String takeOb(String obname) {
        String retStr;
        
        retStr = player.take(obname);
        return retStr;
    }

    String dropOb(String obname) {
        String retStr;
        
        retStr = player.drop(obname);
        return retStr;
    }

    void movePlayerTo(Dir dir) {                
        if (player.moveTo(dir)) {
            look();            
        } else {
            showStr("No Exit!");
        }
    }

    void goN() {
        movePlayerTo(Dir.NORTH);
    }

    void goS() {
        movePlayerTo(Dir.SOUTH);
    }

    void goW() {
        movePlayerTo(Dir.WEST);
    }

    void goE() {
        movePlayerTo(Dir.EAST);
    }

    void goUp() {
        movePlayerTo(Dir.UP);
    }

    void goDown() {
        movePlayerTo(Dir.DOWN);
    }

    void look() {
        showStr("You are in the " + player.describeLocation());
    }

    // utility method to display string if not empty
    // stripping any trailing newlines
    void showStr(String s) {
        if (s.endsWith("\n")) {
            s = s.substring(0, s.length() - 1);
        }
        if (!s.isEmpty()) {
            System.out.println(s);
        }
    }

    void showInventory() {
        showStr(player.inventory());
    }

    String lookAtOb(String obname) {
        return player.lookAt(obname);
    }

    String lookInOb(String obname) {
        return player.lookIn(obname);
    }

    public void showIntro() {
        String s;

        s = "You have fallen down a rabbit hole and arrived in\n"
                + "an underground cavern that smells strongly of troll.\n"
                + "Where do you want to go?\n"
                + "Enter: n, s, w, e, up, down\n"
                + "or q to quit.";
        showStr(s);
        look();
    }

    public String runCommand(String inputstr) {
        List<String> wordlist;
        String s;
        String lowstr;

        s = "ok";
        lowstr = inputstr.trim().toLowerCase();
        
        if (!lowstr.equals("q")) {
            if (lowstr.equals("")) {
                s = "You must enter a command";
            } else {
                wordlist = Parser.wordList(lowstr);
                s = Parser.parseCommand(wordlist);
            }
        }
        return s;
    }

    // Test..... BEGIN
    void showTest(String s) {
        showStr("> " + s);
        showStr(runCommand(s));

    }

    void test() {
        // utility method to let me try out bits of code while developing the game            
        showStr("---BEGIN TEST---");
        //  showThingsInRoom(); // this works ok when no objects are in containers
        showTest("get carrot");
        showTest("get bowl");
        showTest("get sack");
        showTest("get box");
        showTest("put carrot in bowl");
        showTest("put bowl in sack");
        showTest("put sack in box");
        showTest("put box in bowl");
        showTest("put sack in bowl");
        showTest("put carrot in box");
        showTest("i");
        showStr("---END TEST---");

    }
    // Test..... END

}
