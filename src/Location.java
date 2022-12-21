public class Location {
    public int coordinateX;
    public int coordinateY;

    public void setCoordinates(int x, int y){
        this.coordinateX = x;
        this.coordinateY = y;
    }

    public void displayCoordinates(){
        System.out.println("["+ coordinateX + "," + coordinateY + "]");
    }
}
