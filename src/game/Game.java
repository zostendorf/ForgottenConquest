/*
 * Bitwise Books & Courses - sample Java code
 * http://www.bitwisebooks
 * http://www.bitwisecourses.com
 */
package game;

import java.util.*;     // required for ArrayList
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import gameUtils.BlinkLabel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.File;

import gameobjects.Actor;
import gameobjects.ContainerThing;
import gameobjects.Quest;
import gameobjects.Room;
import gameobjects.Thing;
import gameobjects.ThingList;
import gameobjects.Treasure;
import globals.Dir;

public class Game implements java.io.Serializable {

    private ArrayList<Room> map; // the map - an ArrayList of Rooms    
    public Actor player;  // the player - provides 'first person perspective'
    private Actor captainBota;
    private Actor theAntagonist;
    private Actor beachConquistador1;
    private Actor beachConquistador2;
    private Actor beachSavage1;
    private Actor beachSavage2;
    private Actor villageSavage1;
    private Actor villageSavage2;
    private Actor villageSavage3;
    private Actor villageSavage4;
    private Actor villageSavage5;
    private Actor villageSavage6;
    private Actor villageSavage7;
    private Actor villageSavage8;
    private Actor witchDoctor;
    private Actor Alligator1;
    private Actor Panther1;
    private Actor Panther2;

    public Game() {
        Parser.initVocab();
        initGame();
    }

