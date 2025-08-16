public class SquareCommand implements Command {
    private int sideLength;

    public SquareCommand(int sideLength) {
        this.sideLength = sideLength;
    }

    public String getName() {
        return "Square";
    }

    public void execute(Turtle turtle) {
        for (int i = 0; i < 4; i++) {
            turtle.moveForward(sideLength);
            turtle.turnRight(90);
        }
    }
}

