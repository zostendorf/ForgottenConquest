package gameobjects;

public class Quest implements java.io.Serializable {
    
    private String name;
    private String intro;
    private boolean hasBegun;
    private boolean hasCompleted;

    public Quest (String aName, String aIntro){
        this.name = aName;
        this.intro = aIntro;
        hasBegun = false;
        hasCompleted = false;
    }

    public String getName(){
        return name;
    }

    public String getIntro(){
        return intro;
    }

    public void begin(){
        hasBegun = true;
    }

    public void complete(){
        hasCompleted = true;
    }
}