    private void initGame() {
        this.map = new ArrayList<Room>();
        // --- construct a new adventure ---
        ThingList playerlist = new ThingList("playerlist");

        ThingList CobaPyramid00List         = new ThingList("CobaPyramid00List");
        ThingList CobaAlter01List           = new ThingList("CobaAlter01List");
        ThingList CobaSouthJungle02List     = new ThingList("CobaSouthJungle02List");
        ThingList CobaUnknownShrine03List   = new ThingList("CobaUnknownShrine03List");
        ThingList CobaRiverMouth04List      = new ThingList("CobaRiverMouth04List");
        ThingList Jungle05List              = new ThingList("Jungle05List");
        ThingList Cave06List                = new ThingList("Cave06List");
        ThingList Jungle07List              = new ThingList("Jungle07List");
        ThingList Jungle08List              = new ThingList("Jungle08List");
        ThingList Jungle09List              = new ThingList("Jungle09List");

        ThingList CobaGameCourt10List       = new ThingList("CobaGameCourt10List");
        ThingList CobaSmallPyramid11List    = new ThingList("CobaSmallPyramid11List");
        ThingList Jungle12List              = new ThingList("Jungle12List");
        ThingList Jungle13List              = new ThingList("Jungle13List");
        ThingList CobaRiverCrossing14List   = new ThingList("CobaRiverCrossing14List");
        ThingList Jungle15List              = new ThingList("Jungle15List");
        ThingList Jungle16List              = new ThingList("Jungle16List");
        ThingList Jungle17List              = new ThingList("Jungle17List");
        ThingList Jungle18List              = new ThingList("Jungle18List");
        ThingList EgyptianShip19List        = new ThingList("EgyptianShip19List");

        ThingList Jungle20List              = new ThingList("Jungle20List");
        ThingList Jungle21List              = new ThingList("Jungle21List");
        ThingList Jungle22List              = new ThingList("Jungle22List");
        ThingList Jungle23List              = new ThingList("Jungle23List");
        ThingList CobaRiver24List           = new ThingList("CobaRiver24List");
        ThingList CobaRiver25List           = new ThingList("CobaRiver25List");
        ThingList Jungle26List              = new ThingList("Jungle26List");
        ThingList Jungle27List              = new ThingList("Jungle27List");
        ThingList Trap28List                = new ThingList("Trap28List");
        ThingList Dungeon29List             = new ThingList("Dungeon29List");

        ThingList UnknownShrine30List       = new ThingList("UnknownShrine30List");
        ThingList Jungle31List              = new ThingList("Jungle31List");
        ThingList Jungle32List              = new ThingList("Jungle32List");
        ThingList PantherDen33List          = new ThingList("PantherDen33List");
        ThingList Jungle34List              = new ThingList("Jungle34List");
        ThingList CobaRiver35List           = new ThingList("CobaRiver35List");
        ThingList SavageVillage36List       = new ThingList("SavageVillage36List");
        ThingList Jungle37List              = new ThingList("Jungle37List");
        ThingList Jungle38List              = new ThingList("Jungle38List");
        ThingList Cave39List                = new ThingList("Cave39List");

        ThingList Jungle40List              = new ThingList("Jungle40List");
        ThingList Trap41List                = new ThingList("Trap41List");
        ThingList SavageVillage42List       = new ThingList("SavageVillage42List");
        ThingList Jungle43List              = new ThingList("Jungle43List");
        ThingList Jungle44List              = new ThingList("Jungle44List");
        ThingList Pond45List                = new ThingList("Pond45List");
        ThingList Jungle46List              = new ThingList("Jungle46List");
        ThingList Jungle47List              = new ThingList("Jungle47List");
        ThingList Jungle48List              = new ThingList("Jungle48List");
        ThingList Trap49List                = new ThingList("Trap49List");

        ThingList WitchDoctor50List         = new ThingList("WitchDoctor50List");
        ThingList Jungle51List              = new ThingList("Jungle51List");
        ThingList Jungle52List              = new ThingList("Jungle52List");
        ThingList Spring53List              = new ThingList("Spring53List");
        ThingList UnknownShrine54List       = new ThingList("UnknownShrine54List");
        ThingList Jungle55List              = new ThingList("Jungle55List");
        ThingList Jungle56List              = new ThingList("Jungle56List");
        ThingList PantherDen57List          = new ThingList("PantherDen57List");
        ThingList Jungle58List              = new ThingList("Jungle58List");
        ThingList Jungle59List              = new ThingList("Jungle59List");

        ThingList Jungle60List              = new ThingList("Jungle60List");
        ThingList VikingShip61List          = new ThingList("VikingShip61List");
        ThingList VikingOutpost62List       = new ThingList("VikingOutpost62List");
        ThingList UnknownRiver63List        = new ThingList("UnknownRiver63List");
        ThingList Jungle64List              = new ThingList("Jungle64List");
        ThingList Jungle65List              = new ThingList("Jungle65List");
        ThingList TulumPyramid66List        = new ThingList("TulumPyramid66List");
        ThingList TulumVillage67List        = new ThingList("TulumVillage67List");
        ThingList Jungle68List              = new ThingList("Jungle68List");
        ThingList Beach69List               = new ThingList("Beach69List");

        ThingList Jungle70List              = new ThingList("Jungle70List");
        ThingList Jungle71List              = new ThingList("Jungle71List");
        ThingList Jungle72List              = new ThingList("Jungle72List");
        ThingList UnknownRiver73List        = new ThingList("UnknownRiver73List");
        ThingList Cave74List                = new ThingList("Cave74List");
        ThingList Jungle75List              = new ThingList("Jungle75List");
        ThingList TulumVillage76List        = new ThingList("TulumVillage76List");
        ThingList TulumSmallPyramid77List   = new ThingList("TulumSmallPyramid77List");
        ThingList Beach78List               = new ThingList("Beach78List");
        ThingList Ocean79List               = new ThingList("Ocean79List");

        ThingList Trap80List                = new ThingList("Trap80List");
        ThingList Jungle81List              = new ThingList("Jungle81List");
        ThingList Jungle82List              = new ThingList("Jungle82List");
        ThingList UnknownRiver83List        = new ThingList("UnknownRiver83List");
        ThingList CenoteDasOjos84List       = new ThingList("CenoteDasOjos84List");
        ThingList Jungle85List              = new ThingList("Jungle85List");
        ThingList Beach86List               = new ThingList("Beach86List");
        ThingList Beach87List               = new ThingList("Beach87List");
        ThingList Ocean88List               = new ThingList("Ocean88List");
        ThingList Ocean89List               = new ThingList("Ocean89List");

        ThingList SavageVillage90List       = new ThingList("SavageVillage90List");
        ThingList Jungle91List              = new ThingList("Jungle91List");
        ThingList Jungle92List              = new ThingList("Jungle92List");
        ThingList UnknownRiver93List        = new ThingList("UnknownRiver93List");
        ThingList Jungle94List              = new ThingList("Jungle94List");
        ThingList Beach95List               = new ThingList("Beach95List");
        ThingList Ocean96List               = new ThingList("Ocean96List");
        ThingList Raft97List                = new ThingList("Raft97List");
        ThingList Ship98List                = new ThingList("Ship98List");
        ThingList Ocean99List               = new ThingList("Ocean99List");

        Room CobaPyramid00          = new Room();
            CobaPyramid00List.add(new Thing("Amulet", "The Amulet", CobaPyramid00));
        Room CobaAlter01            = new Room();
        Room CobaSouthJungle02      = new Room();
        Room CobaUnknownShrine03    = new Room();
        Room CobaRiverMouth04       = new Room();
        Room Jungle05               = new Room();
        Room Cave06                 = new Room();
        Room Jungle07               = new Room();
        Room Jungle08               = new Room();
        Room Jungle09               = new Room();
            Jungle09List.add(new Thing("Egyptian Tablet top left corner", "A portion of an artifact. Could there be more?", Jungle09));

        Room CobaGameCourt10        = new Room();
        Room CobaSmallPyramid11     = new Room();
        Room Jungle12               = new Room();
        Room Jungle13               = new Room();
            Jungle13List.add(new Thing("Nordic etched blade shard", "A portion of an artifact. Could there be more?", Jungle13));
        Room CobaRiverCrossing14    = new Room();
        Room Jungle15               = new Room();
        Room Jungle16               = new Room();
        Room Jungle17               = new Room();
        Room Jungle18               = new Room();
        Room EgyptianShip19         = new Room();

        Room Jungle20               = new Room();
            Jungle20List.add(new Thing("Egyptian Tablet bottom right corner", "A portion of an artifact. Could there be more?", Jungle20));
        Room Jungle21               = new Room();
        Room Jungle22               = new Room();
        Room Jungle23               = new Room();
        Room CobaRiver24            = new Room();
        Room CobaRiver25            = new Room();
        Room Jungle26               = new Room();
        Room Jungle27               = new Room();
        Room Trap28                 = new Room();
        Room Dungeon29              = new Room();

        Room UnknownShrine30        = new Room();
        Room Jungle31               = new Room();
        Room Jungle32               = new Room();
            Jungle32List.add(new Thing("Egyptian Tablet top right corner", "A portion of an artifact. Could there be more?", Jungle32));
        Room PantherDen33           = new Room();
            PantherDen33List.add(new Thing("cat stone", "A stone, carved into the shape of a cat. It appears.", PantherDen33));
        Room Jungle34               = new Room();
        Room CobaRiver35            = new Room();
        Room SavageVillage36        = new Room();
        Room Jungle37               = new Room();
        Room Jungle38               = new Room();
        Room Cave39                 = new Room();

        Room Jungle40               = new Room();
        Room Trap41                 = new Room();
        Room SavageVillage42        = new Room();
        Room Jungle43               = new Room();
        Room Jungle44               = new Room();
        Room Pond45                 = new Room();
            Pond45List.add(new Thing("Nordic etched blade shard", "A portion of an artifact. Could there be more?", Pond45));
        Room Jungle46               = new Room();
        Room Jungle47               = new Room();
        Room Jungle48               = new Room();
        Room Trap49                 = new Room();

        Room WitchDoctor50          = new Room();
        Room Jungle51               = new Room();
            Jungle51List.add(new Thing("Egyptian Tablet bottom left corner", "A portion of an artifact. Could there be more?", Jungle51));
        Room Jungle52               = new Room();
        Room Spring53               = new Room();
        Room UnknownShrine54        = new Room();
            UnknownShrine54List.add(new Thing("lizard stone", "A stone, carved into the shape of a lizard. It seems very old.", UnknownShrine54));
        Room Jungle55               = new Room();
        Room Jungle56               = new Room();
        Room PantherDen57           = new Room();
            PantherDen57List.add(new Thing("panther stone", "A stone, carved into the shape of a panther. How long has it been here?", PantherDen57));
        Room Jungle58               = new Room();
            Jungle94List.add(new Thing("vines", "Thick vines, good for making rope", Jungle58));
        Room Jungle59               = new Room();
            Jungle59List.add(new Thing("wood", "A log of Royal Palm wood", Jungle59));

        Room Jungle60               = new Room();
            Jungle60List.add(new Thing("vines", "Thick vines, good for making rope", Jungle60));
            Jungle60List.add(new Thing("palm-leaves", "Large leaves, fallen from the Royal Palms overhead", Jungle60));
        Room VikingShip61           = new Room();
        Room VikingOutpost62        = new Room();
        Room UnknownRiver63         = new Room();
        Room Jungle64               = new Room();
            Jungle64List.add(new Thing("wood", "A log of Royal Palm wood", Jungle64));
        Room Jungle65               = new Room();
            Jungle65List.add(new Thing("palm-leaves", "Large leaves, fallen from the Royal Palms overhead", Jungle65));
        Room TulumPyramid66         = new Room();
        Room TulumVillage67         = new Room();
        Room Jungle68               = new Room();
            Jungle68List.add(new Thing("wood", "A log of Royal Palm wood", Jungle68));
        Room Beach69                = new Room();
            Beach69List.add(new Thing("sand", "A handful of sand", Beach69));
            Beach69List.add(new Thing("Nordic etched pole", "A portion of an artifact. Could there be more?", Beach69));

        Room Jungle70               = new Room();
            Jungle70List.add(new Thing("wood", "A log of Royal Palm wood", Jungle70));
            Jungle70List.add(new Thing("palm-leaves", "Large palm leaves", Jungle70));
        Room Jungle71               = new Room();
            Jungle71List.add(new Thing("vines", "Thick vines, good for making rope", Jungle71));
        Room Jungle72               = new Room();
            Jungle72List.add(new Thing("palm-leaves", "Large palm leaves", Jungle72));
        Room UnknownRiver73         = new Room();
        Room Cave74                 = new Room();
        Room Jungle75               = new Room();
            Jungle72List.add(new Thing("wood", "A log of Royal Palm wood", Jungle72));
            Jungle72List.add(new Thing("vines", "Thick vines, good for making rope", Jungle72));
            Jungle72List.add(new Thing("palm-leaves", "Large leaves, fallen from the Royal Palms overhead", Jungle72));
        Room TulumVillage76         = new Room();
        Room TulumSmallPyramid77    = new Room();
        Room Beach78                = new Room();
            Beach78List.add(new Thing("sand", "A handful of sand", Beach78));
            Beach78List.add(new Thing("sea shell", "A shell from the sea. Bright and colorful", Beach78));
        Room Ocean79                = new Room();
            Ocean79List.add(new Thing("salt water", "A handful of salty water", Ocean79));
            Ocean79List.add(new Thing("barracuda", "A Barracuda", Ocean79));

        Room Trap80                 = new Room();
            Trap80List.add(new Thing("skeleton", "The remains of someone fallen to the trap!", Trap80));
        Room Jungle81               = new Room();
            Jungle81List.add(new Thing("wood", "A log of Royal Palm wood", Jungle81));
            Jungle81List.add(new Thing("vines", "Thick vines, good for making rope", Jungle81));
            Jungle81List.add(new Thing("palm-leaves", "Large leaves, fallen from the Royal Palms overhead", Jungle81));
        Room Jungle82               = new Room();
            Jungle82List.add(new Thing("wood", "A log of Royal Palm wood", Jungle82));
        Room UnknownRiver83         = new Room();
            UnknownRiver83List.add(new Thing("fresh water", "fresh drinkable water", UnknownRiver83));
        Room CenoteDasOjos84        = new Room();
            CenoteDasOjos84List.add(new Thing("The Blue Emerald", "A remarkably blue gem.", CenoteDasOjos84));
            CenoteDasOjos84List.add(new Thing("fresh water", "fresh drinkable water", CenoteDasOjos84));
        Room Jungle85               = new Room();
            Jungle85List.add(new Thing("wood", "A log of Royal Palm wood", Jungle85));
            Jungle85List.add(new Thing("vines", "This vines, good for making rope", Jungle85));
        Room Beach86                = new Room();
            Beach86List.add(new Thing("sand", "A handful of sand", Beach86));
            Beach86List.add(new Thing("sea shell", "A shell from the sea. Bright and colorful", Beach86));
        Room Beach87                = new Room();
            Beach87List.add(new Thing("sand", "A handful of sand", Beach87));
        Room Ocean88                = new Room();
            Ocean88List.add(new Thing("salt water", "A handful of salty water", Ocean88));
        Room Ocean89                = new Room();
            Ocean89List.add(new Thing("salt water", "A handful of salty water", Ocean89));
            Ocean89List.add(new Thing("barracuda", "A Barracuda", Ocean89));

        Room SavageVillage90        = new Room();
            SavageVillage90List.add(new ContainerThing("wooden chest", "a primitive chest", false, false, true, false, new ThingList("WoodenChestList"), SavageVillage90));
            // WoodenChestList.add(new Thing("coconut", "A coconut from a palm tree", null));
            // WoodenChestList.add(new Thing("dagger", "A crude stone dagger", null));
            // WoodenChestList.add(new Thing("orange", "A perfectly ripe orange", null));
        Room Jungle91               = new Room();
            Jungle91List.add(new Thing("moss", "A handful of tree moss", Jungle91));
            Jungle91List.add(new Thing("wood", "A log of Royal Palm wood", Jungle91));
            Jungle91List.add(new Thing("wood", "A log of Royal Palm wood", Jungle91));
        Room Jungle92               = new Room();
            Jungle92List.add(new Thing("Nordic etched pole", "A portion of an artifact. Could there be more?", Jungle92));
            Jungle92List.add(new Thing("wood", "A log of Royal Palm wood", Jungle92));
        Room UnknownRiver93         = new Room();
        Room Jungle94               = new Room();
            Jungle94List.add(new Thing("moss", "A handful of tree moss", Jungle94));
            Jungle94List.add(new Thing("wood", "A log of Royal Palm wood", Jungle94));
            Jungle94List.add(new Thing("vines", "Thick vines, good for making rope", Jungle94));
            Jungle94List.add(new Thing("palm-leaves", "Large leaves, fallen from the Royal Palms overhead", Jungle94));
        Room Beach95                = new Room();
            Beach95List.add(new Thing("sand", "A handful of sand", Beach95));
            Beach95List.add(new Thing("sea shell", "A shell from the sea. Bright and colorful", Beach95));
        Room Ocean96                = new Room();
            Ocean96List.add(new Thing("salt water", "A handful of salty water", Ocean96));
        Room Raft97                 = new Room();
        Room Ship98                 = new Room();
        Room Ocean99                = new Room();
            Ocean99List.add(new Thing("salt water", "A handful of salty water", Ocean99));

        Thing axe               = new Thing("axe", "An axe, constructed from a wooden handle, and a stone blade. For chopping trees", null);
        Thing sword             = new Thing("sword", "a sharp Spanish sword", null);
        Thing flint             = new Thing("flint", "a piece of flint rock", null);
        Thing spear             = new Thing("spear", "A weapon of the natives. A long wooden shaft, and a spear tip made of flint", null);

        //Room(name, description, N, S, W, E, [Up], [Down])
        CobaPyramid00.init(0,0,"The Great Coba Pyramid", "It's beautiful, massive. A step pyramid scraping the sky.", null, CobaAlter01, null, CobaGameCourt10, null, null, CobaPyramid00List);
        CobaAlter01.init(0,1,"The Alter of Coba", "A Shrine of some kind", CobaPyramid00, CobaSouthJungle02, null, CobaSmallPyramid11, null, null, CobaAlter01List);
        CobaSouthJungle02.init(0,2,"Jungle", "The foliage is clearing. There appears to be a massive structure to the north.", CobaAlter01, CobaUnknownShrine03, null, Jungle12, null, null, CobaSouthJungle02List);
        CobaUnknownShrine03.init(0,3,"Unknown Shrine", "A Shrine, but to who? Or what?", CobaSouthJungle02, CobaRiverMouth04, null, Jungle13, null, null, CobaUnknownShrine03List);
        CobaRiverMouth04.init(0,4,"Coba River Mouth", "The river begins here.", CobaUnknownShrine03, CobaRiverMouth04, null, CobaRiverCrossing14, null, null, CobaRiverMouth04List);
        Jungle05.init(0,5,"Jungle", "A dense part of the jungle. No westward passage here.", CobaRiverMouth04, Cave06, null, Jungle15, null, null, Jungle05List);
        Cave06.init(0,6,"Cave", "A dark cave at the western edge of the jungle.", Jungle05, Jungle07, null, Jungle16, null, null, Cave06List);
        Jungle07.init(0,7,"Jungle", "More Jungle. Can't go west from here.", Cave06, Jungle08, null, Jungle17, null, null, Jungle07List);
        Jungle08.init(0,8,"Jungle", "Another part of the jungle. Not able to head west from here.", Jungle07, Jungle09, null, Jungle18, null, null, Jungle08List);
        Jungle09.init(0,9,"Jungle", "More jungle. Very dense. Can't go south. Can't go west.", Jungle08, null, null, EgyptianShip19, null, null, Jungle09List);
        
        CobaGameCourt10.init(1,0,"Coba Court", "A game court of some kind.", null, CobaSmallPyramid11, CobaPyramid00, Jungle20, null, null, CobaGameCourt10List);
        CobaSmallPyramid11.init(1,1,"Coba Minor Pyramid", "", CobaGameCourt10, Jungle12, CobaAlter01, Jungle21, null, null, CobaSmallPyramid11List);
        Jungle12.init(1,2,"Jungle", "The foliage is lightening up. A massive structure rises above the trees to the northwest.", CobaSmallPyramid11, Jungle13, CobaSouthJungle02, Jungle22, null, null, Jungle12List);
        Jungle13.init(1,3,"Jungle", "More trees and vines everywhere", Jungle12, CobaRiverCrossing14, CobaUnknownShrine03, Jungle23, null, null, Jungle13List);
        CobaRiverCrossing14.init(1,4,"Coba River Crossing", "", Jungle13, Jungle15, CobaRiverMouth04, CobaRiver24, null, null, CobaRiverCrossing14List);
        Jungle15.init(1,5,"Jungle", "Thick brush and trees in all directions", CobaRiverCrossing14, Jungle16, Jungle05, CobaRiver25, null, null, Jungle15List);
        Jungle16.init(1,6,"Jungle", "The vines stretch for forever", Jungle15, Jungle17, Cave06, Jungle26, null, null, Jungle16List);
        Jungle17.init(1,7,"Jungle", "The area teems with chirping insects and singing birds", Jungle16, Jungle18, Jungle07, Jungle27, null, null, Jungle17List);
        Jungle18.init(1,8,"Jungle", "The jungle is covered with a variety of trees, from tall and majestic to short and gnarled.", Jungle17, EgyptianShip19, Jungle08, Trap28, null, null, Jungle18List);
        EgyptianShip19.init(1,9,"A Beached Ship", "An ancient wooden ship, unlike any other. How did it get here.", Jungle18, null, Jungle09, Dungeon29, null, null, EgyptianShip19List);
        
        Jungle20.init(2,0,"Jungle", "A treacherous forest", null, Jungle21, CobaGameCourt10, UnknownShrine30, null, null, Jungle20List);
        Jungle21.init(2,1,"Jungle", "The forest is humid and misty", Jungle20, Jungle22, CobaSmallPyramid11, Jungle31, null, null, Jungle21List);
        Jungle22.init(2,2,"Jungle", "A dense grove of trees and vines", Jungle21, Jungle23, Jungle12, Jungle32, null, null, Jungle22List);
        Jungle23.init(2,3,"Jungle", "Dense foliage everywhere", Jungle22, CobaRiver24, Jungle13, PantherDen33, null, null, Jungle23List);
        CobaRiver24.init(2,4,"Coba River", "A river of fresh water. Flowing from the west and turning south here", Jungle23, CobaRiver25, CobaRiverCrossing14, Jungle34, null, null, CobaRiver24List);
        CobaRiver25.init(2,5,"Coba River", "A river flowing from the north and turning east from here", CobaRiver24, Jungle26, Jungle15, CobaRiver35, null, null, CobaRiver25List);
        Jungle26.init(2,6,"Jungle", "Dense vegetation covering the ground and climbing up the trees.", CobaRiver25, Jungle27, Jungle16, SavageVillage36, null, null, Jungle26List);
        Jungle27.init(2,7,"Jungle", "A dense grove of trees and vines", Jungle26, Trap28, Jungle17, Jungle37, null, null, Jungle27List);
        Trap28.init(2,8,"Trap!", "A pit!", Jungle27, Dungeon29, Jungle18, Jungle38, null, null, Trap28List);
        Dungeon29.init(2,9,"A Dungeon", "", Trap28, null, EgyptianShip19, Cave39, null, null, Dungeon29List);
        
        UnknownShrine30.init(3,0,"A Shrine", "", null, Jungle31, Jungle20, Jungle40, null, null, UnknownShrine30List);
        Jungle31.init(3,1,"Jungle", "The area teems with chirping insects and singing birds", UnknownShrine30, Jungle32, Jungle21, Trap41, null, null, Jungle31List);
        Jungle32.init(3,2,"Jungle", "A forest with a wide variety of plants and animals", Jungle31, PantherDen33, Jungle22, SavageVillage42, null, null, Jungle32List);
        PantherDen33.init(3,3,"Panther Den!", "", Jungle32, Jungle34, Jungle23, Jungle43, null, null, PantherDen33List);
        Jungle34.init(3,4,"Jungle", "A lush, green landscape filled with towering trees and vines", PantherDen33, CobaRiver35, CobaRiver24, Jungle44, null, null, Jungle34List);
        CobaRiver35.init(3,5,"Coba River", "", Jungle34, SavageVillage36, CobaRiver25, Pond45, null, null, CobaRiver35List);
        SavageVillage36.init(3,6,"Savage Village", "Savages! Best get away quickly", CobaRiver35, Jungle37, Jungle26, Jungle46, null, null, SavageVillage36List);
        Jungle37.init(3,7,"Jungle", "The sun filters through the canopy in dappled shafts of light", SavageVillage36, Jungle38, Jungle27, Jungle47, null, null, Jungle37List);
        Jungle38.init(3,8,"Jungle", "The ground is soft and wet. The trees tower over head", Jungle37, Cave39, Trap28, Jungle48, null, null, Jungle38List);
        Cave39.init(3,9,"Cave", "", Jungle38, null, Dungeon29, Trap49, null, null, Cave39List);
        
        Jungle40.init(4,0,"Jungle", "A dense grove of trees and vines", null, Trap41, UnknownShrine30, WitchDoctor50, null, null, Jungle40List);
        Trap41.init(4,1,"Trap!", "Look out! A net springs fromo the ground up into the trees!", Jungle40, SavageVillage42, Jungle31, Jungle51, null, null, Trap41List);
        SavageVillage42.init(4,2,"Savage Village!", "", Trap41, Jungle43, Jungle32, Jungle52, null, null, SavageVillage42List);
        Jungle43.init(4,3,"Jungle", "A forest with a thick underbrush and tangled vines.", SavageVillage42, Jungle44, PantherDen33, Spring53, null, null, Jungle43List);
        Jungle44.init(4,4,"Jungle", "The canopy blocks out much of the sunlight", Jungle43, Pond45, Jungle34, UnknownShrine54, null, null, Jungle44List);
        Pond45.init(4,5,"Pond", "A beautiful and isolated source of fresh water", Jungle44, Jungle46, CobaRiver35, Jungle55, null, null, Pond45List);
        Jungle46.init(4,6,"Jungle", "Thick brush and trees in all directions", Pond45, Jungle47, SavageVillage36, Jungle56, null, null, Jungle46List);
        Jungle47.init(4,7,"Jungle", "A treacherous forest", Jungle46, Jungle48, Jungle37, PantherDen57, null, null, Jungle47List);
        Jungle48.init(4,8,"Jungle", "Soft, spongy ground covered in organic matter.", Jungle47, Trap49, Jungle38, Jungle58, null, null, Jungle48List);
        Trap49.init(4,9,"Trap!", "Ah!! A massive log swings down from the trees!", Jungle48, null, Cave39, Jungle59, null, null, Trap49List);
        
        WitchDoctor50.init(5,0,"Witch Doctor's Hut", "", null, Jungle51, Jungle40, Jungle60, null, null, WitchDoctor50List);
        Jungle51.init(5,1,"Jungle", "Dense vegetation covering the ground and climbing up the trees.", WitchDoctor50, Jungle52, Trap41, VikingShip61, null, null, Jungle51List);
        Jungle52.init(5,2,"Jungle", "A lush, green landscape filled with towering trees and vines", Jungle51, Spring53, SavageVillage42, VikingOutpost62, null, null, Jungle52List);
        Spring53.init(5,3,"Nature Spring", "", Jungle52, UnknownShrine54, Jungle43, UnknownRiver63, null, null, Spring53List);
        UnknownShrine54.init(5,4,"A Shrine", "A shrine stands alone in the jungle", Spring53, Jungle55, Jungle44, Jungle64, null, null, UnknownShrine54List);
        Jungle55.init(5,5,"Jungle", "More trees and vines everywhere", UnknownShrine54, Jungle56, Pond45, Jungle65, null, null, Jungle55List);
        Jungle56.init(5,6,"Jungle", "Soft, spongy ground covered in organic matter.", Jungle55, PantherDen57, Jungle46, TulumPyramid66, null, null, Jungle56List);
        PantherDen57.init(5,7,"Panther Den!", "", Jungle56, Jungle58, Jungle47, TulumVillage67, null, null, PantherDen57List);
        Jungle58.init(5,8,"Jungle", "A thick canopy that blocks out much of the sunlight", PantherDen57, Jungle59, Jungle48, Jungle68, null, null, Jungle58List);
        Jungle59.init(5,9,"Jungle", "A jungle with a wide variety of plants and animals.", Jungle58, null, Trap49, Beach69, null, null, Jungle59List);
        
        Jungle60.init(6,0,"Jungle", "Soft, spongy ground covered in organic matter.", null, VikingShip61, WitchDoctor50, Jungle70, null, null, Jungle60List);
        VikingShip61.init(6,1,"A Beached Ship", "", Jungle60, VikingOutpost62, Jungle51, Jungle71, null, null, VikingShip61List);
        VikingOutpost62.init(6,2,"Ruined Outpost", "", VikingShip61, UnknownRiver63, Jungle52, Jungle72, null, null, VikingOutpost62List);
        UnknownRiver63.init(6,3,"Unknown River", "", VikingOutpost62, Jungle64, Spring53, UnknownRiver73, null, null, UnknownRiver63List);
        Jungle64.init(6,4,"Jungle", "A treacherous forest", UnknownRiver63, Jungle65, UnknownShrine54, Cave74, null, null, Jungle64List);
        Jungle65.init(6,5,"Jungle", "", Jungle64, TulumPyramid66, Jungle55, Jungle75, null, null, Jungle65List);
        TulumPyramid66.init(6,6,"Tulum Pyramid", "An architectural wonder. Who built it?", Jungle65, TulumVillage67, Jungle56, TulumVillage76, null, null, TulumPyramid66List);
        TulumVillage67.init(6,7,"Tulum Village", "A village, long deserted. Where is everyone?", TulumPyramid66, Jungle68, PantherDen57, TulumSmallPyramid77, null, null, TulumVillage67List);
        Jungle68.init(6,8,"Jungle", "A jungle with a thick underbrush and tangled vines.", TulumVillage67, Beach69, Jungle58, Beach78, null, null, Jungle68List);
        Beach69.init(6,9,"Beach", "", Jungle68, null, Jungle59, Ocean79, null, null, Beach69List);
        
        Jungle70.init(7,0,"Jungle", "The ground is soft and wet. The trees tower over head", null, Jungle71, Jungle60, Trap80, null, null, Jungle70List);
        Jungle71.init(7,1,"Jungle", "Muddy, waterlogged ground", Jungle70, Jungle72, VikingShip61, Jungle81, null, null, Jungle71List);
        Jungle72.init(7,2,"Jungle", "A forest with a wide variety of plants and animals.", Jungle71, UnknownRiver73, VikingOutpost62, Jungle82, null, null, Jungle72List);
        UnknownRiver73.init(7,3,"Unknown River", "", Jungle72, Cave74, UnknownRiver63, UnknownRiver83, null, null, UnknownRiver73List);
        Cave74.init(7,4,"Cave", "", UnknownRiver73, Jungle75, Jungle64, CenoteDasOjos84, null, null, Cave74List);
        Jungle75.init(7,5,"Jungle", "A dense grove of trees and vines", Cave74, TulumVillage76, Jungle65, Jungle85, null, null, Jungle75List);
        TulumVillage76.init(7,6,"Tulum Village", "", Jungle75, TulumSmallPyramid77, TulumPyramid66, Beach86, null, null, TulumVillage76List);
        TulumSmallPyramid77.init(7,7,"Small Pyramid of Tulum", "", TulumVillage76, Beach78, TulumVillage67, Beach87, null, null, TulumSmallPyramid77List);
        Beach78.init(7,8,"Beach", "The sand is coarse and rough and it gets everywhere", TulumSmallPyramid77, Ocean79, Jungle68, Ocean88, null, null, Beach78List);
        Ocean79.init(7,9,"Ocean", "Sea as far as the eye can see", Beach78, null, Beach69, Ocean89, null, null, Ocean79List);

        Trap80.init(8,0,"Trap!", "", null, Jungle81, Jungle70, SavageVillage90, null, null, Trap80List);
        Jungle81.init(8,1,"Jungle", "A lush, green landscape filled with towering trees and vines", Trap80, Jungle82, Jungle71, Jungle91, null, null, Jungle81List);
        Jungle82.init(8,2,"Jungle", "Dense foliage all around", Jungle81, UnknownRiver83, Jungle72, Jungle92, null, null, Jungle82List);
        UnknownRiver83.init(8,3,"Unknown River", "", Jungle82, CenoteDasOjos84, UnknownRiver73, UnknownRiver93, null, null, UnknownRiver83List);
        CenoteDasOjos84.init(8,4,"Cenote Das Ojos", "", UnknownRiver83, Jungle85, Cave74, Jungle94, null, null, CenoteDasOjos84List);
        Jungle85.init(8,5,"Jungle", "a thick canopy that blocks out much of the sunlight", CenoteDasOjos84, Beach86, Jungle75, Beach95, null, null, Jungle85List);
        Beach86.init(8,6,"Beach", "More sand and shore stretching up the coast", Jungle85, Beach87, TulumVillage76, Ocean96, null, null, Beach86List);
        Beach87.init(8,7,"Beach Outpost", "The arrival point", Beach86, Ocean88, TulumSmallPyramid77, Raft97, null, null, Beach87List);
        Ocean88.init(8,8,"Open Ocean", "A vast expanse of saltwater.", Beach87, Ocean89, Beach78, Ship98, null, null, Ocean88List);
        Ocean89.init(8,9,"Open Ocean", "Constant movement of waves and currents", Ocean89, null, Ocean79, Ocean99, null, null, Ocean89List);

        SavageVillage90.init(9,0,"Savage Village", "Natives. Savage!", null, Jungle91, Trap80, null, null, null, SavageVillage90List);
        Jungle91.init(9,1,"Jungle", "Foliage everywhere. Can't pass eastward from here.", SavageVillage90, Jungle92, Jungle81, null, null, null, Jungle91List);
        Jungle92.init(9,2,"Jungle", "Intense jungle environment. Best to keep moving, but can't go east.", Jungle91, UnknownRiver93, Jungle82, null, null, null, Jungle92List);
        UnknownRiver93.init(9,3,"Unknown River", "A river without a name appears to end here.", Jungle92, Jungle94, UnknownRiver83, null, null, null, UnknownRiver93List);
        Jungle94.init(9,4,"Jungle", "The sun filters through the canopy in dappled shafts of light", UnknownRiver93, Beach95, CenoteDasOjos84, null, null, null, Jungle94List);
        Beach95.init(9,5,"Beach", "A lush, green landscape filled with towering trees and vines", Jungle94, Ocean96, Jungle85, null, null, null, Beach95List);
        Ocean96.init(9,6,"Ocean", "", Beach95, Raft97, Beach86, null, null, null, Ocean96List);
        Raft97.init(9,7,"The Raft", "This raft will get back to the expedition ship", Ocean96, Ship98, Beach87, null, null, null, Raft97List);
        Ship98.init(9,8,"The Expedition Ship", "Finally! The ship we arrived on its time to go home", Raft97, Ocean99, Ocean88, null, null, null, Ship98List);
        Ocean99.init(9,9,"Open Ocean", "Salty sea in all  directions", Ship98, null, Ocean89, null, null, null, Ocean99List);

        map.add(CobaPyramid00);
        map.add(CobaAlter01);
        map.add(CobaSouthJungle02);
        map.add(CobaUnknownShrine03);
        map.add(CobaRiverMouth04);
        map.add(Jungle05);
        map.add(Cave06);
        map.add(Jungle07);
        map.add(Jungle08);
        map.add(Jungle09);

        map.add(CobaGameCourt10);
        map.add(CobaSmallPyramid11);
        map.add(Jungle12);
        map.add(Jungle13);
        map.add(CobaRiverCrossing14);
        map.add(Jungle15);
        map.add(Jungle16);
        map.add(Jungle17);
        map.add(Jungle18);
        map.add(EgyptianShip19);

        map.add(Jungle20);
        map.add(Jungle21);
        map.add(Jungle22);
        map.add(Jungle23);
        map.add(CobaRiver24);
        map.add(CobaRiver25);
        map.add(Jungle26);
        map.add(Jungle27);
        map.add(Trap28);
        map.add(Dungeon29);

        map.add(UnknownShrine30);
        map.add(Jungle31);
        map.add(Jungle32);
        map.add(PantherDen33);
        map.add(Jungle34);
        map.add(CobaRiver35);
        map.add(SavageVillage36);
        map.add(Jungle37);
        map.add(Jungle38);
        map.add(Cave39);

        map.add(Jungle40);
        map.add(Trap41);
        map.add(SavageVillage42);
        map.add(Jungle43);
        map.add(Jungle44);
        map.add(Pond45);
        map.add(Jungle46);
        map.add(Jungle47);
        map.add(Jungle48);
        map.add(Trap49);

        map.add(WitchDoctor50);
        map.add(Jungle51);
        map.add(Jungle52);
        map.add(Spring53);
        map.add(UnknownShrine54);
        map.add(Jungle55);
        map.add(Jungle56);
        map.add(PantherDen57);
        map.add(Jungle58);
        map.add(Jungle59);

        map.add(Jungle60);
        map.add(VikingShip61);
        map.add(VikingOutpost62);
        map.add(UnknownRiver63);
        map.add(Jungle64);
        map.add(Jungle65);
        map.add(TulumPyramid66);
        map.add(TulumVillage67);
        map.add(Jungle68);
        map.add(Beach69);

        map.add(Jungle70);
        map.add(Jungle71);
        map.add(Jungle72);
        map.add(UnknownRiver73);
        map.add(Cave74);
        map.add(Jungle75);
        map.add(TulumVillage76);
        map.add(TulumSmallPyramid77);
        map.add(Beach78);
        map.add(Ocean79);

        map.add(Trap80);
        map.add(Jungle81);
        map.add(Jungle82);
        map.add(UnknownRiver83);
        map.add(CenoteDasOjos84);
        map.add(Jungle85);
        map.add(Beach86);
        map.add(Beach87);
        map.add(Ocean88);
        map.add(Ocean89);

        map.add(SavageVillage90);
        map.add(Jungle91);
        map.add(Jungle92);
        map.add(UnknownRiver93);
        map.add(Jungle94);
        map.add(Beach95);
        map.add(Ocean96);
        map.add(Raft97);
        map.add(Ship98);
        map.add(Ocean99);

        // create player and set location
        player              = new Actor("player", "The Spaniard", playerlist, Beach87);
        captainBota         = new Actor("Captain Bota", "Captain of the Spanish Expedition", null, Beach87);
        beachConquistador1  = new Actor("Herrero", "One of Cpt. Bota's men", null, Beach87);
        beachConquistador2  = new Actor("Velez", "Another one of Cpt. Bota's men", null, Beach87);
        theAntagonist       = new Actor("The Antginist", "A mysterious man without a name", null, Beach87);
        beachSavage1        = new Actor("Native savage", "Follower of the mysterious man", null, null);
        beachSavage2        = new Actor("Towering native savage", "A tall, strong protector of the mysterious man", null, null);
        villageSavage1      = new Actor("Village savage", "A savage villager", null, null);
        villageSavage2      = new Actor("Ugly village savage", "A savage with an ugly mug", null, null);
        villageSavage3      = new Actor("Mighty village savage", "An insanely muscular villager", null, null);
        villageSavage4      = new Actor("Scrouny village savage", "A small and scrappy savage villager", null, null);
        villageSavage5      = new Actor("Village savage", "A savage villager", null, null);
        villageSavage6      = new Actor("Rowdy village savage", "A villager with a twisted look in his eye", null, null);
        villageSavage7      = new Actor("Cloaked village savage", "", null, null);
        villageSavage8      = new Actor("Weak village savage", "", null, null);
        witchDoctor         = new Actor("The Witch Doctor", "", null, null);
        Alligator1          = new Actor("Alligator", "", null, null);
        Panther1            = new Actor("Black Panther", "", null, null);
        Panther2            = new Actor("Albino Panther", "", null, null);

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
        Room currentRoom = player.getLocation();
        if(currentRoom.getName().equals("Jungle") || currentRoom.getName().equals("Cave"))
            showStr("You are in the " + player.describeLocation());
        else
            showStr("You are at the " + player.describeLocation());
    }

