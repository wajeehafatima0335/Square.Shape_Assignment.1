public class Turtle {
    private Point position;
    private float angle;
    private Pen pen;
    private Canvas canvas;

    public Turtle(Point startPosition, float angle, Canvas canvas ){
        this.position = startPosition;
        this.angle = angle;
        this.canvas  = canvas;
        this.pen = new Pen(startPosition,canvas);
    }
    //change the canvas
    public void setCanvas(Canvas canvas){
        this.pen = new Pen(position,canvas);

    }
    //move forward and draw line
    public void moveForward(int distance){
        int newX = position.getX() + (int) Math.round(distance * Math.cos(Math.toRadians(angle)));
        int newY = position.getY() + (int) Math.round(distance * Math.sin(Math.toRadians(angle)));

    pen.lineTo(newX, newY);
    position = new Point(newX, newY);
    }
    public void moveTo(Point newPosition) {
        this.position = newPosition; // no line drawn
    }
    //turn left by certain degrees
    public void turnLeft(float degrees){
        angle -= degrees;
    }
    //turn right by certain degrees
    public void turnRight(float degrees){
        angle += degrees;
    }
    //get the turtles current position
    public Point getPosition(){
        return position;
    }

}
