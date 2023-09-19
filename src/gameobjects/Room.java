
package gameobjects;

import globals.Dir;

public class Room extends ThingHolder implements java.io.Serializable {

    private int roomXCord;
    private int roomYCord;
    private Room n, s, w, e, up, down;
    private boolean visited;

    public Room() {
        super("New Room", "", null, null); // init superclass
        this.roomXCord = 0;
        this.roomYCord = 0;
        this.n = null;
        this.s = null;
        this.w = null;
        this.e = null;
        this.up = null;
        this.down = null;
    }   
    
    public void init(int roomXCord, int roomYCord, String aName, String aDescription,
            Room aN, Room aS, Room aW, Room aE, Room anUp, Room aDown,
            ThingList tl) {
        setName(aName);
        setDescription(aDescription);
        setRoomXCord(roomXCord);
        setRoomYCord(roomYCord);
        this.n = aN;
        this.s = aS;
        this.w = aW;
        this.e = aE;
        this.up = anUp;
        this.down = aDown;
        setThings(tl);
        visited = false;
    }

    // --- accessor methods ---
    // Room X Coordinate
    public int getRoomXCord() {
        return roomXCord;
    }
    public void setRoomXCord(int roomXCordVal) {
        this.roomXCord = roomXCordVal;
    }    

    // Room Y Coordinate
    public int getRoomYCord() {
        return roomYCord;
    }

    public void setRoomYCord(int roomYCordVal) {
        this.roomYCord = roomYCordVal;
    }   
    
    // n
    public Room getN() {
        return n;
    }

    public void setN(Room aN) {
        this.n = aN;
    }

    // s
    public Room getS() {
        return s;
    }

    public void setS(Room aS) {
        this.s = aS;
    }

    // e
    public Room getE() {
        return e;
    }

    public void setE(Room aE) {
        this.e = aE;
    }

    // w
    public Room getW() {
        return w;
    }

    void setW(Room aW) {
        this.w = aW;
    }

    public Room getUp() {
        return up;
    }

    public void setUp(Room up) {
        this.up = up;
    }

    public Room getDown() {
        return down;
    }

    public void setDown(Room down) {
        this.down = down;
    }

    public void visited(){
        this.visited = true;
    }

    public boolean isVisited(){
        return this.visited;
    }

    public String describe() {
        String roomdesc;
        String thingsdesc;

        roomdesc = String.format("%s. %s.", getName(), getDescription());
        thingsdesc = describeThings();
        if (!thingsdesc.isEmpty()) {
            roomdesc += "\nThings here:\n" + thingsdesc;
        }
        return roomdesc;
    }
}