    // utility method to display string if not empty
    // stripping any trailing newlines
    void showStr(String s) {
        if (s.endsWith("\n")) {
            s = s.substring(0, s.length() - 1);
        }
        if (!s.isEmpty()) {
            try {
                printWithDelays(s, TimeUnit.MILLISECONDS, 2);   
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printWithDelays(String data, TimeUnit unit, long delay)
    throws InterruptedException {
        String ANSI_GREEN = "\u001B[32m";
        for (char ch:data.toCharArray()) {
            System.out.print(ANSI_GREEN + ch);
            unit.sleep(delay);
        }
        System.out.println();
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

    public void showTitle() {
        String intro;
        String ANSI_GREEN = "\u001B[32m";
                                                     
       intro = " _____ ___  ____   ____  ___ _____ _____ _____ _   _ \n"
       + "|  ___/ _ \\|  _ \\ / ___|/ _ |_   _|_   _| ____| \\ | |\n"
       + "| |_ | | | | |_) | |  _| | | || |   | | |  _| |  \\| |\n"
       + "|  _|| |_| |  _ <| |_| | |_| || |   | | | |___| |\\  |\n"
       + "|_|   \\___/|_|  \\_\\____|\\___/ |_|   |_| |_____|_| \\_|\n"
       + "     ____ ___  _   _  ___  _   _ _____ ____ _____   \n"
       + "    / ___/ _ \\| \\ | |/ _ \\| | | | ____/ ___|_   _|  \n"
       + "   | |  | | | |  \\| | | | | | | |  _| \\___ \\ | |    \n"
       + "   | |__| |_| | |\\  | |_| | |_| | |___ ___) || |    \n"
       + "    \\____\\___/|_| \\_|\\__ \\_\\___/|_____|____/ |_|    \n";
                                                            
        System.out.println(ANSI_GREEN + intro);

    }

    Quest quest1 = new Quest("quest1", "\n"

                            + "Head into the jungle and collect wood, vine for rope, and palm leaves for roofing. Return to the beach once you've collected everything");
    
    Quest quest2 = new Quest("quest2", "You are back at the beach, the arrival point.\n"
                            + "Savages line the beach. Captain Bota rests on his knees, bloodied\n"
                            + "\n"
                            + "A man emerges from behind the line of savages, but he does not look like the rest of them\n"
                            + "He looks like you, a man from the east\n"
                            + "The man pulls Captain Bota's head back by his hair. His eyes meet yours\n"
                            + "\n"
                            + "\"You see what happens to unchecked ambition?\", the man says, seemingly to you\n"
                            + "With his other hand, the man draws a dagger across Bota's throat\n"
                            + "Bota's body falls into the sand\n"
                            + "\"Your captain would not cooperate. I'm hoping you will not make the same mistake\"\n"
                            + "\"I think it's time you understand why you are really here\n"
                            + "\n"
                            + "\"You believe you were sent here to tame this land and stake it for Spain, Aye?\n"
                            + "\"I assure you, the men you call leaders in Spain are drunk with power, but they are not fools\"\n"
                            + "\"Do you really think you came all this way for some sand and trees?\"\n"
                            + "\"No\"\n"
                            + "\"You are here for the same reason I am... For the Amulet\"\n"
                            + "\n"
                            + "The man comes closer. Grining, as he takes a cloth from his pocket and wipes his blade of Bota's blood\n"
                            + "\"We'll make good use of you Spaniard\"\n"
                            + "\n"
                            + "\"This jungle holds many secrets, but we are here for only one... and you are going to find it for me\"\n"
                            + "\n"
                            + "\"Deep in this jungle is a sacred place. A palace that rises above the trees. There, you will find my Amulet of Quetzal\"\n"
                            + "\"You bring it here, back to me, and I'll see to it can return to Spain\n"
                            + "\"Until then, I'll wait here and continue to feast all this fine Spanish wine your Captain Bota left me. How I've missed the taste so much\"\n"
                            + "\"Well now, run along Spaniard. I'll be seeing you soon\"\n"
                            + "\n"
                            + "\n Head into the jungle and retreive the Amulet");
                            

    Quest quest3 = new Quest("quest3", "Finally. The Coba pyramid. It's absolutely massive.\n"
                            + "nearly as tall as the Cathedral of Barcelona. Maybe taller!"
                            + "As but where would the Amulet be?\n"
                            + "The stairs, perhaps there is something at the top."
                            + "\n"
                            + "You climb the stairs, well over one hundred in number..."
                            + "\n"
                            + "Incredible. Higher than any point in the forest. The jungle stretches on in every direction."
                            + "There is a door!\n"
                            + "You push but it does not budge.\n"
                            + "there are slots in the door, and engravings above each slot.\n"
                            + "An engraving of a bird.\n"
                            + "An engraving of a lizard.\n"
                            + "And an engraving of a cat.\n"
                            + "\n"
                            + "There must be objects that fit these slots. Maybe once they're placed, the door will open.\n");

    Quest quest4 = new Quest("quest4", "Youve gotten the stones and have returned to the pyramid. You get the Amulet and now need to take it the antaginist");
    Quest quest5 = new Quest("quest5", "Youve returned the amulet to the antaginist on the beach, but he still need to the cento rune to activate it. Go get it");
    Quest quest6 = new Quest("quest6", "Youve gotten the senota stone and have returned in the antaginist. It has undesired affects and he dies. You get his map for Antlatis and set sail for game 2. Game Over");
    String outro = "game over";

    JFrame frame = new JFrame("FORGOTTEN CONQUEST - MAP");

    public void showMap() {
        try{
            //Create Background Image 
            BufferedImage mapImg = ImageIO.read(new File("images/forgottenConquestMap.png"));
            
            //Create and Config JFrame
            
            frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            frame.setSize(515,535);
            frame.setResizable(false);
            frame.setLocationRelativeTo(null);

            //Apply Background Image
            frame.setContentPane(new JLabel(new ImageIcon(mapImg)));

            //Create and Add Player Marker
            BlinkLabel playerMarker = new BlinkLabel("⦿");
            playerMarker.setFont(new Font("Serif", Font.BOLD, 40));
 
            //Convert player location X and Y Coordinate to pixel width and height for player marker map position
            //These values could use some dialing in, so that they are more aligned with the location they are actually in
            int playerMarkerPositionX = (player.getLocation().getRoomXCord() == 0) ? 25 : player.getLocation().getRoomXCord()*50;
            int playerMarkerPositionY = (player.getLocation().getRoomYCord() == 0) ? 26 : player.getLocation().getRoomYCord()*52;

            playerMarker.setBounds(playerMarkerPositionX,playerMarkerPositionY,50,30);
            frame.setLayout(null);
            frame.add(playerMarker);

            frame.pack();
            frame.setVisible(true);
    } catch(Exception e){
        }
    }

    public void showControls() {
        String controls;
        controls =  "\n"
                    + "Controls:\n"
                    + "N:       North\n"
                    + "S:       South\n"
                    + "E:       East\n"
                    + "W:       West\n"
                    + "L:       Look Around\n"
                    + "T:       Take Item\n"
                    + "D:       Drop Item\n"
                    + "save:    Save Game\n"
                    + "load:    Load Game\n"
                    + "help:    Show Controls\n"
                    + "Q:       Quit";
        
        showStr(controls);
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
                showMap();
            }
        }
        return s;
    }

    public String questCheck(String currentQuest){
        switch (currentQuest) {
            case "quest1":
                if(player.describeThings().contains("wood")
                && player.describeThings().contains("vines")
                && player.describeThings().contains("palm-leaves") 
                && player.getLocation().getName().contains("Beach Outpost")){
                    quest1.complete();
                    quest2.begin();
                    currentQuest = quest2.getName();
                    showStr(quest2.getIntro());
                    return currentQuest;
                }
                break;
            case "quest2":
                if(player.getLocation().getName().contains("The Great Coba Pyramid")){
                    quest2.complete();
                    quest3.begin();
                    currentQuest = quest3.getName();
                    showStr(quest3.getIntro());
                    return currentQuest;
                }
                break;
            case "quest3":
                if(player.getLocation().getName().contains("The Great Coba Pyramid") 
                && player.describeThings().contains("Bird Stone") 
                && player.describeThings().contains("Cat Stone") 
                && player.describeThings().contains("Lizard Stone")){
                    quest3.complete();
                    quest4.begin();
                    currentQuest = quest4.getName();
                    showStr(quest4.getIntro());
                    return currentQuest;
                }
                break;
            case "quest4":
                if(player.inventory().contains("Quetzal Amulet") 
                && player.getLocation().getName().contains("Beach Outpost")){
                    quest4.complete();
                    quest5.begin();
                    currentQuest = quest5.getName();
                    showStr(quest5.getIntro());
                    return currentQuest;
                }
                break;
            case "quest5":
                quest5.complete();
                quest6.begin();
                currentQuest = quest6.getName();
                showStr(quest6.getIntro());
                return currentQuest;
            case "quest6":
                quest6.complete();
                showStr(outro);
                return currentQuest;
            default:
                return currentQuest;
        }
        return currentQuest;
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
