public class Location {
    public int coordinateX;
    public int coordinateY;
    public String name;

    public void setCoordinates(int x, int y){
        this.coordinateX = x;
        this.coordinateY = y;
    }

    public void displayCoordinates(){
        System.out.println("["+ coordinateX + "," + coordinateY + "]");
    }

    public void setName(String newName){
        this.name = newName;
    }
    
    public void displayName(){
        System.out.print(name);
    }
}
