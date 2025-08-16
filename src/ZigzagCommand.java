public class ZigzagCommand implements Command{
    private int segmentLength;

    public ZigzagCommand(int segmentLength){
        this.segmentLength = segmentLength;
    }
    public String getName(){
        return "Zigzag";
    }
    public void execute(Turtle turtle){
        for(int i = 0; i<5; i++){
            turtle.moveForward(segmentLength);
            turtle.turnLeft(45);
            turtle.moveForward(segmentLength);
            turtle.turnLeft(90);
        }
    }
}
